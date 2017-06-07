package com.templatemethod;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MemoryMapTest {

	public static long checksumInputStream(Path filename) throws IOException {
		try (InputStream in = Files.newInputStream(filename)) {
			CRC32 crc = new CRC32();
			int c;
			while ((c = in.read()) != -1) {
				crc.update(c);
			}
			return crc.getValue();
		}
	}

	public static long checksumBufferedInputStream(Path filename)
			throws IOException {
		try (InputStream in = new BufferedInputStream(
				Files.newInputStream(filename))) {
			CRC32 crc = new CRC32();
			int c;
			while ((c = in.read()) != -1) {
				crc.update(c);
			}
			return crc.getValue();
		}
	}

	public static long checksumRandomAccessFile(Path filename)
			throws IOException {
		try (RandomAccessFile file = new RandomAccessFile(filename.toFile(),
				"r")) {
			long length = file.length();
			CRC32 crc = new CRC32();
			for (long p = 0; p < length; p++) {
				file.seek(p);
				int c=file.readByte();
				crc.update(c);
			}
			return crc.getValue();
		}
	}

	public static long checksumMappedFile(Path filename) throws IOException {
		try(FileChannel channel=FileChannel.open(filename)){
			CRC32 crc=new CRC32();
			int length=(int)channel.size();
			MappedByteBuffer buffer=channel.map(FileChannel.MapMode.READ_ONLY, 0, length);	
			for (int p = 0; p < length; p++) {
				int c=buffer.get(p);
				crc.update(c);
			}
			return crc.getValue();
		}
	}
	
	public strictfp static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		// TODO Auto-generated method stub
		System.out.println("Input Stream:");
		long starttime=System.currentTimeMillis();
		Path path=Paths.get("D:\\python2.txt");
		long crcvalue=checksumInputStream(path);
		long endtime=System.currentTimeMillis();
		System.out.println(Long.toHexString(crcvalue));
		System.out.println((endtime-starttime)+"ms");
		
		System.out.println("Buffered InputStream:");
		starttime=System.currentTimeMillis();		
		crcvalue=checksumBufferedInputStream(path);
		endtime=System.currentTimeMillis();
		System.out.println(Long.toHexString(crcvalue));
		System.out.println((endtime-starttime)+"ms");
		
		System.out.println("Random Access File:");
		starttime=System.currentTimeMillis();		
		crcvalue=checksumRandomAccessFile(path);
		endtime=System.currentTimeMillis();
		System.out.println(Long.toHexString(crcvalue));
		System.out.println((endtime-starttime)+"ms");
		
		System.out.println("Mapped File:");
		starttime=System.currentTimeMillis();		
		crcvalue=checksumMappedFile(path);
		endtime=System.currentTimeMillis();
		System.out.println(Long.toHexString(crcvalue));
		System.out.println((endtime-starttime)+"ms");
		
		RandomAccessFile file=new RandomAccessFile(new File("config.xml"), "rw");
		//Path path2=Paths.get("D:\\python2.txt");		
		FileChannel channel=file.getChannel();
		FileLock lock=channel.lock();
		if (lock.isValid()) {
			System.out.println("Lock is valid");
		}
		channel.close();
		file.close();
		
		System.out.println("-------------------------------------------");
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(\\w+(\\?|!)?)";
		Pattern p=Pattern.compile(pattern);
		Matcher mat=p.matcher(line);
		while(mat.find()) {
			System.out.println(mat.group());			
		}
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		Document doc=builder.parse(new File("config.xml"));
		Element root=doc.getDocumentElement();
		for (Node child = root.getFirstChild();child!=null;child=child.getNextSibling()) {
			if (child instanceof Element) {
				Element ele=(Element)child;
				System.out.println(ele.getTagName());
			}
		}
		XPathFactory factory2=XPathFactory.newInstance();
		XPath path3=factory2.newXPath();
		try {
			path3.evaluate("root/node/map", doc);
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

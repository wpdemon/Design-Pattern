package com.mediator;


public class MainBoard implements Mediator {

	private CDDriver cdDriver=null;
	private CPU cpu=null;
	private VideoCard videoCard=null;
	private AudioCard audioCard=null;
	
	public void setCdDriver(CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}

	public void setAudioCard(AudioCard audioCard) {
		this.audioCard = audioCard;
	}

	@Override
	public void changed(Colleague c) {
		// TODO Auto-generated method stub
		if(c instanceof CDDriver){
			opeCDDriverReadData((CDDriver)c);
		}else if (c instanceof CPU) {
			opeCPUReadData((CPU)c);
		}
	}

	private void opeCDDriverReadData(CDDriver cd) {
		String data=cd.getData();
		cpu.executeData(data);
	}
	
	private void opeCPUReadData(CPU cpu){
		String videoData=cpu.getVideoData();
		String audioData=cpu.getAudioData();
		videoCard.showData(videoData);
		audioCard.soundData(audioData);
	}
}

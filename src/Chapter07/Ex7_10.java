package Chapter07;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel = 0;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public void setChannel(int channel) {
		prevChannel = this.channel;
		this.channel = channel;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	/*
	 * (1) 알맞은 코드를 넣어 완성하시오.
	 */
	
	void gotoPrevChannel() {
		int tempChannel = this.channel;
		this.channel = prevChannel;
		prevChannel = tempChannel;
	}
}

public class Ex7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}

}

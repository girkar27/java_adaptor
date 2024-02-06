package assignment01;

public class TV {
	public final int MAX_CHANNELS = 700;
	private int channel = 2;

	public void on() {
		System.out.println("TV is on");
	}

	public void off() {
		System.out.println("TV is off");
	}

	public void up() {
		// Note that the TV channel is limited to MAX_CHANNELS
		channel = Math.min(MAX_CHANNELS, channel + 1);
	}

	public void down() {
		// Note that the TV channel cannot go below 2
		channel = Math.max(2, channel - 1);
	}

	public void showChannel() {
		System.out.println("TV Channel is " + channel);
	}

	public void setChannel(int newchannel) {
		channel = newchannel;
		// System.out.println("TV Channel is " + channel);
	}

	public int getChannel() {
		return channel;
		// System.out.println("TV Channel is " + channel);
	}
}

package assignment01;

// Complete the code for the constructor of TVRemote and the method setChannel in TVRemote

// It is really helpful to notice that the methods up() and down() in TV prevent 
// the TV channel from going above its maximum or below 2.

public class TVRemoteObjectAdapter implements TVRemote {
	private TV tv;
	// the remote has to keep its own copy of the TVs channel
	private int tvChannel = 2;

	public TVRemoteObjectAdapter(TV tvIn) {
		tv = tvIn;

		for (int i = 0; i < tv.MAX_CHANNELS - 2; i++) {
			tv.down();
		}
		// put a loop in to make sure the TV at channel 2
		// by calling the the down() method the maximum number of times
		// (use tv.MAX_CHANNELS)
	}

	public void on() {
		tv.on();
		// System.out.println("TV is on");
	}

	public void off() {
		tv.off();
		// System.out.println("TV is off");
	}

	public void channelUp() {
		// Note that the TV channel is limited to MAX_CHANNELS
		tv.up();
		tvChannel = Math.min(tv.MAX_CHANNELS, tvChannel + 1);
	}

	public void channelDown() {
		// Note that the TV channel cannot go below 2
		tv.down();
		tvChannel = Math.max(2, tvChannel - 1);
	}

	// 4 other methods defined in the interface

	public void setChannel(int newChannel) {
		// NOTE if parameter is out of limits, the loops will be infinite
		newChannel = Math.min(newChannel, tv.MAX_CHANNELS);
		newChannel = Math.max(newChannel, 2);

		while (newChannel < tvChannel) {
			tv.down();
			tvChannel--;
		}

		while (newChannel > tvChannel) {
			tv.up();
			tvChannel++;
		}
		// write loops to move the tv to the correct channel.
		// update tvChannel to be newChannel
	}

	public void showChannel() {
		System.out.print("Remote Channel is " + tvChannel + ". ");
	}
}

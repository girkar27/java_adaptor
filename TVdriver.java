package assignment01;

// import assignment01.TVRemoteObjectAdapter;

public class TVdriver {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.on();
		// set TV to be at maximum channel connecting remote.
		for (int i = 0; i < tv.MAX_CHANNELS; i++)
			tv.up();
		tv.showChannel();
		TVRemoteObjectAdapter remote = new TVRemoteObjectAdapter(tv);
		remote.showChannel();
		tv.showChannel();
		remote.setChannel(101);
		remote.showChannel();
		tv.showChannel();
		remote.setChannel(96);
		remote.showChannel();
		tv.showChannel();
		remote.setChannel(0);
		remote.showChannel();
		tv.showChannel();
		remote.setChannel(900);
		remote.showChannel();
		tv.showChannel();
		remote.setChannel(-10);
		remote.showChannel();
		tv.showChannel();
		remote.setChannel(100);
		remote.channelUp();
		remote.showChannel();
		tv.showChannel();
		remote.channelDown();
		remote.showChannel();
		tv.showChannel();
	}
}

/*
 * EXPECTED OUTPUT IS:
 * TV is on
 * TV Channel is 700
 * Remote Channel is 2. TV Channel is 2
 * Remote Channel is 101. TV Channel is 101
 * Remote Channel is 96. TV Channel is 96
 * Remote Channel is 2. TV Channel is 2
 * Remote Channel is 700. TV Channel is 700
 * Remote Channel is 2. TV Channel is 2
 * Remote Channel is 101. TV Channel is 101
 * Remote Channel is 100. TV Channel is 100
 */
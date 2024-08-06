package sec01.exam01;

public abstract class Audio implements RemoteControl {
	int volume;

	@Override
	public void turnon() {
		System.out.println("오디오 켭니다");
	}

	@Override
	public void turnoff() {
		System.out.println("오디오 끕니다");
	}

	@Override
	public void setvolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {

			volume = RemoteControl.MAX_VOLUME;

		} else if (volume < RemoteControl.MIN_VOLUME) {

			volume = RemoteControl.MIN_VOLUME;
		}
		this.volume = volume;

		System.out.println("오디오 현재볼륨: " + this.volume);

	}

	@Override
	public void seach(String Keyword) {
		// TODO Auto-generated method stub
		
	}

}

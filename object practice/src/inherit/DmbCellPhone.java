package inherit;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;            // ��ӵ� �ʵ�
		this.color = color;            // ��ӵ� �ʵ�
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.print("DMB ��� ������ ����ϴ�");
	}
}
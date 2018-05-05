package pattern.Singleton;

/**
 * ���Ե���ģʽ
 * 
 * @author ����
 *
 */
public class DanliDemo {
	public static void main(String[] args) {
		// ������룬���Ϸ����캯�������캯�����ⲻ�ɼ�
		// DanliSample instance= new DanliSample();
		// ��򵥵ĵ���ԭ��
		// ��ȡΨһ���ö���
		DanliSample danli = DanliSample.getInstance();
		danli.showMsg();

		// ����ʽ�̲߳���ȫ
		LanHanNoSyn baohan_instance = LanHanNoSyn.getInstance();
		baohan_instance.showMsg();

		// ����ʽ���̰߳�ȫ
		LanHanSyn lanhan_instance = LanHanSyn.getInstance();
		lanhan_instance.showMsg();

		// ����ʽ���̰߳���
		EHan ehan_instance = EHan.getInstance();
		ehan_instance.showMsg();

		// ˫��У����
		DCL dcl_instance = DCL.getInstance();
		dcl_instance.showMsg();

		// ��̬�ڲ���
		NeiBuLei nei_instance = NeiBuLei.getInstance();
		nei_instance.showMsg();
	}
}

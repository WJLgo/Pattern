package pattern.Singleton;

/**
 * ����ʽ��û��synchronizaed�̲߳���ȫ����ν����ʽ���Ƿָ���ʵ�����Ĺ��̣��������������ж��ھ���ʵ������
 * 
 * @author ����
 *
 */
public class LanHanNoSyn {
	// ����ʽ����������������ͬʱʵ��������˿���ֻ���ڵ�����getInstance()����ʱ�Ŵ�������
	private static LanHanNoSyn instance;

	private LanHanNoSyn() {
	}

	// ʵ�����Ĺ�����getInstance������ʵ�֣��Ӷ���ʹ���������ʱ�ͱ�ʵ����
	public static LanHanNoSyn getInstance() {
		// �жϸõ����Ƿ�ʵ�������ˣ����ûʵ������ʵ������
		if (instance == null) {
			instance = new LanHanNoSyn();
		}
		return instance;
	}

	public void showMsg() {
		System.out.println("����ʽ���̲߳���ȫ");
	}
}

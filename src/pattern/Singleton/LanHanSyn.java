package pattern.Singleton;

/**
 * ����ʽ�̰߳�ȫ��
 * 
 * @author ����
 *
 */
public class LanHanSyn {
	private static LanHanSyn instance;

	private LanHanSyn() {
	}

	// synchronizedͬ��������֤�̰߳�ȫ
	public static synchronized LanHanSyn getInstance() {
		if (instance == null) {
			instance = new LanHanSyn();

		}
		return instance;
	}

	public void showMsg() {
		System.out.println("����ʽ���̰߳�ȫ");
	}
}

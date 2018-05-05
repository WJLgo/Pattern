package pattern.Singleton;

/**
 * �����������ʵ��
 * 
 * @author ����
 *
 */
public class DanliSample {
	// ����һ��������Ķ�������Ϊ˽�У��Ӷ�ʵ���ڲ�˽�д���
	private static DanliSample instance = new DanliSample();

	// �ù�����˽�л��������Ͳ������ڵ������ⱻʵ������
	private DanliSample() {
	}

	// ���ص�����ʵ�����Ķ���
	public static DanliSample getInstance() {
		return instance;
	}

	public void showMsg() {
		System.out.println("�����ļ�ʵ��");
	}
}

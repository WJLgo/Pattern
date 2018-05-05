package pattern.Singleton;

/**
 * ˫��У������ʽ��
 * 
 * @author ����
 *
 */
public class DCL {
//	volatile����ͬ�̷߳��ʺ��޸ĵı���
	private volatile static DCL instance;

	private DCL() {
	};

	public static DCL getInstance() {
		if (instance == null) {
			synchronized (DCL.class) {
				if (instance == null) {
					instance = new DCL();
				}
			}
		}
		return instance;
	}
	public void showMsg(){
		System.out.println("˫��У����");
	}
}

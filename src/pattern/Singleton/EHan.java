package pattern.Singleton;

/**
 * ����ʽ��3������ʽ �Ƿ� Lazy ��ʼ������
 * 
 * �Ƿ���̰߳�ȫ����
 * 
 * ʵ���Ѷȣ���
 * 
 * ���������ַ�ʽ�Ƚϳ��ã������ײ����������� �ŵ㣺û�м�����ִ��Ч�ʻ���ߡ� ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档 ������ classloder
 * ���Ʊ����˶��̵߳�ͬ�����⣬������instance ����װ��ʱ��ʵ��������Ȼ������װ�ص�ԭ���кܶ��֣��ڵ���ģʽ�д�������ǵ��� getInstance
 * ������ ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ���ʱ���ʼ�� instance ��Ȼû�дﵽ lazy loading ��Ч����
 * 
 * @author ����
 *
 */
public class EHan {
	// ���������ʱ���ͻᴴ��ʵ������ռ���ڴ棬�Ƚϳ���
	private static EHan instance = new EHan();

	private EHan() {
	}

	public static EHan getInstance() {
		return instance;
	}

	public void showMsg() {
		System.out.println("����ʽ���̰߳�ȫ");
	}
}

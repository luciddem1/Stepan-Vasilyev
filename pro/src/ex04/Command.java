package ex04;

/** ��������� �������
 * ��� ������;
 * �������: Command,
 * Worker Thread
 * @author Stepan_Vasilyev
 * @version 1.0
 */

public interface Command {
	/** ������ �������; �������: Command, Worker Thread */
	public void execute();
}
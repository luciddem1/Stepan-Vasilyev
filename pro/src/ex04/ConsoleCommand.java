package ex04;

/** ���������
 * ��������� �������;
 * ������ Command
 * @author Stepan_Vasilyev
 * @version 1.0
 */
public interface ConsoleCommand extends Command {
	/** ������ ������ �������;
	 * ������ Command
	 * @return ������ ������ ������
	 */
	public char getKey();
}
package ex01;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ������ ��������� ������ ��� ���������� �� ����������� ����������.
 * 
 * @author Stepan_Vasilyev
 * @version 1.0
 */
public class Calc 
{

	/** ��'� �����, ��� ��������������� �� ��� ����������. */
	private static final String FNAME = "Item2d.bin";

	/** ������� ��������� ���������. ��'��� ����� {@linkplain Item2d} */
	private Item2d result;

	/** �������� {@linkplain Calc#result} */
	public Calc() 
	{
		result = new Item2d();

	}

	/**
	 * ��������� �������� {@linkplain Calc#result}
	 * 
	 * @param result - ���� �������� ��������� �� ��'��� {@linkplain Item2d}
	 */
	public void setResult(Item2d result) 
	{

		this.result = result;
	}

	/**
	 * �������� ��������  {@linkplain Calc#result}
	 * 
	 * @return ������� �������� ��������� �� ��'��� {@linkplain Item2d}
	 */
	public Item2d getResult() 
	{
		return result;
	}

	/**
	 * �������� �������� �������.
	 * 
	 * @param x - �������� ����������� �������.
	 * @return ��������� ����������� ������.
	 */
	private String calc(int x)
	{
        
        String result = "2 -> "+Integer.toBinaryString(x)+"; 8-> "+Integer.toOctalString(x)+"; 16 -> "+Integer.toHexString(x);
        
        
		return result;
	}

	/**
	 * �������� ������� ������� � ������ ���� � ��'��� 
	 * {@linkplain Calc#result}
	 * 
	 * @param x - �������� ����������� ������.
	 */
	public String init(int x)
	{
		result.setX(x);
		return result.setY(calc(x));
	}

	/** �������� ��������� ����������. */
	public void show()
	{
		System.out.println(result);
	}

	/**
	 *������ {@linkplain Calc#result} � ���� {@linkplain Calc#FNAME}
	 * 
	 * @throws IOException
	 */
	public void save() throws IOException
	{
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
		os.writeObject(result);
		os.flush();
		os.close();
	}

	/**
	 * ³������� {@linkplain Calc#result} �� ����� {@linkplain Calc#FNAME}
	 * 
	 * @throws Exception
	 */
	public void restore() throws Exception 
	{
		ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
		result = (Item2d) is.readObject();
		is.close();
	}
}
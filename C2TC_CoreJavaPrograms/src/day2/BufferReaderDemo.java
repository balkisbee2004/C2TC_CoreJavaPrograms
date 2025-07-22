package day2;
import java.io.*;

public class BufferReaderDemo {
	public static void main(String[] args) throws IOException
	{
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String name;
			System.out.println("Enetr the name: ");
			name =br.readLine();
			
			int age;
			System.out.println("Enter the age ");
			age=Integer.parseInt(br.readLine());
			
			float avg;
			System.out.println("Enter the avg: ");
			avg=Float.parseFloat(br.readLine());
			
			System.out.println("Name: "+name+" Age: "+age+" Avg: "+avg);
		}
		
	}
		



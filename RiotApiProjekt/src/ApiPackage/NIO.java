package ApiPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class NIO extends Mainhandler
{
	public NIO(String datei)
	{
		try
		{
			out = new BufferedWriter(new FileWriter(datei));
			in = new BufferedReader(new FileReader(datei));
		}
		catch (Exception e)
		{
			System.out.println(e.getStackTrace());
		}

	}

}

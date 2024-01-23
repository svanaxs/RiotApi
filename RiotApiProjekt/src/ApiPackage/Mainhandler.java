package ApiPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public abstract class Mainhandler
{
	protected BufferedWriter out;
	protected BufferedReader in;

	// Change here
	public void schreiben(ArrayList<ByName> t)
	{
		try
		{
			// Change here
			for (ByName dummy : t)
			{
				//Change here
				out.write(dummy.toString());
				out.newLine();
			}
			out.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getStackTrace());
			System.out.println("Fehler beim Schreiben");
		}
	}

	public void lesen()
	{
		try
		{
			String einlese;
			while ((einlese = in.readLine()) != null)
			{
				
				String[] parts = einlese.split(";");
				
				// Change here
				System.out.println(parts[0] + " " + parts[1]);

				

			}
			in.close();
		}
		catch (Exception e)
		{
			e.getStackTrace();
			System.out.println("Fehler beim Lesen");
		}
	}

}

package xmlMaker;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class xmlMaker {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		readFile("heartRate10.txt");
	} 
	
	public static void readFile(String file) throws FileNotFoundException, IOException{
		String header = "<keyframes>";
		String footer = "</keyframes>";
	    String key1 = "<key>";
        String body = "<easefunc>0</easefunc>\n<easetype>0</easetype>";
        String time1 = "<time>";
        String time2 = "</time>";
        String value1 = "<value>";
        String value2 = "</value>";
        String key2 = "</key>";
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	    String line;
	    int i =0;
	    String mil = "";
	    String s = "";
	    String xml = header;
	    while ((line = br.readLine()) != null) {
	    	int milsec = 40*i%1000;
	    	int sec = 40*i/1000;
	    	if(milsec == 0) mil = "000";
	    	else if(milsec<10) mil = "00"+milsec;
	    	else if(milsec<100) mil = "0"+milsec;
	    	else mil = ""+milsec;
	    	if(sec<10) s = "0"+sec;
	    	else s = ""+sec;
	    	System.out.println(line);
	    	System.out.println(i);
	    	double Amp = Double.parseDouble(line);
	    	String keybody = key1+"\n"+body+"\n"+time1+"\n"+"00:00:"+s+":"+mil+"\n"+time2+"\n"
	    	+value1+"\n"+Amp+"\n"+value2+"\n"+key2;
	    	xml = xml+"\n"+keybody;
	    	i++;
	    }
	    System.out.println(i);
	    xml = xml+"\n"+footer;
	    System.out.println(xml);
	    PrintWriter out = new PrintWriter("XAlpha.txt");
	    out.println(xml);
	    out.close();
	}
	}

}

package nonNeumann;
import nonNeumann.lexer.Lexer;
import nonNeumann.node.Token;

import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String arquivo = "";

			Lexer lexer =
					new Lexer(
							new PushbackReader(  
									new FileReader(arquivo), 1024)); 
			Token token;
			while((token = lexer.next()) == null) {
				System.out.println(token.getClass());
				System.out.println(" ( "+token.toString()+")");
			}
		}
		catch(Exception e){}
	}
}
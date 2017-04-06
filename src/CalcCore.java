
public class CalcCore {
	public String display="0";
	public String memo="";
	public String operation="";
	public boolean SignWasLast=false;
	public String calculate(){
		try {
			double val1= Double.parseDouble(memo);
			double val2=Double.parseDouble(display);
			double res =0;
			if (operation.equals("+"))
			{
				res=val1+val2;
			}
			if (operation.equals("-"))
			{
				res=val1-val2;
			}
			if (operation.equals("*"))
			{
				res=val1*val2;
			}
			if (operation.equals("/"))
			{
				res=val1/val2;
			}
			return ""+ res;
			
			
		}
		catch (NumberFormatException ex)
		{
			System.out.print(ex.getLocalizedMessage());
		}
		return null;
	}
	public String SymbolEnter(String sym)
	{
		if (sym.equals("0")||sym.equals("1")||sym.equals("2")||
				sym.equals("3")||sym.equals("4")||sym.equals("5")||
				sym.equals("6")||sym.equals("7")||sym.equals("8")||
				sym.equals("9")||sym.equals(".")) {
			if (!SignWasLast)
			{
				if (display.equals("0"))
				{
					display=sym;
				} else
				{
					display=display+sym;
				}
			}
				else
				{
					memo=display;
					display=sym;
					
				}
				SignWasLast=false;
			}
			else
			{
				if (sym.equals("+")||sym.equals("-")||sym.equals("/")||sym.equals("*"))
				{
					SignWasLast=true;
					if (!operation.equals(""))
					{
						display=calculate();
					}
					operation=sym;
				}
				if (sym.equals("=")){
					if (!operation.equals(""))
					{
						display=calculate();
						operation="";
					}
					
				}
			
		}
	
		return null;
		
	}


}

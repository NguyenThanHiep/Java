package QL.CD;

public class ListCD {

	int count;
	CD[] ls;
public ListCD(int n) 
{
	ls= new CD[n];
	count=0;
}
public void tangKT() 
{
		CD[] tam= new CD[ls.length*2];
		System.arraycopy(ls, 0, tam, 0, count);
		ls=tam;
}
public boolean themCD(CD crd) 
{
	if (count==ls.length) 
	{
		tangKT();
	}
	for (int i = 0; i < count; i++) 
	{
		if (ls[i].getMaCD()==crd.getMaCD()) 
		{
			return false;
		}
	}
	ls[count]=crd;
	count++;
	return true;
}

public void inKetQua() 
{
	for (CD cdr : ls) 
	{
		if (cdr!=null) 
		{
			System.out.println(cdr);
		}
	}	
}

public int demCD() 
{
	int demCD=0;
	for (CD cd : ls) 
	{
		if (cd!=null)
		{
			demCD++;
		}
	}
	return demCD;
}

public double thanhTien() 
{
	double thanhTien=0;
	for (CD cd : ls) 
	{
		thanhTien=thanhTien+cd.getGiaThanh();
	}	
	return thanhTien;
}

public void sapXep() 
{
	for (int i = 0; i < count-1; i++) 
	{
		for (int j = i+1; j < count; j++) 
		{
			if (ls[i].getMaCD()>ls[i].getMaCD()) 
			{
				CD tam =ls[i];
				ls[i]=ls[j];
				ls[j]=tam;
			}
		}
	}
}
}

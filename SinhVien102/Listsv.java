package SinhVien102;

public class Listsv {

	int co;
	
	SinhVien[] ls;
	
	
	public Listsv(int n) 
	{
		ls= new SinhVien[n];
		co=0;
	}
	public void tangKT() 
	{
			SinhVien[] tam= new SinhVien[ls.length*2];
			System.arraycopy(ls, 0, tam, 0, co);
			ls=tam;
	}
	public boolean themSV(SinhVien crd) 
	{
		if (co==ls.length) 
		{
			tangKT();
		}
		for (int i = 0; i < co; i++) 
		{
			if (ls[i].getMSV()==crd.getMSV()) 
			{
				return false;
			}
		}
		ls[co]=crd;
		co++;
		return true;
	}

	public void inKetQua() 
	{
		for (SinhVien cdr : ls) 
		{
			if (cdr!=null) 
			{
				System.out.println(cdr);
			}
		}	
	}

	public int demSV() 
	{
		int demSV=0;
		for (SinhVien cd : ls) 
		{
			if (cd!=null)
			{
				demSV++;
			}
		}
		return demSV;
	}

	public void sapXep() 
	{
		for (int i = 0; i < co-1; i++) 
		{
			for (int j = i+1; j < co; j++) 
			{
				if (ls[i].getMSV()>ls[i].getMSV()) 
				{
					SinhVien tam =ls[i];
					ls[i]=ls[j];
					ls[j]=tam;
				}
			}
		}
	}
}

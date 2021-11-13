package QLxe;

import QL.CD.CD;

public class Listxe {

	int co;
	Dangkyxe[] ls;
	
	public Listxe(int n) {
		
		ls = new Dangkyxe[n];
		
		co = 0;
	}
	
	public void Thanhtien() {
		
		double Thanhtien = 1;
		
		for (int i = 0; i < co; i++) {
			
			if (ls[i].getPhanKhoi() < 100) {
				Thanhtien = ls[i].getGiaXe() * (1/100);
			}
			if(ls[i].getPhanKhoi() >= 100 && ls[i].getPhanKhoi() <= 200){
				Thanhtien = ls[i].getGiaXe() * (3/100);
			}
			
			if (ls[i].getPhanKhoi() > 200) {
				Thanhtien = ls[i].getGiaXe() *(5/100);
			}
		}
	
	}
	
	public void sapXep() 
	{
		for (int i = 0; i < co-1; i++) 
		{
			for (int j = i+1; j < co; j++) 
			{
				if (ls[i].getMaXe()>ls[i].getMaXe()) 
				{
					Dangkyxe tam =ls[i];
					ls[i]=ls[j];
					ls[j]=tam;
				}
			}
		}
	}
}

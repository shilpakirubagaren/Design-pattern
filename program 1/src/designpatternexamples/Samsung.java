package designpatternexamples;


class Samsung implements Imobile{
	public void cost(){
		System.out.println("Samsung cost starts from 60000");
	}
	public void picturecapacity()
	{
		System.out.println("Samsung camera capacity starts from  4 Mp");
	}
	
		
	@Override
	public void batterypower() {
		// TODO Auto-generated method stub
		System.out.println("Samsung batterry power starts from 12000 mah");
	}
	}

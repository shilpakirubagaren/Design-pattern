package designpatternexamples;



class Lenovo implements Imobile{
	public void cost()
	{
		System.out.println("lenovo cost starts from  10000");
	}
	public void picturecapacity()
	{
		System.out.println("Lenovo camera capacity starts from 10 Mp");
	
	}
	
    @Override
	public void batterypower() {
		// TODO Auto-generated method stub
		System.out.println("Lenovo battery power starts from 2500 Mah");
	}
	}
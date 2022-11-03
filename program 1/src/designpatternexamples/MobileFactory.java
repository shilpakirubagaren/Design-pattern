package designpatternexamples;


class  MobileFactory{
	public MobileFactory()
	{
	}
		Imobile creationmobile(String type){
			
		Imobile mob=null;
		if("len".equalsIgnoreCase(type))
		{
			mob=new Lenovo();
			System.out.println("Lenovo created");
		}else if("sam".equalsIgnoreCase(type)){
			mob=new Samsung();
			System.out.println("Samsung created");
		}
		return mob;
	}

}


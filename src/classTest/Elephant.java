package classTest;

public class Elephant extends Animal {
	/*
	public Elephant() {   預設自動加上隱形的"空的建構子"
		super();        預設自動加上隱形的"父類別的建構子"
	}
	*/
	
	private String name;
	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}
	
	// JDK 5 : Annotation(標註) 給JAVA編譯器/相關工具/框架看的資訊
	// 這裡是給JAVA編譯器看的資訊
	// 讓編譯器對此方法就是用override的規則做檢查，讓我們的override操作可以馬上給編譯器做確認
	@Override
	public void speak(){
		super.speak();
		System.out.println("name:" + this.name);
	}
	
	// 不會有錯誤提示，因為被編譯器理解成覆載 overload
	// 1個是speak(), 1個就是自己的speak(int data)
	public void speak(int data){
		super.speak();
		System.out.println("name:" + this.name);
	}
	
}

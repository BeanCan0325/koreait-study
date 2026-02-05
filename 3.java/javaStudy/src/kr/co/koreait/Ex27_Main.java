package kr.co.koreait;

public class Ex27_Main {
	public static void main(String[] args) {
		Util m = new Util();
		m.printItem("aa");
		m.printItem(10);
		m.printItem(3.14);
		m.printItem(true);
		
		Box<String> b = new Box<>();
		b.setItem("hi");
		System.out.println(b.getItem());
		
	}
}
class Box<T> {
	private T item;
//		T: Type    E: Element  <K,V> Key, Value
//			- ArrayList<E> : 요소를 제네릭으로 받겠다.
//			- HashMap<K,V>
//			꺽쇠 위치를 기반으로 무슨내용인지 보면됨
		public void setItem(T item) {
			this.item = item;
		}
		public T getItem() {
			return item;
		}
}

class Util {
	public <T> void printItem(T item) {
//		public <T> void printItem(T[] item) { //배열도 됨
		System.out.println("아이템: "+ item);
		
//		<T> : 이 메서드에서 사용할 제네릭 이름은 T를 사용하겠다.
//		만약에 반환을 return 하고싶으면 위에 void에 T
//		public <T> T printItem(T item) {
//		: 즉 제네릭은 자료형을 동적으로 넣어준다. 
//		[제네릭 메서드]
//			- 클래스 안에서 특정 메서드만 제네릭을 사용할 때 하는 방법
//			- <T> : 이 메서드에서 사용할 제네릭의 이름은 T를 사용하겠다.
		
	}
}

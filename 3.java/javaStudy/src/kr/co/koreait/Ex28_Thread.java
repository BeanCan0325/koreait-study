package kr.co.koreait;

public class Ex28_Thread {
	public static void main(String[] args) throws InterruptedException {
//		Ex28_Test t1 = new Ex28_Test("쓰레드1");
//		t1.start(); // 새로운 스레드를 생성하며 실행
//		t1.run(); // 현재 스레드에서 실행
////			  thread : 독립적인 실행 단위 
////			 컨텍스트 스위칭 
//		t1.join();// 비동기
//		System.out.println("스레드1 종료");
//
//		Ex28_Test t2 = new Ex28_Test("쓰레드2");
//		t2.start();
////			단점: 순서 실행이 보장이 안됨
//		t2.join();
////			CPU 코어별로 스레드를 가지고있는데, 1코어 실행 될때 2코어도 일을 하고 있는거
//		System.out.println("스레드2 종료");

//			[동기 vs 비동기]
//			동기: 하나의 작업이 끝날때까지 계속 기다리는거
//			비동기:  작업 1,2 동시에 실행// 빨라서 동시에 하는거로 보이는거
//			컴퓨터 구조 OS 지식이 있어야함
		
		
//		<Thread 클래스 상속받아서 사용할 때>
//		Ex28_Test t1 = new Ex28_Test("쓰레드1");
//		Ex28_Test t2 = new Ex28_Test("쓰레드2");
//		t1.setOther(t2);
//		t2.setOther(t1);
//		
//		t1.start();
//		t2.start();
		
//		<Runnable 인터페이스 구현해서 사용할 때>
//		1. Runnable 을 물려받은 객체 생성
//		Ex28_Test et1 = new Ex28_Test();
//		Ex28_Test et2 = new Ex28_Test();
////		2. Thread 객체 생성
//		Thread t1 = new Thread(et1,"스레드1");
//		Thread t2 = new Thread(et2,"스레드2");
//		
//		et1.setOther(t2);
//		et1.setOther(t1);
//		
//		t1.start();
//		t2.start();
		

		Ex28_1_Counter counter = new Ex28_1_Counter();
		Ex28_1_NumberPrinter np1 = new Ex28_1_NumberPrinter(counter,1,100);
		Ex28_1_NumberPrinter np2 = new Ex28_1_NumberPrinter(counter,1,100);
		
		Thread t1 = new Thread(np1,"쓰레드-1");
		Thread t2 = new Thread(np1,"쓰레드-2");
		
		t1.start();
		t2.start();
		
		
	}
}


// Thread 클래스를 상속받으면 자바에서는 단일 상속만 지원하기 때문에 다른 필요한 클래스 상속받을 수 없다.

class Ex28_Test implements Runnable {
//class Ex28_Test extends Thread {
	private Thread other; // 필드 맨위에
//							그다음 생성자
//							그다음 메서드 쭉
//							getter, setter 쓰는게 룰

//	Ex28_Test(String name) {
//		super(name);
//	}

	@Override
	public void run() {
		System.out.println("쓰레드 시작");
		System.out.println("현재 쓰레드 : " + Thread.currentThread().getName());
	
	
		if(other != null) {
			System.out.println(other.getName() + "쓰레드 종료 기다리는중");
			
			try {
				other.join();
			} catch (InterruptedException e) { // 운영체제: InterruptedException -> 컴퓨터가 보내는 신호? 
				e.printStackTrace();
			}
			System.out.println(other.getName()+"쓰레드가 종료됨");
		}
	}
	
	public void setOther(Thread other) {
		this.other = other;
	}
}

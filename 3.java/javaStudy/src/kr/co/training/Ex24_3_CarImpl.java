package kr.co.training;

public class Ex24_3_CarImpl implements Ex24_3_Car {

	boolean isRunning = false;
	int speed = 0;

	@Override
	public void start() {
		if (isRunning) {
			System.out.println("자동차가 이미 시작되었습니다.");
		} else {
			isRunning = true;
			System.out.println("자동차가 시작되었습니다.");
		}
	}

	@Override
	public void stop() {

		if (isRunning) {
			isRunning = false;
			speed = 0;
			System.out.println("자동차 정지중.....");
		} else {
			System.out.println("자동차가 이미 정지되어 있습니다.");
		}
	}
	
	@Override
	public void accelerate(int speed) {
		if(isRunning) {
			this.speed += speed;
			System.out.printf("자동차가 %d km/h로 가속 중입니다.\n",this.speed);
		} else {
			System.out.println("자동차가 정지상태입니다. 먼저 출발하세요");
		}
	}
	
	@Override
	public void brak() {
		if(isRunning && speed>0) {
			speed -= 10;
			System.out.println("자동차가 감속중입니다.");
		}else if(speed <=0) {
			System.out.println("자동차가 이미 정지상태입니다.");
		} else {
			System.out.println("자동차가 정지 상태입니다. 먼저 출발하세요");
		}
	}
	
	@Override
	public void getInfo() {
		String status;
		if (isRunning) {
			status = "운행중...";
		} else {
			status = "정지중...";
		}
		System.out.println("===========현재상태============");
		System.out.printf("상태: %s \n속도: %dkm/h \n",status,speed);
		System.out.println("=============================");
	}

}

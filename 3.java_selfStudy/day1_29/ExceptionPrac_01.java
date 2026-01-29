package day1_29;

public class ExceptionPrac_01 {
        public static void main(String[] args) {
            try {
                int[] arr = new int[3];
                arr[5] = 100; // ArrayIndexOutOfBoundsException 발생!

            } catch (ArrayIndexOutOfBoundsException e) {
                // [오류 발생!] 위에서 이미 다 잡혔기 때문에 이 코드는 도달할 수 없음
                System.out.println("배열 인덱스 범위를 벗어났습니다!");
            } catch (Exception e) {
                // 모든 예외의 조상인 Exception이 여기서 다 잡아버림
                System.out.println("알 수 없는 예외 발생: " + e);

            }
        }
    }

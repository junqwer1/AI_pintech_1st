package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums = new int[4]; // int 자료형 변수 4개 생성
        System.out.println(nums); // 배열 시작 지점 주소
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
//        nums[4] = 50; 오류 묶여있는 개수는 0~3 총 4개인데 5번째 칸에 값을 넣으려고 해서

        for (int i = 0; i < 4; i++) {
            System.out.println(nums[i]);
        }

        /*System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);*/

    }
}

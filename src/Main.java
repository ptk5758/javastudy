public class Main {
    public static void main(String[] args) {
        //프로그램 명령어 짜둔게 실행돼는 함수
        // 자바 스터디 라는 프로그램 을 만듬
        //메인 Start 하는지점
        //함수 명령실행!!!!!
        // public static void main 함수 메인함수 실행!!!!
        // sub 함수
        String str = "문자"; //문자열 변수선언 "문자" -> str 라는 이름의 친구에게 삽입
        int num = 5; //정수형 변수선언  5 - > num 이라는 이름의 친구에게 삽입

        String name = "ptk5758";
        int hp = 50;
        int mp = 50;

        System.out.println("아이디 :"+name);
        System.out.println("HP :"+(hp+10));
        System.out.println("MP :"+mp);

        if(hp > 100){
            //참일때 발생하는 코드
            System.out.println("피가 많다");
        } else {
            //참이 아닐때 발생하는 코드
            System.out.println("피가 적다");
        }


    }
}

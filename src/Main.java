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

        /*String name = "ptk5758";
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

        for (int i=0; i<=10; i++){
            for (int j=0; j<=10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }*/

        String[] list = new String[30];
        for(int i=0; i<list.length; i++){
            list[i] = "리스트"+(i+1);
        }
        /*for (String value : list){
            System.out.print(value);
        }*/
        // 0~29 까지의 리스트 가있음
        // 1페이지일때 0~9;
        // 2페이지일때 10~19;
        // 페이지에 출력할 리스트는 10

        // 현재페이지 1
        // /board.html?page=3
        int page_row = 10; //그페이지 에서 출력할 갯수
        int page = 3;
        int list_start = (page*page_row)-page_row;
        for(int i=list_start; i<list_start+page_row; i++){
            System.out.println(list[i]);
        }


    }
}

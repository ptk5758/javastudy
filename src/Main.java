public class Main {
    public static void main(String[] args) {
        String[] arr = new String[10];

        String[] temp = new String[arr.length];

        //값을 할당 해주는 배열 for문
        for(int i=0; i<arr.length; i++){
            arr[i] = (i+1)+"번째";
        }
        for(int i=0; i<arr.length; i++){
            int random = (int) (Math.random()*arr.length); //0~10
            temp[i] = arr[random];
            arr[random] = arr[i];
            arr[i] = temp[i];
        }
        for (String value : arr) {
            System.out.println(value);
        }

    }
}

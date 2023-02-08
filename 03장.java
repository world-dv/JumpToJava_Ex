import java.util.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println("Q1. 평균 점수 구하기 : " + avg(80, 75, 55));
        System.out.println("Q2. 홀수 짝수 판별 : " + discrimination(13));
        System.out.println("Q3. 주민등록번호 나누기 : " + string_divide("881120-1068234"));
        System.out.println("Q4. 주민등록번호 인덱싱 : " + gender("881120-1068234"));
        System.out.println("Q5. 문자열 바꾸기 : " + string_replace("a:b:c:d"));
        System.out.println("Q6. 리스트 역순 정렬하기 : " + list_reverse_sort());
        System.out.println("Q7. 리스트를 문자열로 만들기 : " + list_to_string());
        System.out.println("Q8. 맵에서 값 추출하기 : " + extraction_value());
        System.out.println("Q9. 중복 숫자 제거하기 : " + remove_duplication());
        System.out.print("Q10. 매직 넘버 제거하기 : "); printCoffeePrice(CoffeeType.AMERICANO);
    }
    public static double avg(int ko, int en, int mt) {
        return (ko + en + mt) / 3;
    }
    public static boolean discrimination(int x){
        return (x % 2 == 0);
    }
    public static String string_divide(String s){
        return s.substring(0, 6) + " " + s.substring(7,14);
    }
    public static int gender(String s){
        return s.charAt(7) - '0';
    }
    public static String string_replace(String s){
        return s.replace(":", "#");
    }
    public static ArrayList list_reverse_sort(){
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
        Collections.sort(myList, Collections.reverseOrder());
        return myList;
    }
    public static String list_to_string(){
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        return String.join(" ", myList);
    }
    public static int extraction_value(){
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        return grade.remove("B");
    }
    public static HashSet<Integer> remove_duplication(){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> re_numbers = new HashSet<>(numbers);
        return re_numbers;
    }
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }
    public static void printCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);  // 1: 아메리카노
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }
}

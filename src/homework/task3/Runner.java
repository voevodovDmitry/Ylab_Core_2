package homework.task3;

public class Runner {
    public static void main(String[] args) {


        /*
        Task3
            Реализовать функцию нечеткого поиска
                    fuzzySearch("car", "ca6$$#_rtwheel"); // true
                    fuzzySearch("cwhl", "cartwheel"); // true
                    fuzzySearch("cwhee", "cartwheel"); // true
                    fuzzySearch("cartwheel", "cartwheel"); // true
                    fuzzySearch("cwheeel", "cartwheel"); // false
                    fuzzySearch("lw", "cartwheel"); // false
         */

        String subStr = "lw";
        String str = "cartwheel";

        String[] items = subStr.split("");

        StringBuilder regex = new StringBuilder("");
        for(int i = 0; i < items.length; i++){
            regex.append(".*" + items[i]);
        }
        regex.append(".*");

        System.out.println(regex);

        System.out.println(str.matches(String.valueOf(regex)));

    }
}

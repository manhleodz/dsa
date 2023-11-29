package g.gk.detest.bt2;

public class Main {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        String[] englishWords = {"hello", "goodbye", "cat", "dog"};
        String[] vietnameseWords = {"xin chào", "tạm biệt", "mèo", "chó"};

        dictionary.loadDictionary(englishWords, vietnameseWords);

        DicList<String> englishList = new DicList<>();
        englishList.add("hello");
        englishList.add("cat");
        englishList.add("dog");

        DicList<String> translatedList = dictionary.translate(englishList);

        System.out.print("English List: ");
        for (int i = 0; i < englishList.size(); i++) {
            System.out.print(englishList.get(i) + " ");
        }
        System.out.print("\nTranslated List: ");
        for (int i = 0; i < translatedList.size(); i++) {
            System.out.print(translatedList.get(i) + " ");
        }
    }
}

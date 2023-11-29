package g.gk.detest.bt2;

public class Dictionary {

    private DicList<String> englishList;
    private DicList<String> vietnameseList;

    public Dictionary() {
        englishList = new DicList<>();
        vietnameseList = new DicList<>();
    }

    public void loadDictionary(String[] en, String[] vi) {
        for (String word : en) {
            englishList.add(word);
        }

        for (String word : vi) {
            vietnameseList.add(word);
        }
    }

    public DicList<String> translate(DicList<String> en) {
        DicList<String> translatedList = new DicList<>();

        for (int i = 0; i < en.size(); i++) {
            String englishWord = en.get(i);
            int index = englishList.indexOf(englishWord);

            if (index != -1) {
                String vietnameseWord = vietnameseList.get(index);
                translatedList.add(vietnameseWord);
            }
        }

        return translatedList;
    }

    public void getVN() {

        for (int i = 0; i < vietnameseList.size(); i++) {
            System.out.print(vietnameseList.get(i) + " ");
        }
    }

    public void getEN() {

        for (int i = 0; i < englishList.size(); i++) {
            System.out.print(englishList.get(i) + " ");
        }
    }
}

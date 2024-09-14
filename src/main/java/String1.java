package src.main.java;

public class StringUtils {
    public static void main(String[] args) {
        StringUtils s = new StringUtils();
        System.out.println(s.helloName("Bob"));
        System.out.println(s.makeAbba("Hi", "Bye"));
        System.out.println(s.makeTags("i", "Yay"));
        System.out.println(s.makeOutWord("<<>>", "Yay"));
        System.out.println(s.extraEnd("Hello"));
        System.out.println(s.firstTwo("Hello"));
        System.out.println(s.withoutEnd("Hello"));
        System.out.println(s.comboString("hi", "Hello"));
        System.out.println(s.middleThree("Candy"));
        System.out.println(s.extraFront("Hello"));
        System.out.println(s.left2("Hello"));
        System.out.println(s.hasBad("badxx"));
        System.out.println(s.conCat("abc", "cat"));
        System.out.println(s.minCat("Hello", "Hi"));
        System.out.println(s.withoutX("xHix"));
        System.out.println(s.deFront("Hello"));
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        String lastTwoChars = str.substring(str.length() - 2);
        return lastTwoChars + lastTwoChars + lastTwoChars;
    }

    public String firstTwo(String str) {
        return str.length() < 2 ? str : str.substring(0, 2);
    }

    public String withoutEnd(String str) {
        return str.length() < 2 ? "" : str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        return a.length() < b.length() ? a + b + a : b + a + b;
    }

    public String middleThree(String str) {
        int midIndex = str.length() / 2;
        return str.substring(midIndex - 1, midIndex + 2);
    }

    public String extraFront(String str) {
        String front = str.length() < 2 ? str : str.substring(0, 2);
        return front + front + front;
    }

    public String left2(String str) {
        return str.length() <= 2 ? str : str.substring(2) + str.substring(0, 2);
    }

    public boolean hasBad(String str) {
        return str.length() >= 3 && (str.startsWith("bad") || str.substring(1).startsWith("bad"));
    }

    public String conCat(String a, String b) {
        if (a.isEmpty()) return b;
        if (b.isEmpty()) return a;
        return a.charAt(a.length() - 1) == b.charAt(0) ? a + b.substring(1) : a + b;
    }

    public String minCat(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if (lenA > lenB) {
            a = a.substring(lenA - lenB);
        } else {
            b = b.substring(lenB - lenA);
        }
        return a + b;
    }

    public String withoutX(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public String deFront(String str) {
        String result = "";
        if (str.length() > 0 && str.charAt(0) == 'a') {
            result += 'a';
        }
        if (str.length() > 1 && str.charAt(1) == 'b') {
            result += 'b';
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }
        return result;
    }
}

// output 
//Hello Bob!
//HiByeByeHi
//<i>Yay</i>
//<<Yay>>
//lololo
//He
//ell
//hiHellohi
//and
//HeHeHe
//lloHe
//true
//abcat
//loHi
//Hi
//llo
    

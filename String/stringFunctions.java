package String;

public class stringFunctions {
    static void main() {
        String name = "dhruv maurya";
        String str =name.toUpperCase();
        System.out.println(str);
        String namecopy= name ;
        System.out.println(namecopy);
        System.out.println(name.charAt(6));
        System.out.println(name.length());
        System.out.println(name.indexOf('m'));
        System.out.println(name.lastIndexOf('a'));

        char ch[] = name.toCharArray();
        System.out.println(ch);
        String name2 = "dhruv mauryaa";
        System.out.println(name.compareTo(name2));
        String name3="  utkash  ";
        System.out.println(name3.trim());

        System.out.println(name.startsWith("dhruv"));
        System.out.println(name.substring(5));
        String strArr ="lucknow , delhi, pune , hydrabad";
        String arr[] =strArr.split(",");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
    }

}

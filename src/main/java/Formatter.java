public class Formatter {

    public static String stringf(String text, Object... args) {
        if(args == null) return  text;
        if(args.length == 0) return  text;

        String res = text;
        for(Object arg : args) res = Replace.first(res, "%v", arg.toString());

        return res;
    }

    public static void printf(String text, Object... args) {
        System.out.print(stringf(text, args));
    }

    public static void printfln(String text, Object... args) {
        System.out.println(stringf(text, args));
    }

}

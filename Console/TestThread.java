class TwoStrings{
    synchronized static void print(String str1, String str2){
        System.out.print(str1 + " ");
        try{
            Thread.sleep(100);
        } catch(InterruptedException e){}
        System.out.println(str2);
    }
}
class PrintStringsThread implements Runnable
{
    Thread t;
    String s1, s2;
    PrintStringsThread(String str1, String str2){
        s1 = str1; s2 = str2;
        t = new Thread(this);
        t.start();    
    }
    public void run(){
        TwoStrings.print(s1, s2);
    }
}
class TestThread{
    public static void main(String[] args) {
        new PrintStringsThread("Java", "fact!");
        new PrintStringsThread("These", "strings");
        new PrintStringsThread("are", "synchronized");
    }
}
package TypeShells;

public class TypeShells {
    // Всего в Java восемь примитивных типов данных:
    // byte,short,int,long,float,double,boolean,char
    // А так же в Java есть ссылочные типы данных:
    // это типы которые уже есть в Java или которые мы создали сами
    // бывают случаи когда необходимо ипользовать примитивы как ссылочный тип данных

    int a = 5;
    //Старайся создавать меньше ссылочных типов так как из за этого страдает память
    Byte b;
    Short sh;
    Integer i;
    Long l;
    Float f;
    Double d;
    Boolean boo;
    Character ch;


    //Где это может пригодиться?
    // У нас есть 2 переменные типа String есть их сложить получим 10002000
    // Что делать если нам нужно преобразовать строку в число?
    public static void main(String[] args) {
        String s = "1000";
        String s2 = "2000";
        //такие методы есть практически во всех типах (parseDouble) и т.д.
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s2);
        System.out.println(s+s2);
        System.out.println(a+b);



        String s1 = "This is John. He is 27 years old!";
        //метод обрезает строку
        String name = s1.substring(8, 12);
        System.out.println(name);
    }

}

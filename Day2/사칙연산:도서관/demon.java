public class demon {


    public static void main(String[] args) {
//               int random1  =(int) (Math.random()*6)+1;
//               int random2  =(int) (Math.random()*6)+1;
//
//               Dice dice1 = new Dice(random1);
//               Dice dice2 = new Dice(random2);
//
//               System.out.println("주사위의 합 ="+DiceCalculator.addDice(first,second));
//               String str ="abcdefg";
//
//               int val = (int) (Math.random() * str.length());
//               System.out.println(DiceCalculator.getIndexOf(val));
//
//               int random4 =(int) (Math.random()*6)+1;
//               Dice dice = new Dice(random4);
//               System.out.println("주사위 눈이("+random4+") 홀수 :"+ DiceCalculator.odd(dice));


        Library library = new Library(5);

        library.add("해리포터");
        library.add("샬럿의 거미줄");
        try{
        library.add("샬럿의 거미줄");}catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
        try{library.delete("스파이더맨");}
        catch (IllegalArgumentException exception){
            System.out.println((exception.getMessage()));
        }
        library.delete("해리포터");
        library.find("샬럿의 거미줄");
        library.find("이게 뭐야");
        library.findAll();
        library.add("1");
        library.add("2");
        library.add("3");
        library.add("4");
        library.findAll();
    }
}

import java.util.Arrays;

public class Library {
    private  String [] list;
    private  int count;
    public Library(int size) {
        if (size<=0) {
            throw new IllegalArgumentException("도서관 크기는 1보다 작은 값을 넗을 수 없습니다.");
        }
        list = new String[size];
        count = 0;

        for (int i =0; i < size; i++){
            list[i] = "";
        }
    }

    public void add(String title) {
        if (count == list.length)
            throw new IllegalArgumentException("책장이 찻습니다.");

        for (int i=0; i < list.length;i++){
            if(list[i].equals(title)){
                throw new IllegalArgumentException("이미 있는 책입니다");
            }

        }
        list[count]= title;
        count+=1;

        System.out.println("["+title+"] 책을 추가합니다.");
    }

    public void delete(String title) {
        if (count ==0){
            System.out.println("책장이 비어서 책을 지울 수 없습니다.");
        }

        for (int i =0; i < list.length;i++){
            if(list[i].equals(title)){
                for (int j = i; j < list.length; i++){
                    list[j] = list [j+1];
                }
                list[list.length -1]="";
                count -=1;
                return;
            }
        }
        throw new IllegalArgumentException("없는 ["+title+"] 책을 지울 수 없습니다.");
    }

    public void find(String title) {

        for (int i =0; i< list.length; i++){
            if(list[i].equals(title)){
                System.out.println("책 검사 결과:"+title);
                return;}
        }
        System.out.println("검색 결과가 없습니다.");

    }

    public void findAll() {
        System.out.println("모든 책 출력:");
        System.out.println("=================");
        for(int i=0; i < list.length; i++){
            System.out.println(i+"."+list[i]);
        }
        System.out.println("=================");



    }
}

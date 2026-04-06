import java.util.*;




class comp{
    public static void main(String[] args) {

        Comparator <Integer> ref = new Comparator<Integer>() {
            @Override
            
            public int compare(Integer o1, Integer o2) {
                if(o2>o1){
                    return 1; //it will swap
                }else{
                    return -1; //it will not swap
                }
            }
        };
        
        List <Integer> obj = new ArrayList<>();

        obj.add(11);
        obj.add(110);
        obj.add(121);
        obj.add(13);

        

        Collections.sort(obj,ref);
        System.out.println(obj);

        

    }
}
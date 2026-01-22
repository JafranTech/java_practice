interface playable{
    void play();
}

class guitar implements playable{
    @Override
    public void play() {
        System.out.println("guitar sounddd");
    }
}

class piano implements playable{
    @Override
    public void play() {
        System.out.println("piano sounddd");
    }
}

public class interface1 {
    public static void main(String[] args) {
        guitar g = new guitar();
        g.play();

        piano p = new piano();
        p.play();
    }
    
}
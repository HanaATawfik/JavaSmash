import java.util.Arrays;

public class Newsfeed {
    public Newsfeed(){

    }

    public String[] getTopics(){
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        return topics;
    }
}
public class Main {
    public static void main(String[] args) {
        Newsfeed sampleFeed = new Newsfeed();
        String[] topics = sampleFeed.getTopics();
        System.out.println(Arrays.toString(topics));
    }
}
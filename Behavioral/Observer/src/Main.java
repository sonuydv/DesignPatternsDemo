import java.util.*;

public class Main{
	public static void main(String[] args){
	  News news=new News();
		news.attachObserver(new Observer(){
				@Override
				public void onStateChanged(String news){
					System.out.println("Subscriber1 gets "+news);
				}  
	  });
		news.attachObserver(new Observer(){
				@Override
				public void onStateChanged(String news){
					System.out.println("Subscriber2 gets "+news);
				}  
			});
		news.attachObserver(new Observer(){
				@Override
				public void onStateChanged(String news){
					System.out.println("Subscriber3 gets "+news);
				}  
			});
		news.attachObserver(new Observer(){
				@Override
				public void onStateChanged(String news){
					System.out.println("Subscriber4 gets "+news);
				}  
			});
	  news.setLatestNews("latest news");
	}
}

import java.util.List;
import java.util.LinkedList;

public class News implements Observable{
	private List<Observer> observers;
	private String latestNews="latest news";
	public News(){
		this.observers=new LinkedList<>();
	}

	public void setLatestNews(String latestNews){
		this.latestNews = latestNews;
		notifyObservers();
	}

	public String getLatestNews(){
		return latestNews;
	}

	@Override
	public void notifyObservers(){
	  for(Observer observer:observers){
		  observer.onStateChanged(this.latestNews);
	  }
	}

	@Override
	public void attachObserver(Observer ob){
		if(observers.contains(ob)) return;
		this.observers.add(ob);
	}

	@Override
	public void detachObserver(Observer ob){
		if(!observers.contains(ob)) return;
		this.observers.remove(ob);
	}

	
}

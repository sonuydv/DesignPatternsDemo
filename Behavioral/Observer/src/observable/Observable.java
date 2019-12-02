interface Observable{
	void notifyObservers();
	void attachObserver(Observer ob);
	void detachObserver(Observer ob);
}

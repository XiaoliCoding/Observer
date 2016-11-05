package Observer;

public class ObserverTest {  
    public static void main(String[] args) {  
         Subject subject = new ConcreteSubject();  
         Observer observer1 = new ConcreteObserver("A");  
         Observer observer2 = new ConcreteObserver("B");  
         Observer observer3 = new ConcreteObserver("C");  
         subject.addObserver(observer1);  
         subject.addObserver(observer2);  
         subject.addObserver(observer3);  
         subject.notifyObserver();  
   }  
}  

package Observer;

import java.util.ArrayList;  
import java.util.List;  
  
public class ConcreteSubject implements Subject {  
    private List<Observer> list = new ArrayList<Observer>();  
      
    public List<Observer> getList() {  
        return list;  
    }  
  
    public void setList(List<Observer> list) {  
        this.list = list;  
    }  
  
    @Override  
    public void addObserver(Observer obs) {  
        list.add(obs);  
    }  
  
    @Override  
    public void notifyObserver() {  
        for(Observer obs:list){  
            obs.update();  
        }  
    }  
  
    @Override  
    public void removeObserver(Observer obs) {  
        list.remove(obs);  
    }  
  
}  
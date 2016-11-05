package Observer;

public class ConcreteObserver implements Observer {  
    private String name;     
    public ConcreteObserver(String name) {  
        super();  
        this.name = name;  
    }  
    @Override  
    public void update() {  
         System.out.println("观察者"+name+":被执行了。。。！");  
    }  
}  

package Observer;

public class ConcreteObserver implements Observer {  
    private String name;     
    public ConcreteObserver(String name) {  
        super();  
        this.name = name;  
    }  
    @Override  
    public void update() {  
         System.out.println("�۲���"+name+":��ִ���ˡ�������");  
    }  
}  

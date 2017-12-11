package company;

public abstract class Worker {
	public String Worker;
	
	public Worker(String Worker){
		this.Worker=Worker;
	}
	
	public abstract int getwage();
	
	public void print(){
		System.out.println(Worker+"的工资为"+getwage());
	}
}

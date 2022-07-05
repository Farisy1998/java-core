package threadgroups;

public class ThreadGroupDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println(Thread.currentThread().getPriority());
		ThreadGroup parent = new ThreadGroup("Parent");	// User-defined Parent thread group
		System.out.println(parent.getName());
		System.out.println(parent.getParent().getName());
		System.out.println(parent.getMaxPriority());
		ThreadGroup child1 = new ThreadGroup(parent, "Child1");	// Child1 thread group, whose
												// parent is Parent Thread Group
		System.out.println(child1.getName());
		System.out.println(child1.getParent().getName());
		ThreadGroup child2 = new ThreadGroup(parent, "Child2");// Child2 thread group, whose
												// parent is also Parent Thread Group
		System.out.println(child2.getName());
		System.out.println(child2.getParent().getName());
		child2.setMaxPriority(4);
		Thread t1 = new Thread(child2, "thread-1");
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t1.getPriority());
	}
}

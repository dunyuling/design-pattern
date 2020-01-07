package com.rc.dp.pattern.create.prototype;

/**
 * @ClassName DeepCopy2
 * @Description 这种方式只能解决一个类引用其他类的深拷贝问题(如DeepCopy引用Worker)
 * 不能解决一个类自我引用的深拷贝问题(如Worker引用Worker)
 * @Author liux
 * @Date 19-11-22 下午7:01
 * @Version 1.0
 */
public class DeepCopy implements Cloneable {

    private String name;
    private Worker worker;

    public static void main(String[] args) throws CloneNotSupportedException {

        DeepCopy deepCopy = new DeepCopy();
        Worker worker = new Worker(1, "liux");
        worker.setFriend(new Worker(2, "zhangsan"));
        deepCopy.setWorker(worker);

        DeepCopy deepCopy2 = (DeepCopy) deepCopy.clone();
        DeepCopy deepCopy3 = (DeepCopy) deepCopy.clone();

        System.out.println("deepCopy: " + deepCopy.hashCode() + "\t worker: " + deepCopy.getWorker().hashCode() + "\t worker's friend: " + deepCopy.getWorker().getFriend().hashCode());
        System.out.println("deepCopy2: " + deepCopy2.hashCode() + "\t worker: " + deepCopy2.getWorker().hashCode() + "\t worker2's friend: " + deepCopy2.getWorker().getFriend().hashCode());
        System.out.println("deepCopy3: " + deepCopy3.hashCode() + "\t worker: " + deepCopy3.getWorker().hashCode() + "\t worker3's friend: " + deepCopy3.getWorker().getFriend().hashCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCopy deepCopy = (DeepCopy) super.clone();
        deepCopy.setWorker((Worker) getWorker().clone());
        return deepCopy;

        //默认实现浅拷贝
//        return super.clone();
    }
}

class Worker implements Cloneable {

    private int id;

    private String name;

    private Worker friend;

    public Worker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker getFriend() {
        return friend;
    }

    public void setFriend(Worker friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


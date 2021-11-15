package BT_QLNV;

public abstract class Staff {
    int age, money, workingDay;
    String name , address, job;
    private int id;
    private static int idNumber = 1;

    public Staff() {
    }

    public Staff( int age, int money, int workingDay, String name, String address, String job) {
        this.id = idNumber++;
        this.age = age;
        this.money = money;
        this.workingDay = workingDay;
        this.name = name;
        this.address = address;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract int getPay();

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", age=" + age +
                ", money=" + money +
                ", workingDay=" + workingDay +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

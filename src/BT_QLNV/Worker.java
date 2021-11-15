package BT_QLNV;

public class Worker extends Staff{
    public Worker() {
    }

    public Worker(int age, int money, int workingDay, String name, String address, String job) {
        super(age, money, workingDay, name, address, job);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "Tên : " + name +
                " - Tuổi : " + age +
                " - Mức lương : " + money +
                " - Địa chỉ : " + address +
                " - Số ngày làm việc : " + workingDay +
                " - Vị trí : " + job +
                " - Tiền lương = " + getPay() +
                " - Id = " + getId() +
                '}';
    }

    @Override
    public int getPay(){
        return this.money*this.workingDay;
    }

}

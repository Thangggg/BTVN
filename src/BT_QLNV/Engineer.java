package BT_QLNV;

public class Engineer extends Staff {
    int coefficient = 2;

    public Engineer() {
    }

    public Engineer(int coefficient) {
        this.coefficient = coefficient;
    }

    public Engineer( int age, int money, int workingDay, String name, String address, String job) {
        super(age, money, workingDay, name, address, job);

    }

    @Override
    public String toString() {
        return "Engineer{" +
                "Tên : " + name +
                " - Tuổi : " + age +
                " - Mức lương : " + money +
                " - Địa chỉ : " + address +
                " - Số ngày làm việc : " + workingDay +
                " - Vị trí : " + job +
                " - Hệ số lương : " + this.coefficient +
                " - Tiền lương = " + getPay() +
                " - Id = " + getId() +
                '}';
    }

    @Override
    public int getPay(){
        return this.money * this.workingDay * this.coefficient;
    }
}

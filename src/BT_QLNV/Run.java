package BT_QLNV;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Staff[] staff = new Staff[3];
        staff[0] = new Worker(15,100,20,"c","Hanoi","woker");
        staff[1] = new Worker(10,100,20,"b","Hanoi","woker");
        staff[2] = new Worker(40,100,20,"a","Hanoi","woker");

        while (true){
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Tìm kiếm theo tên");
            System.out.println("3. Xóa theo tên");
            System.out.println("4. Sửa theo tên");
            System.out.println("5. Hiển thị thông tin của danh sách nhân viên");
            System.out.println("6. Sắp xếp nhân viên theo tên");
            System.out.println("7. Exit");
            int number = sc.nextInt();


            switch (number){
                case 1:
                    System.out.println("1. Thêm Công Nhân");
                    System.out.println("2. Thêm Kĩ Sư");
                    int number2 = sc.nextInt();
                    if (number2 == 1){
                        staff = addStaffWorker(staff);
                    }else if (number2 == 2) {
                        staff = addStaffEngineer(staff);
                    }
                    break;
                case 2:
                    staff = find(staff);
                    break;
                case 3:
                    staff = delete(staff);
                    break;
                case 4:
                    staff = edit(staff);
                    break;
                case 5:
                    display(staff);
                    break;
                case 6:
                    staff = sortArr(staff);
                    break;
                case 7:
                    System.exit(7);
                    break;

            }
        }
    }

    public static Staff[] find (Staff [] staff){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên muốn tìm :");
        String name = sc.next();
        int index = -1;

        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getName().equals(name)){
                index = i;
            }
        }
        System.out.println(staff[index].toString());
        return staff;
    }


    public static void display(Staff[] staff) {
        for (Staff nv : staff) {
            System.out.println(nv.toString());
        }
        System.out.println();
    }

    public static Staff[] edit (Staff [] staff) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào id muốn sửa:");
        int id = sc.nextInt();
        int index = -1;

        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getId() == id){
                index = i;
            }
        }

        System.out.println("Nhập Tên : ");
        String name = sc.next();
        System.out.println("Nhập Tuổi : ");
        int age = sc.nextInt();
        System.out.println("Nhập Địa chỉ : ");
        String address = sc.next();
        System.out.println("Nhập Mức lương cơ bản : ");
        int money = sc.nextInt();
        System.out.println("Nhập Số ngày làm việc : ");
        int workingDay = sc.nextInt();

        staff[index].setName(name);
        staff[index].setAge(age);
        staff[index].setAddress(address);
        staff[index].setMoney(money);
        staff[index].setWorkingDay(workingDay);
        return staff;

    }

    public static Staff[] delete (Staff [] staff) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên muốn xóa: ");
        String str = sc.nextLine();
        int index = -1;

        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getName().equals(str)){
                index = i;
            }else {
                System.out.println("Không tìm thấy tên ");
                return staff;
            }
        }

        for (int i = index; i < staff.length - 1 ; i++) {
            staff[i] = staff[i + 1];
        }

        Staff [] newStaff = new Staff[staff.length - 1];
        for (int i = 0; i < newStaff.length; i++) {
            newStaff[i] = staff[i];
        }
        return newStaff;
    }

    public static Staff[] addStaffEngineer ( Staff[] staff){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tên : ");
        String name = sc.next();
        System.out.println("Nhập Tuổi : ");
        int age = sc.nextInt();
        System.out.println("Nhập Địa chỉ : ");
        String address = sc.next();
        System.out.println("Nhập Mức lương cơ bản : ");
        int money = sc.nextInt();
        System.out.println("Nhập Số ngày làm việc : ");
        int workingDay = sc.nextInt();
        String job = " Kĩ sư";
        Staff engineer  = new Engineer(age,money,workingDay,name,address,job);
        Staff[] newEngineer = new Staff[staff.length + 1];
        for (int i = 0; i < staff.length ; i++) {
            newEngineer[i] = staff[i];
        }
        newEngineer[newEngineer.length -1] = engineer;
        return newEngineer;
    }

    public static Staff[] addStaffWorker ( Staff[] staff) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tên : ");
        String name = sc.next();
        System.out.println("Nhập Tuổi : ");
        int age = sc.nextInt();
        System.out.println("Nhập Địa chỉ : ");
        String address = sc.next();
        System.out.println("Nhập Lương : ");
        int money = sc.nextInt();
        System.out.println("Nhập Số ngày làm việc : ");
        int workingDay = sc.nextInt();
        String job = " Công nhân";
        Staff worker  = new Worker(age,money,workingDay,name,address,job);
        Staff[] newWorker = new Staff[staff.length + 1];
        for (int i = 0; i < staff.length ; i++) {
            newWorker[i] = staff[i];
        }
        newWorker[newWorker.length -1] = worker;
        return newWorker;
    }
    public static Staff[] sortArr(Staff[] staff ){
        Staff temp = staff[0];
        for (int i = 0; i < staff.length-1; i++) {
            for (int j = i+1; j < staff.length; j++) {
                if (staff[i].getName().compareTo(staff[j].getName()) > 0) {
                    temp = staff[j];
                    staff[j] = staff[i];
                    staff[i] = temp;
                }

            }
        }
        return staff;
    }
}

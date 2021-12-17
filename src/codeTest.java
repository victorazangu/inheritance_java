public class codeTest {
    public static void main(String[]args){
        employee employee=new employee();
        lawyer lawyer=new lawyer();
        secretary secretary=new secretary();
        legalSecretary legalSecretary=new legalSecretary();
        marketer marketer= new marketer();

        System.out.println(employee.getVacationDays());
        System.out.println(lawyer.getHours());
        System.out.println(secretary.getVacationDays());
        System.out.println(legalSecretary.getVacationDays());
        System.out.println(marketer.getHours());

    }
}

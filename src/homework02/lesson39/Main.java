package homework02.lesson39;


public class Main {

    public static void main(String[] args) {

        BaseCreditManager[] creditManagers = new BaseCreditManager[]
                {new TeacherCreditManager(), new AgricultureCreditManager(),new StudentCreditManager()};

        for (BaseCreditManager creditManager:creditManagers){

            System.out.println(creditManager.calculate(1000));

        }

    }


}

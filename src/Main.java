public class Main {

    public static void main(String[] args) {
	//task 1
         byte apple=10;
         short a=135;
         int c=12578;
         long d=34446577L;
         float x=1.333333f;
         double y=344.587954;
         char e=105;
         boolean k=15>10;

         //task 2
        double fighterFirst=78.2;
        double fighterSecond=82.7;
        System.out.println("Вес двух бойцов="+(fighterFirst+fighterSecond));
        System.out.println("Разница в весе двух бойцов="+Math.abs(fighterFirst-fighterSecond));

        //task 3
        int banana=80;
        int milk=105;
        int iceCream=100;
        int egg=70;

        int weightGram=banana*5+milk*2+iceCream*2+egg*4;
        System.out.println("Вес в граммах="+weightGram);
        System.out.println("Вес в килограммах="+(double)weightGram/1000);

        //task 4
        int weighDeal=7000;
        int dietFirst=250;
        int dietSecond=500;

        double firstResult=Math.ceil((double)weighDeal/dietFirst);
        System.out.println("Спортсмен сбросит по первой диете 7 кг через="+(int)firstResult+"дней");
        double secondResult=Math.ceil((double)weighDeal/dietSecond);
        System.out.println("Спортсмен сбросит по второй диете 7 кг через="+(int)secondResult+"дней");
        System.out.println("В среднем на диету уйдет="+(firstResult+secondResult)/2+"дней");

        //task 5
        int mashaSalary=67760;
        int denisSalary=83690;
        int kristySalary=76230;

        int newSalaryMasha=mashaSalary+(mashaSalary/10);
        int newSalaryDenis=denisSalary+(denisSalary/10);
        int newSalaryKristy=kristySalary+(kristySalary/10);

        double increasedSalaryMasha=(double) mashaSalary/100*10+mashaSalary;
        double increasedSalaryDenis=(double) denisSalary/100*10+denisSalary;
        double increasedSalaryKristy=(double) kristySalary/100*10+kristySalary;

        System.out.println("Маша будет получать="+(mashaSalary+(mashaSalary/10)));
        System.out.println("Денис будет получать="+(denisSalary+(denisSalary/10)));
        System.out.println("Кристина будет получать="+(kristySalary+(kristySalary/10)));

        System.out.println("Разница в годовом доходе Маши составляет="+(increasedSalaryMasha-mashaSalary)*12);
        System.out.println("Разница в годовом доходе Дениса составляет="+(increasedSalaryDenis-denisSalary)*12);
        System.out.println("Разница в годовом доходе Кристины составляет="+(increasedSalaryKristy-kristySalary)*12);





















    }
}

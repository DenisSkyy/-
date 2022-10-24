public class Main {public static void main(String[] args)
    {
       var firstBoxerWeight =78.2;
       var secondBoxerWeight =82.7;
       var totalWeight = firstBoxerWeight + secondBoxerWeight;
       System.out.println("Общий вес двух боксеров " + totalWeight + " кг");

       var differenceWeight = secondBoxerWeight - firstBoxerWeight;
       System.out.println("Разница между весами боксеров " + differenceWeight + " кг");

       var differenceWeightv2 = secondBoxerWeight % firstBoxerWeight;
       System.out.println("Разница между весами боксеров (версия 2) " + differenceWeightv2 + " кг");

       var workingHours = 640;
       var workingDay = 8;
       var workers = workingHours / workingDay;
       System.out.println("Всего работников в компании – " + workers + " человек");

       var workersNew = workers + 94;
       var workingHoursNew = workersNew * workingDay;
       System.out.println("Если в компании работает " + workersNew + " человек, то всего " +  workingHoursNew + " часов работы может быть поделено между сотрудниками");



    }
}
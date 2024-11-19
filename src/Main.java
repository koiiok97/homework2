//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");

        // Задание 2
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");

        // Задание 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");

        // Задание 4
        var friend = 19;
        System.out.println(friend);

        friend -= 2;
        System.out.println(friend);

        friend /= 7;
        System.out.println(friend);

        System.out.println();

        // Задание 5
        var frog = 3.5;
        System.out.println(frog);

        frog *= 10;
        System.out.println(frog);

        frog /= 3.5;
        System.out.println(frog);

        frog += 4;
        System.out.println(frog);

        System.out.println();

        // Задание 6
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;

        System.out.println("Общая масса двух бойцов: " + (boxerWeight1 + boxerWeight2));
        System.out.println("Разница массы бойцов: " + (boxerWeight2 - boxerWeight1));

        // Задание 7
        System.out.println(boxerWeight2 % boxerWeight1);

        System.out.println();

        // Задание 8
        var totalWorkTime = 640.0;
        var workTime = 8.0;
        var employeeCount = totalWorkTime / workTime;

        System.out.println("Всего работников в компании — " + employeeCount  + " человек");

        employeeCount += 94;
        workTime = totalWorkTime / employeeCount;
        System.out.println("Если в компании работает " + employeeCount + " человек, то всего " + workTime + " часов работы может быть поделено между сотрудниками");
    }
}
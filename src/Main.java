import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(1,
                "HP 2000",
                "Intel 100",
                1024,
                100,
                "Nvidia XT",
                "Windows 7",
                10_000);
        Notebook notebook2 = new Notebook(2,
                "Asus ROG",
                "Intel 500",
                2048,
                1000,
                "Nvidia RTX",
                "Windows 10",
                50_000);
        Notebook notebook3 = new Notebook(3,
                "Dexp",
                "AMD 6",
                4096,
                500,
                "Radeon 6000",
                "Linux",
                30_000);
        Notebook notebook4 = new Notebook(4,
                "No name",
                "Байкал",
                1024,
                100,
                "Integrated",
                "No",
                100_000);
        Notebook notebook5 = new Notebook(1,
                "HP 2000",
                "Intel 100",
                1024,
                100,
                "Nvidia XT",
                "Windows 7",
                10_000);

        Set<Notebook> notebooks = new HashSet<>(Arrays.asList(notebook1,
                notebook2,
                notebook3,
                notebook4,
                notebook5));
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
        filterNotebooks(notebooks);
    }

    public static void filterNotebooks(Set<Notebook> notebooks) {
//        Map<Integer,Integer> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Цена\n" +
                "Введите цифру, соответствующую необходимому критерию: ");
        int criteria = scanner.nextInt();
        System.out.print("Введите минимальное значение: ");
        int minSize = scanner.nextInt();
//        filters.put(criteria, minSize);

        for (Notebook notebook : notebooks) {
            switch (criteria){
                case 1:
                    if (notebook.getRam() >= minSize) {
                        System.out.println(notebook);
                    }
                    break;
                case 2:
                    if (notebook.getHdd() >= minSize) {
                        System.out.println(notebook);
                    }
                    break;
                case 3:
                    if (notebook.getPrice() >= minSize) {
                        System.out.println(notebook);
                    }
                    break;
            }
        }
    }
}
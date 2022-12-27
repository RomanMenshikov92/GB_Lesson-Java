// Урок 6. Хранение и обработка данных ч3: множество коллекций Set
package homework_final_work;

import java.util.*;

public class hw_fw {

   public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
         Notebook note_one = new Notebook("silver", "apple", "macbook pro", 32, 1000, "macos", 1);
         Notebook note_two = new Notebook("black", "asus", "zenbook", 16, 500, "windows", 2);
         Notebook note_three = new Notebook("gray", "hp", "probook 450", 16, 500, "Windows", 3);
         Notebook note_four = new Notebook("brown", "msi", "msi-200", 8, 500, "linux", 4);
         Notebook note_five = new Notebook("white", "acer", "gla100", 8, 250, "linux", 5);
         Notebook note_six = new Notebook("gray", "apple", "macbook air", 8, 250, "macos", 6);
         Notebook note_seven = new Notebook("black", "acer", "gls-500", 32, 500, "windows", 7);
         Notebook note_eight = new Notebook("gray", "msi", "msi-1000", 32, 1000, "Windows", 8);
         Notebook note_nine = new Notebook("green", "apple", "macbook pro", 16, 500, "macos", 9);
         Notebook note_ten = new Notebook("white", "hp", "g7 500", 8, 250, "linux", 10);
         Notebook note_eleven = new Notebook("brown", "asus", "vivabook", 16, 250, "windows", 10);

         List<Notebook> selectNotebook = new ArrayList<Notebook>();
         List<Notebook> res = new ArrayList<Notebook>();
         selectNotebook.add(note_one);
         selectNotebook.add(note_two);
         selectNotebook.add(note_three);
         selectNotebook.add(note_four);
         selectNotebook.add(note_five);
         selectNotebook.add(note_six);
         selectNotebook.add(note_seven);
         selectNotebook.add(note_eight);
         selectNotebook.add(note_nine);
         selectNotebook.add(note_ten);
         selectNotebook.add(note_eleven);
         while (true) {

            System.out.println(
                  "\n1 - RAM\n2 - Объем SDD\n3 - Операционная система\n4 - Цвет\n5 - Производитель\nВведите цифру, соответствующую необходимому критерию:");
            int a = scanner.nextInt();

            switch (a) {
               case 1:
                  scanner.nextLine();
                  System.out.println("Введите минимальный объем RAM включительно: ");
                  int minRAM = scanner.nextInt();
                  System.out.println("Введите максимальный объем RAM включительно: ");
                  int maxRAM = scanner.nextInt();
                  System.out.println("Минимальный объем Ram " + minRAM + ", Максимальный объем RAM " + maxRAM);
                  System.out.println("\nСписок ноутбуков подходящих по параметру:");
                  res = Notebook.getBooksByRam(selectNotebook, minRAM, maxRAM);
                  for (Notebook n : res) {
                     System.out.println(n.toString());
                  }
                  break;
               case 2:
                  scanner.nextLine();
                  System.out.println("Введите минимальный объем sdd включительно: ");
                  int minSDD = scanner.nextInt();
                  System.out.println("Введите максимальный объем sdd включительно: ");
                  int maxSDD = scanner.nextInt();
                  System.out.println("Минимальный объем sdd " + minSDD + ", Максимальный объем sdd " + maxSDD);
                  System.out.println("\nСписок ноутбуков подходящих по параметру:");
                  res = Notebook.getBooksByHdd(selectNotebook, minSDD, maxSDD);
                  for (Notebook n : res) {
                     System.out.println(n.toString());
                  }
                  break;
               case 3:
                  scanner.nextLine();
                  System.out.println("Введите название OS: ");
                  String OS = scanner.nextLine();
                  System.out.println("OS: " + OS);
                  System.out.println("\nСписок ноутбуков подходящих по параметру:");
                  res = Notebook.getBooksByOs(selectNotebook, OS);
                  for (Notebook n : res) {
                     System.out.println(n.toString());
                  }
                  break;
               case 4:
                  scanner.nextLine();
                  System.out.println("Введите цвет: ");
                  String color = scanner.nextLine();
                  System.out.println("Цвет: " + color);
                  System.out.println("\nСписок ноутбуков подходящих по параметру:");
                  res = Notebook.getBooksByColor(selectNotebook, color);
                  for (Notebook n : res) {
                     System.out.println(n.toString());
                  }
                  break;
               case 5:
                  scanner.nextLine();
                  System.out.println("Введите производителя: ");
                  String brand = scanner.nextLine();
                  System.out.println("Производитель: " + brand);
                  System.out.println("\nСписок ноутбуков подходящих по параметру:");
                  res = Notebook.getBooksByVendor(selectNotebook, brand);
                  for (Notebook n : res) {
                     System.out.println(n.toString());
                  }
                  break;
               default:
                  System.out.println("Некорректный ввод");
                  break;
            }
         }
      }
   }
}
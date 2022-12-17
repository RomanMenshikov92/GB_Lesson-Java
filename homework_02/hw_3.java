// 3 *. Дана json строка (можно сохранить в файл и читать из файла)

// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:

// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package homework_02;


public class hw_3 {
    public static void main(String[] args) {
        String JSON_str = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\"," +
                "\"оценка\":\"5\",\"предмет\":\"Физика\"}";

        String last_name = "фамилия";
        String estimation = "оценка";
        String lesson = "предмет";
        String[] last_names = new String[3];
        String[] grades = new String[3];
        String[] lessons = new String[3];

        StringBuilder sb = new StringBuilder();

        String array_str[] = JSON_str.split("},");

        for (int i = 0; i < array_str.length; i++) {
            array_str[i] = array_str[i].replaceAll("\\{", "");
            array_str[i] = array_str[i].replaceAll("}", "");
            array_str[i] = array_str[i].replaceAll(":", "");

        }

        for (int i = 0; i < array_str.length; i++) {

            if (array_str[i].indexOf(last_name) > 0) {
                int strat_index = array_str[i].indexOf(last_name) + 9;
                int end_index = array_str[i].indexOf("\"", strat_index);
                String temp = array_str[i].substring(strat_index, end_index);
                last_names[i] = temp;
            }
            if (array_str[i].indexOf(estimation) > 0) {
                int strat_index = array_str[i].indexOf(estimation) + 8;
                int end_index = array_str[i].indexOf("\"", strat_index);
                String temp = array_str[i].substring(strat_index, end_index);
                grades[i] = temp;
            }
            if (array_str[i].indexOf(lesson) > 0) {
                int strat_index = array_str[i].indexOf(lesson) + 9;
                int end_index = array_str[i].indexOf("\"", strat_index);
                String temp = array_str[i].substring(strat_index, end_index);
                lessons[i] = temp;
            }

        }
        for (int i = 0; i < array_str.length; i++) {
            sb.append("Студент " + last_names[i] + " получил " + grades[i] + " по предмету " + lessons[i]);
            sb.append("\n");
        }
        System.out.println(sb);
    }

}

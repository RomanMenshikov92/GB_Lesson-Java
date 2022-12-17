// 1.Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package homework_02;

import java.util.HashMap;
import java.util.Set;

public class hw_1 {
    public static void main(String[] args) {
        String JSON_str = "{\"name\":\"Ivanov\",\"country\":\"Russia\",\"city\":\"Moscow\",\"age\":\"null\"}";
        String res = "select * from students where ";
        StringBuilder request = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();
        String str_create = JSON_str.replace("\\", "");
        str_create = str_create.replace("{", "");
        str_create = str_create.replace("}", "");
        str_create = str_create.replaceAll("\"", "");
        String[] arr_create = str_create.split(",");
        for (int i = 0; i < arr_create.length; i++) {
            String[] sub_str = arr_create[i].split(":");
            map.put(sub_str[0], sub_str[1]);
        }
        Set<String> keys = map.keySet();
        request.append(res);
        String str = "";
        for (String key : keys) {
            if (!map.get(key).equals("null")) {
                request.append(str);
                request.append(key + "=" + map.get(key));

            } else {
                request.append(" ");
            }
            str = " and ";

        }
        System.out.println(request);

    }
}

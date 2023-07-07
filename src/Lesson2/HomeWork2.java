package Lesson2;

import java.util.Map;
import java.util.HashMap;
public class HomeWork2 {
        public static void main (String[]args){
/*Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.*/
            String sqlQuery = task1("dummy");
            System.out.println(sqlQuery);
    }


   static String task1(String str){

                String jsonFilter = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

                Map<String, Object> filter = parseJson(jsonFilter);
                StringBuilder whereClause = new StringBuilder();
                for (String key : filter.keySet()) {
                    Object value = filter.get(key);

                    if (value != null && !value.toString().equals("null")) {
                        if (whereClause.length() > 0) {
                            whereClause.append(" and ");
                        }

                        whereClause.append(key).append("=").append(escapeValue(value.toString()));
                    }
                }

                String sqlQuery = "select * from students where " + whereClause.toString();
                return sqlQuery;
            }

            private static Map< String, Object> parseJson(String json) {
                // Используем map для обработки Json -строки
                Map< String, Object> result = new HashMap<>();
                result.put("name","Ivanov");
                result.put("country","Russia");
                result.put("city","Moscow");
                result.put("age", " null");

                return result;
            }
            private static String escapeValue(String value){
            return "" + value+ " ";
            }
        }
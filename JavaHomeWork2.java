import java.util.Arrays;

public class JavaHomeWork2 {
    public static void main(String[] args) {
        String s = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println("Исходная строка 1: \n" + s +"\n");

        String[] str1 = s.replaceAll(":", " ").replaceAll("\\p{P}", "").replaceAll("\s", " ").split(" ");
        System.out.println("Итоговый результат 1: \n" + str1[0] + "-" +str1[1] + "\n" + str1[2] + "-"  + str1[3] + "\n" + str1[4] + "-"  + str1[5] + "\n");


        //_____________________________________________________________________________________________________________________________________

        String s2 = "{\"фамилия\":\"Иванов\", \"оценка\":\"5 \",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\", \"оценка\":\"4 \"," +
                "\"предмет\":\"Информатика\"} ,{\"фамилия\":\"Краснов\", \"оценка\":\"5\", \"предмет\":\"Физика\"}";
        System.out.println("Исходная строка 2: \n" + s +"\n");

        String[] str2 = s2.replaceAll(",", "")
                .replaceAll("\"", "")
                .replaceAll(":", " ")
                .replaceAll("\\{", "")
                .replaceAll("\\s", " ")
                .replaceAll("\\}", "")
                .split(" ");

        StringBuilder builder = new StringBuilder();
        builder.append("Студент " + str2[1] + " получил " + str2[3] + " по " + str2[4] + "у " + str2[5]
                       + "\nСтудентка " + str2[7] +  " получила " + str2[9] + " по " + str2[4] + "у " + str2[11]
                       + "\nСтудент " + str2[13] + " получил " + str2[3] + " по " + str2[4] + "у " + str2[17]);

        System.out.println("Итоговый результат 2: \n" + builder);

    }
}
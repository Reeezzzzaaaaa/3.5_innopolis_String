public class Homework1 {
    public static void main(String[] args) {

        //Система проверяет проверяет значение на пустоту
        String emptyTrue = "";
        String emptyFalse = "      ";
        boolean resultTrue = emptyTrue.isEmpty();
        boolean resultFalse = emptyFalse.isEmpty();
        System.out.println(resultTrue);
        System.out.println(resultFalse);

        //Система проверяет значение на наличие символов
        String blank = "      ";
        boolean resultBlank = blank.isBlank();
        System.out.println(resultTrue);

        //Система выбирает из текста символы с 9 по 20
        String sub = "Напишите комментарий на русском, поясняющий суть метода.";
        String resultSub = sub.substring(9, 20);
        System.out.println(resultSub);

        //Система выводит из текста порядковый номер символа "м"
        String index = "Напишите комментарий на русском, поясняющий суть метода.";
        int resultIndex = index.indexOf("м");
        int resultIndexMines = index.indexOf("ы");
        System.out.println(resultIndex);
        System.out.println(resultIndexMines);

        //Система выводит порядковый номер символа, от которого начинается текст (начало: "суть")
        String lastIndex = "Напишите комментарий на русском, поясняющий суть метода.";
        int resultLastIndex = lastIndex.lastIndexOf("суть");
        System.out.println(resultLastIndex);

        //Система преобразует текст в нижний регистр
        String lower = "НАПИШИТЕ КОММЕНТАРИЙ НА РУССКОМ, ПОЯСНЯЮЩИЙ СУТЬ МЕТОДА";
        String resultLower = lower.toLowerCase();
        System.out.println(resultLower);

        //Система преобразует текст в верхний регистр
        String upper = "Напишите комментарий на русском, поясняющий суть метода.";
        String resultUpper = upper.toUpperCase();
        System.out.println(resultUpper);

        //Система заменяет выбранный символ "с" на символ "т"
        String replace = "Напишите комментарий на русском, поясняющий суть метода.";
        String resultReplace = replace.replace('с', 'т');
        System.out.println(resultReplace);

        //Система проверяет с чего начинается текст
        String start = "Напишите комментарий на русском, поясняющий суть метода.";
        boolean resultStartTrue = start.startsWith("Нап");
        boolean resultStartFalse = start.startsWith("ком");
        System.out.println(resultStartTrue);
        System.out.println(resultStartFalse);

        //Система проверяет с чего начинается текст
        String end = "Напишите комментарий на русском, поясняющий суть метода.";
        boolean resultEnd = end.endsWith("да.");
        System.out.println(resultEnd);

        //Система повторяет текст указанное количество раз
        String repeat = "Напишите комментарий на русском, поясняющий суть метода.";
        String resultRepeat = repeat.repeat(5);
        System.out.println(resultRepeat);

        //Система проверяет соответствие указанных символов в тексте
        String contains = "Напишите комментарий на русском, поясняющий суть метода.";
        boolean resultContainsTrue = contains.contains("мет");
        boolean resultContainsFalse = contains.contains("sdvds");
        System.out.println(resultContainsTrue);
        System.out.println(resultContainsFalse);

        //Система соединяет части текста
        String firstPart = "Напишите комментарий на русском,";
        String secondPart = " поясняющий суть метода.";
        String resultConcat = firstPart.concat(secondPart);
        System.out.println(resultConcat);

        //Система удаляет пробелы в начале и конце текста
        String trim = "        Напишите комментарий на русском, поясняющий суть метода.           ";
        String resultTrim = trim.trim();
        System.out.println(trim);
        System.out.println(resultTrim);

        //Система сравнивает текст
        String text1 = "Напишите комментарий на русском, поясняющий суть метода.";
        String text2 = "Напишите комментарий на русском, поясняющий суть метода.";
        String text3 = " поясняющий суть метода.";
        boolean resultEqualsTrue = text1.equals(text2);
        boolean resultEqualsFalse = text1.equals(text3);
        System.out.println(resultEqualsTrue);
        System.out.println(resultEqualsFalse);
    }
}
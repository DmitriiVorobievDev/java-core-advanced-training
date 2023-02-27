package com.dvdev.regular_expressions.practice;

/**
 * 3. Написать программу, выполняющую поиск в строке всех тегов
 * абзацев, в т.ч. тех, у которых есть параметры, например <p id
 * ="p1">,
 * и замену их на простые теги абзацев <p>.
 */

public class Task3 {

    public static void main(String[] args) {
        String regex = "(<p .+?>)(.+?</p>)"; //с ? ленивый квантификатор, без - жадный
        //жадный - съедает всю строку, затем возвращается наза до закрывающего >
        //ленивый - проверяет каждый символ и сравнивает с закрывающим
        String input = "<p>fdf grgr </p> <b> effe </b> gergeg " +
                "egrgerg <p id=\"p1\">fefw fewfwe</p> <p id=\"123\">2323o </p>";
        System.out.println(input.replaceAll(regex, "<p>$2"));
    }
}

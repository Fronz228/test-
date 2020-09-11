package com.company;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try(FileReader reader = new FileReader("notes3.txt")) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        Scanner in = new Scanner(System.in);
        String temp;
        System.out.println(" ");
        System.out.println("Хотите ли вы внести новый фильм? 1 - YES");

        temp = in.nextLine();
        int fast = ParseToInt(temp);

        if(fast == 1){
            Film Film1 = new Film();
            System.out.println("Введите название фильма");
            Film1.setName(in.nextLine());

            System.out.println("Введите режиссера фильма");
            Film1.setDirector(in.nextLine());

            System.out.println("Введите главного актера/актрису фильма");
            Film1.setActor(in.nextLine());

            System.out.println("Введите рейтинг фильма (от 0 до 10)");
            temp = in.nextLine();
            fast = ParseToInt(temp);
            /*Film1.level = new Film.SetLevel(fast);*/


            System.out.println("Введите кол - во просмотра  фильма");
            temp = in.nextLine();
            fast = ParseToInt(temp);
            Film1.views = fast;


            System.out.println("Введите дату выхода фильма");
            Film1.setDate(in.nextLine());

            System.out.println(Film1.getName() + " "+ Film1.getDirector() +" "+ Film1.getActor() +" "+ Film1.views +" "+ Film1.getDate());

            try(FileWriter writer = new FileWriter("notes3.txt", false))
            {
                // запись всей строки
                String text = (Film1.getName() + " "+ Film1.getDirector() +" "+ Film1.getActor() +" "+ Film1.views +" "+ Film1.getDate());
                writer.write(text);
                writer.flush();
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }

        }else{
            System.out.println("Что - то пошло не так");
        }



    }






    public static int ParseToInt(String string){
        String temp;
        int fast = 0; //

        Scanner in = new Scanner(System.in);

        try {
            fast = Integer.parseInt(string);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Во время выполнения кода сработала ошибка #0001 - некоректный ввод значений, пожалуйста попробуйте ещё раз");
        }
        return fast;
    }



}

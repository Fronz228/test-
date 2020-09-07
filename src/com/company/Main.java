package com.company;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

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
            Medicine Film1 = new Medicine();
            System.out.println("Введите название фильма");
            Film1.Name = in.nextLine();

            System.out.println("Введите режиссера фильма");
            Film1.Director = in.nextLine();

            System.out.println("Введите главного актера/актрису фильма");
            Film1.Actor = in.nextLine();

            System.out.println("Введите рейтинг фильма (от 0 до 10)");
            temp = in.nextLine();
            fast = ParseToInt(temp);
            /*Film1.level = new Medicine.Level(fast);*/


            System.out.println("Введите кол - во просмотра  фильма");
            temp = in.nextLine();
            fast = ParseToInt(temp);
            Film1.views = fast;


            System.out.println("Введите дату выхода фильма");
            Film1.Date = in.nextLine();

            System.out.println(Film1.Name + " "+ Film1.Director +" "+ Film1.Actor +" "+ Film1.views +" "+ Film1.Date);

            try(FileWriter writer = new FileWriter("notes3.txt", false))
            {
                // запись всей строки
                String text = (Film1.Name +" "+ Film1.Director +" "+ Film1.Actor +" "+ Film1.views +" "+ Film1.Date);
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




    public Medicine.Level Level(int num) {
        Medicine.Level result = Medicine.Level.LOW;


        if (num > 7) {
            result = Medicine.Level.HIGH;
        } else if (num > 4) {
            result = Medicine.Level.MEDIUM;
        }

        return result;
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

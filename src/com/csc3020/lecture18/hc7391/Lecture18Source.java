package csc3020.lecture18.hc7391;

import java.io.*;

public class Lecture18Source {
    //Reading one byte using input stream
    public static void main(String[] args) throws IOException {



    doTryCatchFinally();
    System.out.println("--------------");
    doTryWithResources();
    System.out.println("--------------");
    doTryWithMultiResources();
    System.out.println("--------------");
    doClosingThing();
    System.out.println("--------------");
    doBufferedStreaming();
    //System.out.println("--------------");

    String[] data = {"Line ", "Line 2 2", "Line  3 3 3", "Line 4 4 4 4 ", "Line 5 5 5 5 5" };

    doBufferedWriting(data);
    System.out.println("--------------");
    doBufferedReadingLineByLine();

    }//end static main

    public static void doTryCatchFinally(){
        char[] buff = new char[8];
        int length;
        Reader reader = null;
        try{
            reader = Helper.openReader("file1.txt");
            while((length = reader.read(buff))>=0){
                System.out.println("\nlength: "+length);
                for (int i = 0; i < length ; i++) {
                    System.out.print(buff[i]);
                }
            }
            System.out.println();
        }catch(IOException exception){
            System.out.println(exception.getClass().getSimpleName()+" " + exception.getMessage());
        }finally {
            try{
                if(reader!=null)
                    reader.close();
            }catch(IOException exception){
                System.out.println(exception.getClass().getSimpleName()+" " + exception.getMessage());
            }
        }
    }
    public static void doTryWithResources(){
        char[] buff = new char[8];
        int length;
        //Reader reader = null;
        try(Reader reader = Helper.openReader("file1.txt")){
            //reader = Helper.openReader("file1.txt");
            while((length = reader.read(buff))>=0){
                System.out.println("\nlength: "+length);
                for (int i = 0; i < length ; i++) {
                    System.out.print(buff[i]);
                }
            }
            System.out.println();
        }catch(IOException exception){
            System.out.println(exception.getClass().getSimpleName()+" " + exception.getMessage());
        }
    }
    public static void doTryWithMultiResources(){
        char[] buff = new char[8];
        int length;
        try(Reader reader = Helper.openReader("file1.txt"); Writer writer = Helper.openWriter("file2.txt")){
            while((length=reader.read(buff))>=0){
                System.out.println("\nlength: " + length);
                writer.write(buff,0,length);
            }
            System.out.println();
        }catch(IOException exception){
            System.out.println(exception.getClass().getSimpleName()+" _ "+exception.getMessage());
        }
    }
    public static void doClosingThing(){
        try(MyAutoClosable oMyAutoClosable = new MyAutoClosable()){
           //throw new Exception("New Exception");
            oMyAutoClosable.saySomething();
        }catch(Exception exception){
            System.out.println(exception.getClass().getSimpleName()+ " _ "+exception.getMessage());
            for(Throwable throwable : exception.getSuppressed()){
                System.out.println("Suppresed " + throwable.getMessage());
            }
        }
    }// end function

    public static void doBufferedStreaming(){
        try(BufferedReader oBufferedReader = new BufferedReader(new FileReader("file1.txt"))){
            int intVal;
            while((intVal = oBufferedReader.read())>=0){
                char charVal =(char) intVal;
                System.out.print(charVal);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void doBufferedWriting(String[] data)throws IOException{
        try(BufferedWriter oBufferedWriter = new BufferedWriter(new FileWriter("data.txt"))){
            for (String stringItem:data) {
                oBufferedWriter.write(stringItem);
                oBufferedWriter.newLine();

            }
        }catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static void doBufferedReadingLineByLine()throws IOException{
        try(BufferedReader oBufferedReader = new BufferedReader(new FileReader("data.txt"))){
            String strValue;
            while ( (strValue = oBufferedReader.readLine())!=null){
                System.out.println(strValue);
            }

        }

    }
}// class main

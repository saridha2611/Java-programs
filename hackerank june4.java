import java.util.Scanner;
public class solution{
    public static void main(string[]args)throws IOException{
        bufferedReader bufferReader=new bufferedReader(new InputStreamReader(System.in));
        int carType=Integer.parseInt(bufferedReader.readline().trim());
        int carMileage=Integer.parseInt(bufferedReader.readline().trim());
        if(carType==0)
        {
            car wagon=new Wagon(carMileage);
            wagon.printCar("wagon");
        }
        if(carType==1
        {
            Var hondaCity=new HondaCity(carHileage);
            hondaCity.printCar("Hondacity")
        }
    }
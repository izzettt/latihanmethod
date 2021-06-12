/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmethod;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Void {
//Method Pertama
    void KelompokHewan(){
    String namahewan,makananhewan;
    Scanner input = new Scanner(System.in);
    System.out.println("=======SISTEM PENENTUAN HEWAN BERDASARKAN JENIS MAKANANNYA=======");
    System.out.println("");
    System.out.print("Masukkan nama hewan                         : ");
    namahewan = input.nextLine();
    System.out.println("");
    System.out.println("!!Anda hanya bisa menginputkan Tumbuhan, Daging, serta Tumbuhan dan Daging!!");
    System.out.print("Masukkan makanan yang dimakan hewan tersebut: ");
    makananhewan = input.nextLine();
    
    //Percabangan
    switch(makananhewan){
        //Herbivora
        case "Tumbuhan" :
            System.out.println(namahewan+" ialah hewan Herbivora");
            break;
        //Karnivora
        case "Daging" :
            System.out.println(namahewan+" ialah hewan Karnivora");
            break;
        //Omnivora
        case "Tumbuhan dan Daging" :
            System.out.println(namahewan+" ialah hewan Omnivora");
            break;
        //Selain Hewan
        default: 
            System.out.println("Maaf bgt nih, "+namahewan+" yang antum masukin bukan hewan :>>");
    }
    }
    //Method Kedua
    void GerakHewani() {
    Scanner input = new Scanner(System.in);
    String namahewan;
    int jumlahdiulang;
    System.out.println("");
    System.out.print("Masukkan nama hewan                   : ");
    namahewan = input.nextLine();
    System.out.print("Masukkan jumlah pengulangan nama hewan: ");
    jumlahdiulang = input.nextInt();
    
    //Perulangan
    for (int i=1; i<=jumlahdiulang; i++)
            System.out.println(namahewan);
    
    }
}

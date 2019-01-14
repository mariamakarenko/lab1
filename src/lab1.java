package lab1;
import java.util.Scanner;
import java.io.*;
class Lab1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 4 строки\n");
        System.out.print("1-ая строка: ");
        String str1 = scan.nextLine();
        System.out.print("2-ая строка: ");
        String str2 = scan.nextLine();
        System.out.print("3-яя строка: ");
        String str3 = scan.nextLine();
        System.out.print("4-ая строка: ");
        String str4 = scan.nextLine();
        if (str1.length()==str2.length()&&str2.length()==str3.length()&&str3.length()==str4.length())
        {
            System.out.print("Длины всех строк равны.\n");
        }
            else
                { if(str1.length()>=str2.length()&&str1.length()>=str3.length()&&str1.length()>=str4.length())
            {
                if(str1.length()==str2.length()){ if(str1.length()==str3.length())
                    System.out.print("Строки 1:"+ str1 +", 2:"+ str2 +", 3:"+ str3 +" являются наибольшими.\n");
                else
                    { if(str1.length()==str4.length())
                    System.out.print("Строки 1:"+str1+", 2:"+str2+", 4:"+str4+" являются наибольшими.\n");
                else System.out.print("Строки 1:"+str1+", 2:"+str2+" являются наибольшими.\n");
                }
                }
                else{ if(str1.length()==str3.length()){ if(str1.length()==str4.length())
                    System.out.print("Строки 1:"+str1+", 3:"+str3+", 4:"+str4+" являются наибольшими.\n");
                else System.out.print("Строки 1:"+str1+", 3:"+str3+" являются наибольшими.\n");
                }
                else if(str1.length()==str4.length())
                    System.out.print("Строки 1:"+str1+", 4:"+str4+" являются наибольшими.\n");
                else System.out.print("Строка 1:"+str1+" является наибольшей.\n");
                }
            }
            else { if(str2.length()>=str1.length()&&str2.length()>=str3.length()&&str2.length()>=str4.length())
            {
                if(str2.length()==str3.length()){ if(str2.length()==str4.length())
                    System.out.print("Строки 2:"+str2+", 3:"+str3+", 4:"+str4+" являются наибольшими.\n");
                else System.out.print("Строки 2:"+str2+", 3:"+str3+" являются наибольшими.\n");
                }
                else if(str2.length()==str4.length())
                    System.out.print("Строки 2:"+str2+", 4:"+str4+" являются наибольшими.\n");
                else System.out.print("Строка 2:"+str2+" является наибольшей.\n");
            }
            else
                {
                    if(str3.length()>=str1.length()&&str3.length()>=str2.length()&&str3.length()>=str4.length())
                {
                    if(str3.length()==str4.length())
                        System.out.print("Строки 3:"+str3+", 4:"+str4+" являются наибольшими.\n");
                    else System.out.print("Строка 3:"+str3+" является наибольшей.\n");
                }
                else System.out.print("Строка 4:"+str4+" является наибольшей.\n");
                }
            }
            }
    }
}

import java.util.Scanner;

public class BurcProgrami {
    public static void main(String[] args) {

        int mounth, day;
        String burc = " ";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz :");
        mounth = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz :");
        day = input.nextInt();

        if (mounth == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    burc = "oğlak";
                } else {
                    burc = "kova";
                }
            } else {
                isError = true;
            }
        } else if ((mounth == 2)) {
            if (day >= 1 && day <= 29) {
                if (day <= 19) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isError = true;
            }
        } else if (mounth == 3) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isError = true;
            }
        } else if (mounth == 4) {
            if (day >= 1 && day <= 30) {
                if (day <= 20) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isError = true;
            }
        } else if (mounth == 5) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isError = true;
            }
        } else if (mounth == 6) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isError = true;
            }
        } else if (mounth == 7) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                isError = true;
            }
        } else if (mounth == 8) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                isError = true;
            }
        } else if (mounth == 9) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isError = true;
            }
        } else if (mounth == 10) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isError = true;
            }
        } else if (mounth == 11) {
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isError = true;
            }
        } else if (mounth == 12) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        } if (isError) {
            System.out.println("Hatalı tarih girdiniz ! Lütfen tekrar deneyiniz");
        } else {
            System.out.println("Burcunuz :" + burc);
        }
    }
}



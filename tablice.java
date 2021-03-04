public class tablice {
    public static void main(String[] args) {
        String[] miesiace = new String[]{"styczeń", "luty", "marzec"};
        for (int i = 0; i < miesiace.length; i++) {
        //    miesiace[5] = "lipiec";
        int[] dni = new int[5];
        dni[0] = 31;
        dni[1] = 28;
        dni[2] = 31;


        Integer[] md = new Integer[3];
                md[0]= Integer.valueOf(miesiace[0]+dni[0]);
                md[1]= Integer.valueOf(miesiace[1]+dni[1]);
                md[2]= Integer.valueOf(miesiace[2]+dni[2]);
        for (int n=0; n< md.length;n++){
            System.out.println("Ilości dni w  "+ md[i]);
        }
        }

    }
}

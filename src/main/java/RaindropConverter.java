class RaindropConverter {

    String convert(int number) {
        String rain = "";

        if (number % 3 == 0) {
            rain += "Pling";
        }

        if (number % 5 == 0) {
            rain += "Plang";
        }

        if (number % 7 == 0) {
            rain += "Plong";
        }

        if (rain.isEmpty()) {
            rain = Integer.toString(number);
        }

        return rain;
    }
    //     String resul = "";
    //     for(int i = 1; i <= number; i++){
    //         if(number % i == 0) {
    //            if(i % 3 == 0 && i == 3) {
    //                resul += "Pling";
    //            }else if(i % 5 == 0 && i == 5){
    //                resul += "Plang";
    //            }else if(i % 7 == 0 && i == 7){
    //                resul += "Plong";
    //            } 
    //         }
    //     }
    //     if (resul.equals("")) {
    //         resul = ""+number;
    //     }
        
    //     return resul;
    // }

}

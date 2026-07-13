class Bob {

    String hey(String input) {
        String semEspaco = input.trim();
        boolean pergunta = !semEspaco.isEmpty() && semEspaco.charAt(semEspaco.length() -1) == '?' ;
        boolean espaco = false;
        boolean letra = false;
        
        for(int i = 0; i < input.length(); i++){
            if (!Character.isWhitespace(input.charAt(i))){
                espaco = false;
                break;
            }else{
                espaco = true;
            }
        }

        for(int i = 0; i< semEspaco.length(); i++){
            if(!Character.isLetter(semEspaco.charAt(i))){
                letra = false;
            }else{
                letra = true;
                break;
            }
        }
        boolean capslock = semEspaco.equals(semEspaco.toUpperCase()) && letra == true; 
        
        
        if (input.isEmpty() == true || espaco == true){ 
            return "Fine. Be that way!";
        }else if (pergunta == true && capslock == false){ 
            return "Sure.";
        }else if (pergunta == true && capslock == true && letra == true){ 
            return "Calm down, I know what I'm doing!";
        }else if (pergunta == false && capslock == true && letra == true){ 
            return "Whoa, chill out!";
        }else{
            return "Whatever.";
        }
    }
}


    
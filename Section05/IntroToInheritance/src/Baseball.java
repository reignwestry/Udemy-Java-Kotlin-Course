public class Baseball extends Ball {
    // Properties
    public String texture;//soft, rough or smooth
    public String weight;
    public String league;
    public String ballSpeed; //fast, slow, both
    public String ballSize;

    //Behaviors (override)
    public void bounce(){
        System.out.println("Doesn't bounce");
    }
    public void whatLeague(){
        System.out.println("League: MLB");
    }

    public void whatTexture(){
        if(texture != "rough" ){
            System.out.println("Wrong ball");

        }else{
            System.out.println("Baseball's texture is " + texture);
        }

    }
    public void ballThrown(){
        System.out.println("Can be thrown " + ballSpeed);
    }






}

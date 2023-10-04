class Coin {
    String tailColor;
    boolean isHead;
    Coin(String color){
        tailColor = color;
        isHead = true;
    }
    void flip(){
        if (isHead){
            System.out.println("From flip() -> I am head my color is SILVER (my tailColor is " + tailColor + ")");
        }
        else{
            System.out.println("From flip() -> My face color is " + tailColor);
        }
        isHead = !isHead;
        
    }
    void hit(Coin c){
        
            // if (this.isHead){
            //     System.out.println("From flip() -> I am head my color is SILVER (my tailColor is " + this.tailColor + ")");
            //     // System.out.println("From flip() -> I am head my color is SILVER (my tailColor is " + c.tailColor + ")");
            // }
            // else{
            //     System.out.println("From flip() -> My face color is " + tailColor);
            // }
            // isHead = !isHead;
            // c.isHead = !c.isHead;
            tailColor = this.tailColor;
            flip();
            tailColor = c.tailColor;
            flip();
            // System.out.println("c1 hit c2");
        
        // if ()
        
        
        // isHead = !isHead;
        
    }
    void hit(Coin c1, Coin c2){

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coin other = (Coin) obj;
        if (tailColor == null) {
            if (other.tailColor != null)
                return false;
        } else if (!tailColor.equals(other.tailColor))
            return false;
        if (isHead != other.isHead)
            return false;
        return true;
    }
    @Override
    public String toString(){
        return "I am a coin object with tailColor = " + tailColor + ". My isHead is " + isHead;
    }
}

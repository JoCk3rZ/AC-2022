package main;

class Entier extends Value {
    Integer x;
    Entier(Integer s){
	x = s;
    }

    @Override
    public String toString(){
	return "Entier " +  x.toString();
    }

    public int getValue() {
        return x;
    }
}
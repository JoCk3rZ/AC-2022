package main;

class AssignOperator extends Instruction{
    String lhs;
    String op;
    Value t0;
    Value t1;
    AssignOperator(String s, String ope, Value x, Value y){
	lhs = s;
	op = ope;
	t0 = x;
	t1 = y;
    }

    public String toString(){
        return this.lhs+" = "+this.t0+" "+this.op+" "+this.t1;
    }
}

package StructuralPatterns.AdapterPattern.EX1_Enemies;

public class SardeenaAdapter implements Enemy{
    Sardeena sardeena;

    public SardeenaAdapter(Sardeena sardeena){
        this.sardeena = sardeena;
    }
    @Override
    public void fireCannons() {
        this.sardeena.eqsefGabha();
    }

    @Override
    public void refillGas() {
        this.sardeena.edrab7agareen();
    }
}

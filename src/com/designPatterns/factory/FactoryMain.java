package com.designPatterns.factory;

public class FactoryMain {


    public static void main(String[] args) {

        OperationSystemFactory osf = new OperationSystemFactory();
        OS obj = osf.getIstance("Android");
        obj.spec();

        OS obj1 = osf.getIstance("IOS");
        obj1.spec();

        OS obj2 = osf.getIstance("");
        obj2.spec();





    }

}

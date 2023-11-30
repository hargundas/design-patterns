package com.designPatterns.factory;

public class OperationSystemFactory {

    public OS getIstance(String str){

        if(str.equals("IOS"))
            return new IOS();
        else if (str.equals("Android"))
            return new Android();
        else
            return new Windows();
    }

}

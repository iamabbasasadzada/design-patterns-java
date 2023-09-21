package org.dpattern.singeltonPattern;


public class DragonSingle {
    private static DragonSingle instance;
    private String value;

    private DragonSingle(String value) {
        this.value = value;
    }

    public static synchronized DragonSingle getInstance(String value){
        if(instance==null){
            synchronized (DragonSingle.class){
                if(instance==null){
                    instance=new DragonSingle(value);
                }
            }
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}

package day28_exceptions;

import day27_abstractClasses_interfaces.I08_Interface;

import java.util.ArrayList;
import java.util.List;

public class C01_ChildOfInterfaces implements I01_InterfaceIstisnaiDurum {


    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    public static void main(String[] args) {

        System.out.println(I01_InterfaceIstisnaiDurum.methodIstisna2()); // 44

        C01_ChildOfInterfaces obj = new C01_ChildOfInterfaces();
        obj.runnerMethod();


        List<String> liste = new ArrayList<>();

    }


    public void runnerMethod(){
        methodIstisna(); // default istisnai method
    }
}

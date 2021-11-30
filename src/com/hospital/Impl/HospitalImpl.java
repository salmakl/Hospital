package com.hospital.Impl;

import com.hospital.interfaces.HospitalInterface;
import com.hospital.Impl.OperationImpl;

public class HospitalImpl implements HospitalInterface {
    OperationImpl operation=new OperationImpl();

    @Override
    public void menu(){
        System.out.println("1. Add Operation");
        System.out.println("2. Check the operation status");
        System.out.println("3. Change the operation status");
        System.out.println("0. Exit");
        int choice = 0;

        switch (choice) {
            case 1:operation.addOperation();break;
            case 2:operation.checkOperation();break;
            case 3:operation.changeOperation();break;
            case 0:System.exit(0);
        }

    }
}

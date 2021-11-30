package com.hospital.Impl;

import java.util.List;
import java.util.Optional;

import com.hospital.interfaces.OperationInterface;
import com.hospital.models.Operation;

public class OperationImpl implements OperationInterface{
    private  static List<Operation> Operations;



    @Override
    public Optional<Operation> getOperationByRef(List<Operation> operations,int ref) {
        for (Operation op:operations) {
            if(op.getRef()==ref){
                return Optional.of(op);
            }
        }
        return null;
    }

    @Override
    public void addOperation(List<Operation> operations) {






    }



}

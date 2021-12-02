package com.hospital.interfaces;

import com.hospital.models.*;
import java.util.Optional;
import java.util.List;


public interface OperationInterface {

    public Optional<Operation> getOperationByRef(List<Operation> operations, int ref);


    public void addOperation(List<Operation> operations, Hospital hospital, Doctor doctors, List<Nurse> nurses, Patient patients, Room room);
    public void statusDone(Operation operation);
    public void statusPending(Operation operation);
    public void statusFailed(Operation operation);
}

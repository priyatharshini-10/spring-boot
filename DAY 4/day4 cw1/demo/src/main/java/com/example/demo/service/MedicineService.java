package com.example.demo.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Medicine;
import com.example.demo.repository.MedicineRepo;

@Service
public class MedicineService {
    private final MedicineRepo medicineRepository;

    
    public MedicineService(MedicineRepo medicineRepository) {
        this.medicineRepository = medicineRepository;
    }    
    public Medicine createMedicine(Medicine medicine){
        return medicineRepository.save(medicine);
    }
    public List<Medicine> getAllMedicines(){
        return medicineRepository.findAll();
    }
    public Medicine getMedicineById(int medicineId){
        return medicineRepository.findById(medicineId).orElse(null);
    }
}
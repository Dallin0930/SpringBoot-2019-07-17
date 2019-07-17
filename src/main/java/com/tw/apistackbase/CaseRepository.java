package com.tw.apistackbase;

import com.tw.apistackbase.beans.Case;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public interface CaseRepository extends JpaRepository {
    List<Case> findByCaseName(String caseA);
}

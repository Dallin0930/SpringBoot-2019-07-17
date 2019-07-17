package com.tw.apistackbase;

import com.tw.apistackbase.beans.Case;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public  class RepositoryTest  {
    public Long returnSeconds(int year, int month, int date) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.set(year,month, date);
        long secondsSinceEpoch = calendar.getTimeInMillis() / 1000L;
        return secondsSinceEpoch;
    }

    @Autowired
    CaseRepository caseRepository;

   @Test
    public ResponseEntity<List<Case>> should_return_CaseList_when_add_Case()
   {
       List<Case> cases =new ArrayList<>();
       Case caseOne=new Case("caseA",returnSeconds(2018,9,2));
       Case caseTwo=new Case("caseB",returnSeconds(2008,9,2));
       Case caseThree=new Case("caseC",returnSeconds(2015,9,2));
       cases.add(caseOne);
       cases.add(caseTwo);
       cases.add(caseThree);
       caseRepository.saveAll(cases);
       List<Case> allCases = caseRepository.findAll();
       return ResponseEntity.ok(allCases);
   }

    @Test
    public ResponseEntity<Optional> should_return_case_by_id()
    {
        Optional fetchedCase = caseRepository.findById(1);
        return ResponseEntity.ok(fetchedCase);
    }

    @Test
    public ResponseEntity<List<Case>> should_return_case_by_caseName()
    {
        List<Case> fetchedCases = caseRepository.findByCaseName("caseA");
        return ResponseEntity.ok(fetchedCases);
    }

    @Test
    public ResponseEntity<List<Case>> should_return_all_cases_order_by_caseTime()
    {
        List<Case> fetchedCases = caseRepository.findByCaseName("caseA");
        return ResponseEntity.ok(fetchedCases);
    }











}

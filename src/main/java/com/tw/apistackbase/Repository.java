package com.tw.apistackbase;

import com.tw.apistackbase.beans.Case;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;


public interface Repository extends JpaRepository {
     List<Case> cases=new ArrayList<Case>();
     Case caseOne=new Case("Rob","2015/06/07");
     Case caseTwo=new Case("Murder","2017/08/26");
     Case caseThree=new Case("other","2019/03/05");




}

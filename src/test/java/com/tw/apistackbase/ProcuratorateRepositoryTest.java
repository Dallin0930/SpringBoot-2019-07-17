package com.tw.apistackbase;

import com.tw.apistackbase.beans.Procuratorate;
import com.tw.apistackbase.repository.ProcuratorateRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProcuratorateRepositoryTest {
    @Autowired
    private ProcuratorateRepository procuratorateRepository;

    @Before
    public void setUp() {
        List<Procuratorate> Procuratorates = new ArrayList<Procuratorate>() {{
            add(new Procuratorate("ProcuratorateA"));
            add(new Procuratorate("ProcuratorateB"));
            add(new Procuratorate("ProcuratorateC"));
        }};
        procuratorateRepository.saveAll(Procuratorates);
    }
    @Test
    public void should_return_Procuratorate_by_id(){
        Optional<Procuratorate> procuratorateFetched = procuratorateRepository.findById(1);
        Assert.assertNotEquals(null,procuratorateFetched.get());
    }

}

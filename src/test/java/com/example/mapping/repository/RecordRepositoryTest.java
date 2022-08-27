package com.example.mapping.repository;

import com.example.mapping.dto.RecordLite;
import com.example.mapping.entity.Record;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RecordRepositoryTest {

    @Autowired
    private RecordRepository recordRepository;

    @Test
    public void createRecord(){
        Record r1 = new Record(null,"Ahmet","Yılmaz");
        Record r2 = new Record(null,"Hulusi","Kentmen");

        recordRepository.saveAll(Lists.list(r1,r2));
    }

    @Test
    public void findByRecordId(){
        RecordLite record = recordRepository.findByRecordId(1L);
        System.out.println(record);
    }

}
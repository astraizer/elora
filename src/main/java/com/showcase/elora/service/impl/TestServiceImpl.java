package com.showcase.elora.service.impl;

import com.showcase.elora.persistance.model.Manga;
import com.showcase.elora.persistance.repository.TestRepository;
import com.showcase.elora.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public Object getAllTesting() {
//        return testRepository.findByNameAndAge("agus",12);
        return null;
    }

    @Override
    public Object addTesting(String name, Integer age) {
        Manga test = new Manga();
        test.setName(name);
        test.setAge(age);
        testRepository.save(test);
        return test;
    }
}

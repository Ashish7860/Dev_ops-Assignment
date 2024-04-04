package com.nagarro.devops_assignment;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.nagarro.devops_assignment.controller.Controller;

@WebMvcTest(Controller.class)
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @InjectMocks
    private Controller controller;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetMessage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/welcome"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("This is DevOps Assignment!!"));
    }

    @Test
    public void testGetMessage2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/Week2"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("In week:2a We have to create a Jenkins freestyle project for downloading code from the GitHub."));
    }

    @Test
    public void testGetMessage3() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/Week3"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("In week:3a We have to create a freestyle Jenkins pipeline to build and deploy the Spring Boot Application using Docker."));
    }

    @Test
    public void testGetAllMessages() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("This is DevOps Assignment!!\nIn week:2a We have to create a Jenkins freestyle project for downloading code from the GitHub.\nIn week:3a We have to create a freestyle Jenkins pipeline to build and deploy the Spring Boot Application using Docker."));
    }
}

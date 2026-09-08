package edu.wctc.springbootlab;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(TutorialController.class)
class TutorialControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void homePageLoads() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    @Test
    void tutorialPagesLoad() throws Exception {
        mockMvc.perform(get("/tutorial/step-1"))
                .andExpect(status().isOk())
                .andExpect(view().name("tutorial/step1"));

        mockMvc.perform(get("/tutorial/step-2"))
                .andExpect(status().isOk())
                .andExpect(view().name("tutorial/step2"));

        mockMvc.perform(get("/tutorial/step-3"))
                .andExpect(status().isOk())
                .andExpect(view().name("tutorial/step3"));
    }
}

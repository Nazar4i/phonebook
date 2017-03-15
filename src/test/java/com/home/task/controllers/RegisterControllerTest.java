package com.home.task.controllers;

import com.home.task.PhoneBookApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PhoneBookApplication.class)
@WebAppConfiguration
public class RegisterControllerTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    private RegistrationController controller = new RegistrationController();

    @Before
    public void before() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void testRegistration() throws Exception {
        final String response = controller.init(new ModelMap());

        assertTrue("Register".equals(response));

        assertNotNull(mockMvc);

        mockMvc.perform(get("/registration")).andDo(print())
                .andExpect(handler().handlerType(RegistrationController.class))
                .andExpect(handler().methodName("init"))
                .andExpect(view().name("Register"))
                .andExpect(forwardedUrl("WEB-INF/pages/Register.jsp"))
                .andExpect(status().isOk());
    }
}
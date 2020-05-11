package com.poliscan.infrastructure.controller.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.poliscan.DemoApplication;
import com.poliscan.application.handler.command.CommandUser;
import com.poliscan.infrastructure.databuilder.CommandUserDataBuilder;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.transaction.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@AutoConfigureMockMvc
public class TestControllerCreateUser {

    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    private CommandUserDataBuilder commandUserDataBuilder = new CommandUserDataBuilder();

    private final String URI_CREATE_DRIVER = "/api/user/create";

    @Before
    public void setUp() { this.mockMvc  = MockMvcBuilders.webAppContextSetup(this.wac).build(); }

    @Test
    public void createUser() throws Exception {
        CommandUser commandUser = commandUserDataBuilder.build();
        callRequestCreateUser(commandUser);
    }

    private void callRequestCreateUser(CommandUser commandUser) throws Exception {
        mockMvc.perform(post(URI_CREATE_DRIVER)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(commandUser)))
                .andReturn();
    }

}

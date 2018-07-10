package com.example.frontend;

import com.example.frontend.controllers.ControllerHandlerRest;
import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
        import org.springframework.http.MediaType;
        import org.springframework.test.context.junit4.SpringRunner;
        import org.springframework.test.web.servlet.MockMvc;

        import java.nio.charset.Charset;

        import static org.hamcrest.core.Is.is;
        import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(ControllerHandlerRest.class)
public class ControllerHandlerRestTest {
  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  // if an additional service layer is used
  // - meaning not all logic is added to the controller and you have Autowired fields in it -
  // then you have to mock out the service class like below
  //
  //@MockBean
  //private UserService userService;

  @Test
  public void addNewInput_succesfull() throws Exception {
    mockMvc.perform(get("/doubling?input=5")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.result", is(10)));
  }

  @Test
  public void addNewInput_missingInput() throws Exception {
    mockMvc.perform(get("/doubling")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }

  @Test
  public void greater_succesfull() throws Exception {
    mockMvc.perform(get("/greeter?name=Petike&title=student")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));
  }



}
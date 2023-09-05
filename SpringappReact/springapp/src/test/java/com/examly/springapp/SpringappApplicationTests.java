package com.examly.springapp;
import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc

class SpringappApplicationTests {

 
    @Autowired
    private  MockMvc mockMvc ;
    @Test

    void testaddsongs() throws Exception{    

   
        String st = "{\"id\":5001,\"name\": \"demo\",\"song\": \"Hukum\",\"releaseYear\": \"2020\"}";

         mockMvc.perform(MockMvcRequestBuilders.post("/addSong")

                    .contentType(MediaType.APPLICATION_JSON)

                    .content(st)

                    .accept(MediaType.APPLICATION_JSON))

                    .andExpect(MockMvcResultMatchers.status().isOk())

                    //.andExpect(jsonPath("$").value(true))

                    .andReturn();

    }

 

    @Test

    void getAllSongs() throws Exception{

       

         mockMvc.perform(get("/getAllSong")

                        .accept(MediaType.APPLICATION_JSON))

                        .andDo(print())

                        .andExpect(status().isOk())

                        .andExpect(jsonPath("$").isArray())

                        .andReturn();

    }

 

   

 

}

 
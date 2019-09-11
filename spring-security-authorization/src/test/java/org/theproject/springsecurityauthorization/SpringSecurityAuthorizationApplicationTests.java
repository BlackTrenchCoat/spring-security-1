package org.theproject.springsecurityauthorization;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class SpringSecurityAuthorizationApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser(roles={})
    public void noAccessToSecuredForIntruder() throws Exception {
        mockMvc.perform(get("/secured"))
                .andExpect(status().isForbidden());
    }

    @Test
    @WithMockUser(roles={"USER"})
    public void noAccessToSecuredForRoleUser() throws Exception {
        mockMvc.perform(get("/secured"))
                .andExpect(status().isForbidden());
    }

    @Test
    @WithMockUser(roles={"ADMIN"})
    public void accessToSecuredForRoleAdmin() throws Exception {
        mockMvc.perform(get("/secured"))
                .andExpect(status().isOk());
    }

    @Test
    @WithMockUser(username = "whisper", roles = "USER")
    public void noAccessToSecuredForWhisper() throws Exception {
        mockMvc.perform(get("/secured"))
                .andExpect(status().isForbidden());
    }

    @Test
    @WithMockUser(username = "rain", roles = {"ADMIN"})
    public void accessToSecuredForRain() throws Exception {
        mockMvc.perform(get("/secured"))
                .andExpect(status().isOk());
    }


}

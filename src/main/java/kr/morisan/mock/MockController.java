package kr.morisan.mock;


import org.springframework.web.bind.annotation.*;
import kr.morisan.mock.MockDTO;

@RestController
@RequestMapping("/api/v1/mocks")
public class MockController {

    @GetMapping("/")
    public MockDTO createMock() {
        MockDTO mockDTO = new MockDTO("mockID", "mockPassword");
        return mockDTO;
    }
}

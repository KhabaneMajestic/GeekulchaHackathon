package kmc.hackaton.KMCTravel.controller;


import kmc.hackaton.KMCTravel.service.TestService;
import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;

@CrossOrigin(origins = "*")
@RestController
public class TestController {

    @RequestMapping(path = "/testapi", method = RequestMethod.GET)
    public void getRoute() throws MalformedURLException, JSONException {
        TestService testService = new TestService();

        testService.GetApiResult();
    }
}
package kr.smart.game.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/game")
public class GameController {
   @GetMapping("/info")
    ResponseEntity<Map<String,String>> test(){
        ResponseEntity<Map<String,String>> response = null;
        Map<String, String> resMap = new HashMap<String, String>();
        resMap.put("type", "First eureka client!");
        resMap.put("message", "game");
        response = new ResponseEntity<Map<String, String>>(resMap, HttpStatus.OK);

        return response;
    }
}

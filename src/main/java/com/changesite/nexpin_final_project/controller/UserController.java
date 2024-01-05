package com.changesite.nexpin_final_project.controller;

import com.changesite.nexpin_final_project.repository.UserRepository;
import com.changesite.nexpin_final_project.service.AccountsService;
import com.changesite.nexpin_final_project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;
    private final AccountsService accountService;

}

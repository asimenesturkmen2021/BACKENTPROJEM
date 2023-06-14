package com.schoolmanagement.controller;

import com.schoolmanagement.service.EducationTermServiceTEKRAR;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("educationTermTekrar")
@RequiredArgsConstructor
public class EducationTermControllerTEKRAR {
    private EducationTermServiceTEKRAR educationTermServiceTEKRAR;




}

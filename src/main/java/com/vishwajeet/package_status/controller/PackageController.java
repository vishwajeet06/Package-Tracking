package com.vishwajeet.package_status.controller;


import com.vishwajeet.package_status.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackageController {

    private PackageService packageService;

}

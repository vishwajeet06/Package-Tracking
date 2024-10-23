package com.vishwajeet.package_status.serviceImpl;

import com.vishwajeet.package_status.repository.PackageRepository;
import com.vishwajeet.package_status.service.PackageService;
import org.springframework.stereotype.Service;

@Service
public class PackageServiceImpl implements PackageService {

    private PackageRepository packageRepository;
}

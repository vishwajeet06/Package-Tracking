package com.vishwajeet.package_status.repository;

import com.vishwajeet.package_status.model.Package;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PackageRepository extends JpaRepository<Package, Long> {
}

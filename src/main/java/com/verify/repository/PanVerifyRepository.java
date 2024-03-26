package com.verify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verify.model.KYCDetails;

public interface PanVerifyRepository extends JpaRepository<KYCDetails,String> {

}

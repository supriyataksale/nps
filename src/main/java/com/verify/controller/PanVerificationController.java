package com.verify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.verify.model.KYCDetails;
import com.verify.repository.PanVerifyRepository;

@RestController
public class PanVerificationController {
	
	@Autowired
	PanVerifyRepository repo;
    
	//Verify Pan Details
    @PostMapping("/verify-pan")
    public ResponseEntity<String> verifyPan(@RequestBody KYCDetails kycDetails){
    	// Logic to verify KYC details
    	return ResponseEntity.ok("PAN card verified successfully");
    }
    
    //Add Pan Details
    @PostMapping("/verify-pan/add")
    public ResponseEntity<KYCDetails> addPanDetails(@RequestBody KYCDetails kycDetails) {
    	KYCDetails newKycDetails = repo.save(kycDetails);
    	return ResponseEntity.status(HttpStatus.CREATED).body(newKycDetails);
    }
    
    //Get All Pan Details
    @GetMapping("/pandetails")
	public List<KYCDetails> getAllStudent(){
		List<KYCDetails> alldetails = repo.findAll();
		return alldetails;
	}
}

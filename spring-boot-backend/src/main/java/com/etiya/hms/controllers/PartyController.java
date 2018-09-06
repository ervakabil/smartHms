package com.etiya.hms.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.hms.model.party.Party;
import com.etiya.hms.repository.party.PartyRepository;




@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class PartyController {
	
	@Autowired
    PartyRepository partyRepository;
	
	@GetMapping("/party")
    public List<Party> getAllTodos() {
        Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
        return partyRepository.findAll(sortByCreatedAtDesc);
    }
	
	@PostMapping("/party")
    public Party createParty(@Valid @RequestBody Party party) {
        party.setCompleted(false);
        return partyRepository.save(party);
    }
	

	
	

}

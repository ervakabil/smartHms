package com.etiya.hms.model.party;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Contact {
	String value;
	ContactType contactType;
}

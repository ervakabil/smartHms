package com.etiya.hms.model.common;

import lombok.Data;

@Data(staticConstructor="of")
public class Signature{
    private final String signature;
    private SignatureReason signatureReason;
    
    public Signature(String signat) {
    	this.signature = signat;
    }
 
}
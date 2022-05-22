package com.bankapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WithdrawDto {
	private Integer accountId;
	private Double amount;
	
}

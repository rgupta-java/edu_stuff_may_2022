package com.bankapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DepositDto {
	private Integer accountId;
	private Double amount;

}

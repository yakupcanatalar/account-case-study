package com.folksdev.account.dto
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import java.math.BigDecimal

data class CreateAccountRequest(
    @field:NotBlank(message = "CustomerId must not be empty")
    val customerId: String,

    @field:Min(value = 0, message = "Initial Credit value must not be negative")
    val initialCredit: BigDecimal
)

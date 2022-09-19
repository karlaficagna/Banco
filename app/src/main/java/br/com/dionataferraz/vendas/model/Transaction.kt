package br.com.dionataferraz.vendas.model

import java.util.*

class Transaction(
    val date: Date,
    val value: Long,
    val description: String,
    val transactionType: Transaction
)
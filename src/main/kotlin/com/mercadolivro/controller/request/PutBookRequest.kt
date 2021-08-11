package com.mercadolivro.controller.request

import java.math.BigDecimal
import javax.validation.constraints.NotEmpty

data class PutBookRequest (

    var name: String?,

    var price: BigDecimal?
)

package com.javainterviewpoint.bean

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Employee(
    @Id
    var  id : Long =0,
    var  name : String="",
    var  age : Long =0,
    var  dept : String=""

)
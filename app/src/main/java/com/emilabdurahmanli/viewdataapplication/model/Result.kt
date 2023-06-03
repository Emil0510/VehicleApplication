package com.emilabdurahmanli.viewdataapplication.model

data class Result(var Count : Int,
                  var Message : String,
                  var SearchCriteria : String,
                  var Results : List<Manufactures>  )

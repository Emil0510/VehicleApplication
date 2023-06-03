package com.emilabdurahmanli.viewdataapplication.model

data class Manufactures(var Country : String,
                        var Mfr_CommonName : String,
                        var Mfr_ID : Int,
                        var Mfr_Name : String,
                        var VehicleTypes : List<VehicleTypes>)

package com.example.bhangaar.dataClass

data class Order_Info(var OrderNo : Int ?= null,
                      var UserName : String ?= null,
                      var UserPhone : String ?= null,
                      var UserLocation : String ?= null,
                      var OrderStatus : String ?= null,
                      var OrderDate : String ?= null,
                      var authuserid : String ?= null,
                      var authvendorid : String ?= null,
                      var userAddress : String ?= null,
                      var userState : String ?= null,
                      var latitude : String ?= null,
                      var longitude : String ?= null,
                      var startTime : String ?= null,
                      var endTime : String ?= null,
                      var totalKg : String ?= null,
                      )

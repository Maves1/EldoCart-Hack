package com.childrenofcorn.eldorado

import com.google.firebase.firestore.Exclude

data class Product(var name: String,
              @get:Exclude var price: Int,
              @get:Exclude var imageLink: String,
              var link: String) {

}
package com.mywbd.model

class User{
    class User(email: String, pass: String, uid: String) {

    }

    var email:String=""
    var pass:String=""
    var confpass=""
    var userid:String=""

    constructor(email:String,pass:String,userid:String){
        this.email=email
        this.pass=pass
        this.userid=userid
        this.confpass=confpass

    }
    constructor()
}
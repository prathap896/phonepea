package com.example.test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//    http://localhost:8080/welcome
@Controller
public class Bank1 {
    @GetMapping("/bank1")
    public String other(){

        return "bank1";

    }

    @GetMapping("/bankupiaccounts")
    public String sayHello() {

        return "bankupiaccounts";
    }




    @GetMapping("/banksuccessfully")
    public String h(){
        return "banksuccessfully";
    }

    @GetMapping("/banktransfer")
    public String hello() {

        return "banktransfer";
    }

    @GetMapping("/banktransfers")
    public String he() {

        return "banktransfers";
    }
    @GetMapping("/checkbalance")
    public  String k(){
        return "checkbalance";
    }
    @GetMapping ("/chengeupipin")
    public String uipin(){
        return "chengeupipin";
    }

    @GetMapping("/dthpin")
    public String hii(){

        return "dthpin";
    }

    @GetMapping("/dthrecharge")
    public String recharg(){

        return "dthrecharge";
    }

    @GetMapping("/dthsuccesful")
    public String succesful(){

        return "dthsuccesful";
    }

    @GetMapping ("/dthuipaccunts")
    public String edit(){
        return "dthuipaccunts";
    }

    @GetMapping("/editprofile")
    public String profie(){

        return "editprofile";
    }
@GetMapping("/electricity")
    public String bill(){

     return "electricity";
}

    @GetMapping("/electricitypin")
    public String elepin(){

        return "electricitypin";
    }


    @GetMapping("/eleupiacounts")
    public String eleupi(){

        return "eleupiacounts";
    }


    @GetMapping("/electricitybillsuccessfully")
    public String city(){

        return "electricitybillsuccessfully";
    }
    @GetMapping("/help")
    public String helo (){

        return "help";
    }

    @GetMapping("/history")
    public  String histo()
    {
        return "history";
    }

@GetMapping("/home")
    public String hom(){
        return "home";
}
    @GetMapping("/alertpage")
    public String sayHell() {

        return "alertpage";
    }
    @GetMapping("/bankpin")
    public String heo() {

        return "bankpin";
    }

    @GetMapping("/home1")
    public String home1(){
        return "home1";
    }

    @GetMapping("/language")
    public String lan(){
        return "language";
    }

    @GetMapping ("/loananimation")
    public  String animation(){
        return "loananimation";
    }
@GetMapping("/loanapproval")
public  String approval(){
        return "loanapproval";
}

@GetMapping("/loanemi")
public String loanemi(){
        return  "loanemi";
}

    @GetMapping("/loanemipin")
    public String loanpin(){
        return "loanemipin";
    }

    @GetMapping("/loansuccessfully")
    public String suces(){
        return "loansuccessfully";
    }

@GetMapping ("/loanaubmitted")
public String sub(){
        return "loanaubmitted";
}

@GetMapping ("/loanupiacounts")
public String upiacounts(){
        return "loanupiacounts";
}

@GetMapping("/loansview")
public  String views(){
        return "loansview";
}


    @GetMapping("/loginpage")
    public String pag(){
        return"loginpage";
    }

    @GetMapping("/loginsucess")
    public String loginsucess(){
        return "loginsucess";
    }

    @GetMapping("/mobilerechageplans")
    public  String mobilere(){
        return "mobilerechageplans";
    }

    @GetMapping("/mobileupi")
    public String mobileupi(){
        return "mobileupi";
    }

    @GetMapping("/mobilerecharge")
    public String rechar(){
        return "mobilerecharge";
    }

    @GetMapping ("/myloan")
    public String loans(){
        return "myloan";
    }

    @GetMapping("/notification")
    public String notification(){
        return "notification";
    }

    @GetMapping("/partpayments")
    public String paymnet(){
        return "partpayments";
    }
@GetMapping("/pinclose")
    public String pinclose(){
        return "pinclose";
}
@GetMapping("/preclose")
    public String close(){
        return "preclose";
}
    @GetMapping("/precloseupisucees")
    public String precloseupisucees(){

        return "precloseupisucees";

    }@GetMapping("/presucess")
    public String pinsucess(){
        return "presucess";
    }
    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }


@GetMapping("/profilenotification")
    public String peonotifi(){
        return "profilenotification";
}
@GetMapping("/profilesetting")
    public  String setting(){
        return "profilesetting";
}
@GetMapping ("/profilepage")
public String ppage(){
        return "profilepage";
}

@GetMapping("/rechargehistory")
    public String histor(){
        return "rechargehistory";
}
@GetMapping("/rechargepin")
    public String pin1(){
        return "rechargepin";
}

@GetMapping("/rechargesucessful")
    public String sucessful(){
        return "rechargesucessful";
}
@GetMapping("/registration")
    public String reg(){
        return "registration";
}
@GetMapping ("/requespage")
public String reqpage(){
        return "requespage";
}


@GetMapping("/scannerpin")
    public String scannpin(){
        return "scannerpin";
}

@GetMapping("/scanner")
    public String scanne(){
        return "scanner";
}
@GetMapping("/searchpage")
    public String searcpage(){
        return "searchpage";
}

@GetMapping("/sendotp")
    public String otp(){
        return "sendotp";
}
@GetMapping("/transction")
    public String tran(){
        return "transction";
}
@GetMapping("/transfermoneypin")
    public String money(){
        return"transfermoneypin";
}
@GetMapping("/transfersucessful")
    public  String sucessfu()
{
        return "transfersucessful";
}

@GetMapping("/transfermoneyupiacounts")
    public String transfermoneyupiacounts(){

        return "transfermoneyupiacounts";
}
@GetMapping("/transfermoney")
    public String moneyy(){
        return "transfermoney";
}

@GetMapping("/transactionhistory")
public String histryy(){
        return "transactionhistory";
}
@GetMapping("/types")
    public String types(){
        return "types";
}
@GetMapping ("/upiaccounts")
    public String upia(){
        return "upiaccounts";
}
}
//@GetMapping ("/operators")
//public  String operto(){
//    return "operators";
//}


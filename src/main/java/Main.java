import java.io.IOException;

public class Main {

        public static void main(String[] args) throws IOException {
        Mpesa m=new Mpesa(Constants.APP_KEY,Constants.APP_SECRET);
        m.authenticate();
        /*m.C2BSimulation("600576","CustomerPayBillOnline","2","254708374149","hkjhjkhjkh");
        m.authenticate();*/
/*
        m.B2CRequest("testapi","BVeDP3XWGFG+NCQri04jHp6c0rCajO1JAOccQ7Bsu/Mup3Rh2Gd9IHQEE0SeA1oBXAt/VBAL/cJP+VKU9qRF6voqCa0P1XG8pcv5hTZUcBkbbb8Qqvqn28+s/tBvsLXwsB4QaageFDDZgS6b6gbK1p7+UZ/hRYHL8WclTpYBrQGfhqKZxduh0bPWvK4rt+uqR3hdVlO0RdJSkcOVCVp+FxizPSk3nI6LFq14Jj2G0TwuQ4a13J/KVu5eeFG65gzE1NnIVouHKeBPz9b9xvove156aR16uxh4rBq5U6UAKC/kUhaJ0wOLTvb762CioudL87C6xaPVdTF4qcSD6jM4PA==","BusinessPayment","22","600576","254708374149","This","http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BConfirmation","http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BValidation","http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BValidation");
*/
/*
        m.B2BRequest("testapi","his","BVeDP3XWGFG+NCQri04jHp6c0rCajO1JAOccQ7Bsu/Mup3Rh2Gd9IHQEE0SeA1oBXAt/VBAL/cJP+VKU9qRF6voqCa0P1XG8pcv5hTZUcBkbbb8Qqvqn28+s/tBvsLXwsB4QaageFDDZgS6b6gbK1p7+UZ/hRYHL8WclTpYBrQGfhqKZxduh0bPWvK4rt+uqR3hdVlO0RdJSkcOVCVp+FxizPSk3nI6LFq14Jj2G0TwuQ4a13J/KVu5eeFG65gzE1NnIVouHKeBPz9b9xvove156aR16uxh4rBq5U6UAKC/kUhaJ0wOLTvb762CioudL87C6xaPVdTF4qcSD6jM4PA==","BusinessPayBill","1", "4",22,"600576","600000","This","http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BConfirmation","http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BValidation","http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BValidation");
*/
/*
        m.STKPushSimulation("174379","MTc0Mzc5YmZiMjc5ZjlhYTliZGJjZjE1OGU5N2RkNzFhNDY3Y2QyZTBjODkzMDU5YjEwZjc4ZTZiNzJhZGExZWQyYzkxOTIwMTcwODI0MTU1MDU1","20170824155055","CustomerPayBillOnline","1","254724513769","254724513769","174379","http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BValidation","http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BValidation","sasas","asdasd");
*/
/*
        m.reversal("testapi","BVeDP3XWGFG+NCQri04jHp6c0rCajO1JAOccQ7Bsu/Mup3Rh2Gd9IHQEE0SeA1oBXAt/VBAL/cJP+VKU9qRF6voqCa0P1XG8pcv5hTZUcBkbbb8Qqvqn28+s/tBvsLXwsB4QaageFDDZgS6b6gbK1p7+UZ/hRYHL8WclTpYBrQGfhqKZxduh0bPWvK4rt+uqR3hdVlO0RdJSkcOVCVp+FxizPSk3nI6LFq14Jj2G0TwuQ4a13J/KVu5eeFG65gzE1NnIVouHKeBPz9b9xvove156aR16uxh4rBq5U6UAKC/kUhaJ0wOLTvb762CioudL87C6xaPVdTF4qcSD6jM4PA==","TransactionReversal","2121","2","22","4","http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BValidation","http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BConfirmation","Remarks","Ocassions");
*/
/*
        m.registerURL("600576","Cancelled","http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BValidation","http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BValidation");
*/
/*
        System.out.println("Hello World!");
*/
/*
        m.balanceInquiry("testapi","AccountBalance","BVeDP3XWGFG+NCQri04jHp6c0rCajO1JAOccQ7Bsu/Mup3Rh2Gd9IHQEE0SeA1oBXAt/VBAL/cJP+VKU9qRF6voqCa0P1XG8pcv5hTZUcBkbbb8Qqvqn28+s/tBvsLXwsB4QaageFDDZgS6b6gbK1p7+UZ/hRYHL8WclTpYBrQGfhqKZxduh0bPWvK4rt+uqR3hdVlO0RdJSkcOVCVp+FxizPSk3nI6LFq14Jj2G0TwuQ4a13J/KVu5eeFG65gzE1NnIVouHKeBPz9b9xvove156aR16uxh4rBq5U6UAKC/kUhaJ0wOLTvb762CioudL87C6xaPVdTF4qcSD6jM4PA==", "600576","4","These","http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BConfirmation","http://obscure-bayou-52273.herokuapp.com/api/Mpesa/C2BConfirmation");
*/
/*
        m.STKPushTransactionStatus("174379","MTc0Mzc5YmZiMjc5ZjlhYTliZGJjZjE1OGU5N2RkNzFhNDY3Y2QyZTBjODkzMDU5YjEwZjc4ZTZiNzJhZGExZWQyYzkxOTIwMTcwODI0MTU1MDU1","20170824155055","ws_CO_27102017101215530");
*/
    }
}

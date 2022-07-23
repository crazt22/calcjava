package com.example.calc10;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class HelloController {
    boolean operatorbool=false;
    boolean zerobool=false;
    String ten="";
    @FXML
    private TextField nuber;

    @FXML
    private Button zero;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;

    @FXML
    private Button numberchangebutton;

    @FXML
    protected void zeroadd(){
        if (zerobool == true) {
        ten += "0";
        zerobool=false;
        if(Integer.parseInt(ten)<=10) {
                operatorbool = true;
                nuber.setText(nuber.getText() + zero.getText());
            }
        }
    }
    @FXML
    protected void oneadd(){
            ten += "1";
        if(Integer.parseInt(ten)<=10) {

            zerobool = true;
            operatorbool = true;
            nuber.setText(nuber.getText() + one.getText());
        }

    }
    @FXML
    protected void twoadd(){
        ten += "2";
        if(Integer.parseInt(ten)<=10) {
            operatorbool = true;
            nuber.setText(nuber.getText() + two.getText());
        }
    }

    @FXML
    protected void threeadd(){
        ten += "3";
        if(Integer.parseInt(ten)<=10) {
            operatorbool = true;
            nuber.setText(nuber.getText() + three.getText());
        }
    }
    @FXML
    protected void fouradd(){
        ten += "4";
        if(Integer.parseInt(ten)<=10) {
            operatorbool = true;
            nuber.setText(nuber.getText() + four.getText());
        }
    }
    @FXML
    protected void fiveadd(){
        ten += "5";
        if(Integer.parseInt(ten)<=10) {
            operatorbool = true;
            nuber.setText(nuber.getText() + five.getText());
        }
    }

    @FXML
    protected void sixadd(){
        ten += "6";
        if(Integer.parseInt(ten)<=10) {
            nuber.setText(nuber.getText() + six.getText());
            operatorbool = true;
        }
    }
    @FXML
    protected void sevenadd(){
        ten += "7";
        if(Integer.parseInt(ten)<=10) {
            nuber.setText(nuber.getText() + seven.getText());
            operatorbool = true;
        }
    }
    @FXML
    protected void eightadd(){
        ten += "8";
        if(Integer.parseInt(ten)<=10) {
            nuber.setText(nuber.getText() + eight.getText());
            operatorbool = true;
        }
    }
    @FXML
    protected void nineadd(){
        ten += "9";
        if(Integer.parseInt(ten)<=10) {
            nuber.setText(nuber.getText() + nine.getText());
            operatorbool = true;
        }
    }
    @FXML
    protected void plusadd() {
        if (operatorbool == true) {
            nuber.setText(nuber.getText() + "+");
            operatorbool=false;
            ten="";
        }
    }
    @FXML
    protected void minusadd(){
     if(operatorbool==true){
        nuber.setText(nuber.getText()+"-");
         operatorbool=false;
         ten="";
     }
    }
    @FXML
    protected void multiplyadd(){
        if(operatorbool==true) {
            nuber.setText(nuber.getText() + "*");
            operatorbool=false;
            ten="";
        }
    }
    @FXML
    protected void devideadd(){
        if(operatorbool==true) {
            nuber.setText(nuber.getText() + "/");
            operatorbool=false;
            ten="";
        }
    }
    @FXML
    protected void EqualButton() throws Exception {
        //Calc.calculate(nuber.getText());
        try {
            nuber.setText(Calc.Calculation(nuber.getText()));
        } catch (Exception e) {
            throw new Exception(e.getMessage().toString());
            //throw new RuntimeException(e.getCause());
        }

    }
    @FXML
    protected void DeleteButton()
    {
        ten="";
        nuber.setText("");
    }


    @FXML
    protected void numberchange(){
        if(numberchangebutton.getText()!="Сменить на арабские") {
            numberchangebutton.setText("Сменить на арабские");
            zero.setText("I");
            one.setText("II");
            two.setText("III");
            three.setText("IV");
            four.setText("V");
            five.setText("VI");
            six.setText("VII");
            seven.setText("VIII");
            eight.setText("IX");
            nine.setText("X");
        }
        else
        {
            numberchangebutton.setText("Сменить на римские");
            zero.setText("0");
            one.setText("1");
            two.setText("2");
            three.setText("3");
            four.setText("4");
            five.setText("5");
            six.setText("6");
            seven.setText("7");
            eight.setText("8");
            nine.setText("9");

        }

    }
}
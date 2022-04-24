package pl.coderslab.tdd.creation.tdd.assertions;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {

   public static int add(int a, int b){
        return a+b;
    }

    public static int deduct(int a, int b){
        return a-b;
    }
   public static int multiply(int a, int b){
        return a*b;

    }
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("nie można dzielić przez zero");
        }
        return a / b;
    }
    public int eval(String input) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("javascript");
        return Integer.parseInt(engine.eval(input).toString());
    }
    public boolean greater(int a, int b) {
        return a < b;
    }
}

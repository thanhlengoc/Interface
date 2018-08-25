/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Ex;

/**
 *
 * @author ThanhLe
 */
import java.lang.*;

public class MamalInt implements Animal {
    @Override
    public void eat() {
        System.out.println("Eat");
    }
    @Override
    public void travel() {
        System.out.println("Travel");
    }
    public static void main(String as[]) {
        MamalInt m = new MamalInt();
        m.eat();
        m.travel();
    } 
}
interface Animal {
    public void eat();
    public void travel();
}

import java.util.Scanner;

public class App { 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner leer=new Scanner(System.in);
        //solicitar los numeros
        System.out.println("Escribe el primer numero");
        int x = leer.nextInt();
        System.out.println("escribe el segundo numero");
        int y = leer.nextInt();
        //nos aseguramos de que sean diferentes
         while (x==y) {
            System.out.println("El segundo numero debe ser diferente al primero");
            y=leer.nextInt();
        }
            System.out.println("escribe el tercer numero");
            int z =leer.nextInt();
            while (z==x || z==y) {
                System.out.println("El tercer numero debe ser diferente a los dos anteriores");
                z=leer.nextInt();
                //suma de los mas bajos
                if ( x<z && y<z) {
                    int sumadelosmasbajos;
                    if(x <= y && x<=z) {
                        sumadelosmasbajos = x + (y<z ? y:z);
                }
                else if (y<=x && y<=z) {
                    sumadelosmasbajos=y +(x<z ?x:z);
                }
                else {
                    sumadelosmasbajos= z+( x<y ? x:y);
                }
                int diferenciadelosmasgrandes;
                if(x>= y && x>=z){
                    diferenciadelosmasgrandes=x-(y>z ? x:z);
                 } else if (y>=x && y>=z) {
                        diferenciadelosmasgrandes= z-(x>y ? x:y);
                    }
            else{
                diferenciadelosmasgrandes=z-(x>y ? x:y);
            }
            //demostrar el numeros mayor
            int elnumeromayor;
            if(x>y && x>z) {
                elnumeromayor=x;
        }
        else if (y>x && y > z){
            elnumeromayor =y;
    }
    else{ elnumeromayor= z;
 }
 //mostramos en pantalla los resultados
 System.out.println(" la suma de los numeros mas bajos es :"+sumadelosmasbajos);
 System.out.println(" la diferencia de los mas grandes es:"+diferenciadelosmasgrandes);
 System.out.println("el numero mayor es :"+elnumeromayor);
 leer.close();
    }
}
}
}
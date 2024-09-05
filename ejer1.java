import javax.swing.JOptionPane;
public class ejer1 {
 public static void main(String args[]) {
	 
	 int n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño"));
	 int[] a=new int[n];
	 int[] b=new int[a.length];
	 int[] c=new int[n];
	 
	 for (int i = 0; i < c.length; i++) {
		 a[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de A en la posicion" +i));
		 System.out.print(a[i]+"|");
		 }
	 	System.out.println();
	 for (int i = 0; i < c.length; i++) {
		 b[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de B en la posicion" +i));
		 System.out.print(b[i]+"|");
		 }
	 	System.out.println();
	 
	 for (int i = 0; i < c.length; i++) {
		 c[i]=a[i]+b[i];
		 System.out.print(c[i]+"|");
		 }
	 
	 
	 }
 }


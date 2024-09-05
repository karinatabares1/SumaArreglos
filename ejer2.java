import javax.swing.JOptionPane;
public class ejer2 {
	public static void main(String args[]) {
		 
		 int K=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño"));
		 int[] M=new int[K];
		 int[] P=new int[M.length];
		 int[] c=new int[K];
		 
		 for (int i = 0; i < c.length; i++) {
			 M[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de A en la posicion" +i));
			 System.out.print(M[i]+"|");
			 }
		 	System.out.println();
		 for (int i = 0; i < c.length; i++) {
			 M[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de B en la posicion" +i));
			 System.out.print(M[i]+"|");
			 }
		 	System.out.println();
		 
		 for (int i = 0; i < c.length; i++) {
			 c[i]=M[i]+c[i];
			 System.out.print(c[i]+"|");
			 }
		 
		 
		 }
}

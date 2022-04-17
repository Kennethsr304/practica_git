package practica_git;
import javax.swing.JOptionPane;
public class Empleado extends Trabajador{
    private int salario;
    private int extras;
    private int bono;
    private String posicion;
    
    public Empleado(){
        
    }

    public Empleado(int salario, int extras, int bono, String posicion, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.salario = salario;
        this.extras = extras;
        this.bono = bono;
        this.posicion = posicion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
  public void imprimirDatos(){
      JOptionPane.showMessageDialog(null, "El nombre del trabajdor es: "+getNombre()
      +"\n La edad es: "+getEdad()
      +"\n El genero es: "+getGenero()
      +"\n El salario es: "+salario
      +"\n El monto por las horas extras es: "+extras
      +"\n El bono laboral es: "+bono
      +"\n La posicion laboral del trabajador es: "+posicion);
  }
  public static void main(String[] args){
      Empleado sal=new Empleado();
      double suma=0, salariobruto,impuesto, salariototal=0;
      int limite,i;
      limite=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de trabajadores que desea:"));
      for(i=1;i<=limite;i++){
          
      sal.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del trabajador"));
      sal.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del trabajador")));
      sal.setGenero(JOptionPane.showInputDialog("Ingrese el genero del trabajador M o F").charAt(0));
      sal.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del trabajador")));
      sal.setExtras(Integer.parseInt(JOptionPane.showInputDialog("Ingrese las extras del trabajador")));
      sal.setBono(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el bono del trabajador")));
      sal.setPosicion(JOptionPane.showInputDialog("Ingrese la posicion laboral del trabajador"));
      impuesto=(sal.getSalario()+sal.getExtras()+sal.getBono())*0.1050;
      salariobruto=(sal.getSalario()+sal.getExtras()+sal.getBono())-impuesto;
      sal.imprimirDatos();
      JOptionPane.showMessageDialog(null,"El salario total del trabajador es: " +salariobruto);
      suma+=salariobruto;
      }
      salariototal=suma/limite;
      JOptionPane.showMessageDialog(null,"El salario total del grupo de los trabajadores es: "+salariototal);

  }
}

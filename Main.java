import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer opcion = 0;
        String nombre;
        String telefono;
        Agenda agenda = new Agenda();

        do{
            System.out.println("1) agregar un contacto \n2) buscar un contacto \n3) mostrar todos los contactos \n4) salir");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Ingresa nombre: ");
                    nombre = scanner.next();
                    System.out.print("Ingresa teléfono: ");
                    telefono = scanner.next();
                    Contacto contacto = new Contacto(nombre, telefono);
                    agenda.agregarContacto(contacto);
                    System.out.println("Contacto agregado");
                    break;
                case 2:
                    System.out.print("Ingresa nombre que quiere buscar: ");
                    nombre = scanner.next();
                    Contacto contEnc = agenda.buscarContacto(nombre);
                    if(contEnc != null){
                        System.out.println("Contacto encontrado: " + contEnc);
                    }else {
                        System.out.println("No se encontró");
                    }
                    break;
                case 3:
                    agenda.mostrarContacto();
                    break;
                default:
                    System.out.println("Saliendo");
                    break;
            }

        } while (opcion == 1||opcion == 2||opcion == 3);
        scanner.close();

    }
}
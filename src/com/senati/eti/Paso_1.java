package com.senati.eti;

import java.util.ArrayList;
import java.util.Scanner;

public class Paso_1 {

	public static void main(String[] args) {
		
		Scanner Cajero = new Scanner(System.in);
		
		ArrayList<String> arrcodigo = new ArrayList<String>();
		
		ArrayList<String> arrusuario = new ArrayList<String>();
		
		ArrayList<String> arrclave = new ArrayList<String>();
		
		ArrayList<Float> arrmonto = new ArrayList<Float>();
		
		
		arrcodigo.add("962162");arrcodigo.add("953349");arrcodigo.add("923678");
		
		arrusuario.add("Brandon Villafranco");arrusuario.add("Elioth Saldivar");arrusuario.add("Luis Taype");
		
		arrclave.add("0710");arrclave.add("1702");arrclave.add("6901");
		
		arrmonto.add(1500.0f);arrmonto.add(1500.0f);arrmonto.add(1500.0f);
		
		String idioma;
		System.out.println("********************************");
		System.out.println("          ELIJA EL IDIOMA         ");
		System.out.println("********************************");
		System.out.println("Español......................[1]: ");
		System.out.println("Inglés.......................[2]: ");
		idioma = Cajero.nextLine();
		
		switch(idioma) {
		case "1":
			String pregunta_inicial;
			do{
				System.out.println();
				System.out.println("                Menú Principal           ");
				System.out.println("Iniciar.............................[1]: ");
				System.out.println("Registrarse(solo si no tiene cuenta)[2]: ");//1era funcion del cajero.
				pregunta_inicial = Cajero.nextLine();
				
				switch (pregunta_inicial) {
				case "1":
					System.out.print("Ingrese su codigo de cuenta: ");
					String codigo = Cajero.nextLine();
					
					while(arrcodigo.contains(codigo) == false) {
						System.out.print("Ingrese su codigo de cuenta: ");
						codigo = Cajero.nextLine();
					}
					
						System.out.println("Cuenta valida");
						System.out.println();
						System.out.println("**************************************");
						System.out.println(" 	   B I E N V E N I D O       ");
						System.out.println("**************************************");
						
						
						

						int a=3;
						System.out.println("TIENESE 3 INTENTOS, DE LO CONTRARIO EL SISTEMA SE REINICIARA");
						System.out.println();
						while(a>0) {

							System.out.print("Clave: ");
							String clave_usuario = Cajero.nextLine();
							if (arrcodigo.indexOf(codigo)==arrclave.indexOf(clave_usuario)) {
								System.out.println("CLAVE CORRECTA");
								break;
							}
							else {
								System.out.println("CLAVE INCORRECTA");
								System.out.println("\nRecuerda que te quedan "+(a-1)+" intento(s).");
								System.out.println("\n");
							}
							a--;

						}
						String condicion = "S";
						if(a == 0) {
							condicion = "";
							System.out.println("El sistema se bloqueo, reinicie el programa o intentelo mas tarde...");
							
						}
							
				
						
						int ubicacion = arrcodigo.indexOf(codigo);
						float saldo = arrmonto.get(ubicacion);
						while(condicion.equalsIgnoreCase("S")) {
							System.out.println("\n¿Qué operación desea relizar? \n1: Mostrar saldo \n2: Depositar \n3: Retirar \n4: Transferencia \n5: Salir");
							String pregunta_2 = Cajero.nextLine();	
							
							switch(pregunta_2) {
							case "1":
								System.out.println();
								System.out.println("Propietario de la cuenta: "+ arrusuario.get(ubicacion));
								System.out.println("Codigo de cuenta: "+arrcodigo.get(ubicacion));
								System.out.println("Saldo: "+saldo);
								System.out.println();
								break;
							case "2":
								System.out.println();
								System.out.println("¿Cuánto desea depositar en su cuenta?");
								float deposito = Cajero.nextFloat();
								Cajero.nextLine();
								saldo += deposito;
								System.out.println(saldo);
								
								System.out.println();
								System.out.println("DEPOSITO EXITOSO");
								System.out.println();
								System.out.println("\nSaldo actual: " +(saldo));
								//Nota al parecer solo puedo sumar enteros. REVISAR
								System.out.println();
								
								break;
								
							case "3":
								System.out.println();
								System.out.println("¿Cuánto desea retirar de su cuenta?");
								float retiro = Cajero.nextFloat();
								Cajero.nextLine();
								if(retiro<=saldo) {
									saldo -= retiro;
									System.out.println("RETIRO EXITOSO");
									System.out.println("\nSaldo actual: "+(saldo));
									
								}else if(retiro>saldo) {
									System.out.println("ERROR");
									System.out.println("-----------------------------------------------------");
									System.out.println("El retiro deseado excede a su saldo actual.");
									System.out.println("Revise su saldo y retire lo adecuado.");
									
								}
								break;
							case "4":
								System.out.println();
								System.out.println("¿Cuánto desea transferir?");
								float transferencia = Cajero.nextFloat();
								Cajero.nextLine();
								if(transferencia<=saldo) {
									System.out.println("Ingrese el número de cuenta o codigo de cuenta a transferir: ");
									String t_codigo = Cajero.nextLine();
									
									while(arrcodigo.contains(t_codigo) == false) {
										System.out.println("Lo sentimos ese codigo no ha sido identificado. Intente de nuevo, por favor.");
										System.out.println();
										System.out.println("\nIngrese el número de cuenta o codigo de cuenta a transferir: ");
										t_codigo = Cajero.nextLine();
									}
									
									if(arrcodigo.contains(t_codigo)) {
										int t_ubicacion = arrcodigo.indexOf(t_codigo); // 0
										float t_monto = arrmonto.get(t_ubicacion);
										t_monto += transferencia;
										saldo -= transferencia;
										System.out.println("TRANSFERENCIA EXITOSA");
										System.out.println("\nSaldo actual: " + (saldo));
										System.out.println();
										System.out.println("Se ha transferido " + transferencia + " a la siguiente cuenta...");
										System.out.println("Usuario: " + arrusuario.get(t_ubicacion));
										System.out.println("De codigo de cuenta: " + t_codigo);
									}
									
								}else if(transferencia>saldo) {
									System.out.println("ERROR");
									System.out.println("-----------------------------------------------------");
									System.out.println("La transferencia deseada excede a su saldo actual.");
									System.out.println("Revise su saldo y transfiera lo adecuado.");
								}
								break;
							
							case "5":
								Cajero.nextLine();
								break;
								
							default:
								System.out.println("No se identifica la operación...");
							}	
							
							
							// Fuera del caso5
							if(pregunta_2.equals("5") == false) {
								System.out.print("¿Desea realizar otra operación?[S/N]");
								condicion = Cajero.nextLine();

								
							}
							else if(pregunta_2.equals("5")) {
								condicion = "";
								System.out.println("      ¡GRACIAS!      ");
								System.out.println("QUE TENGA UN BUEN DÍA");

							}
							
						}
						break;

				case "2":
					System.out.print("Ingrese su nombre completo, por favor: ");
					String usuario_nuevo = Cajero.nextLine();
					//se agrega el nombre del usuario.
					arrusuario.add(usuario_nuevo);
					
					System.out.print("Cree un código de cuenta: ");
					String codigo_nuevo = Cajero.nextLine();
					//se agrega un nuevo codigo relacionado al nuevo usuario.
					arrcodigo.add(codigo_nuevo);
					
					System.out.print("Cree una clave: ");
					String clave_nuevo = Cajero.nextLine();
					arrclave.add(clave_nuevo);
					
					float pr_deposito = 0.0f;
					arrmonto.add(pr_deposito);
				
					System.out.println("\nTu pedido se esta procesando...");
					System.out.println("\nFELICIDADES YA POSEES UNA CUENTA ");
					System.out.println("Volveras al Menú Principal");
					break;
					
				default:
					System.out.println("Valor ingresado no válido");
					System.out.println("Ingrese [1] o [2] segun la operación que desee");
				}
			}while(pregunta_inicial.equals("2"));
			
			/*System.out.println();
			System.out.println("      ¡GRACIAS!      ");
			System.out.println("QUE TENGA UN BUEN DÍA");*/
			break;
			
			
			
		// VERSION INGLES	
			
			
		case "2":
			pregunta_inicial = "";
			do{
				System.out.println();
				System.out.println("                    Main menu                    ");
				System.out.println("Start........................................[1]: ");
				System.out.println("Register (only if you do not have an account)[2]: ");//1era funcion del cajero.
				pregunta_inicial = Cajero.nextLine();
				
				switch (pregunta_inicial) {
				case "1":
					System.out.print("Enter your account code: ");
					String codigo = Cajero.nextLine();
					
					while(arrcodigo.contains(codigo) == false) {
						System.out.print("Enter your account code: ");
						codigo = Cajero.nextLine();
					}
					
						System.out.println("Valid account");
						System.out.println();
						System.out.println("**************************************");
						System.out.println(" 	       W E L C O M E         ");
						System.out.println("**************************************");
						
						
						

						int a=3;
						System.out.println("YOU HAVE 3 TRIES, OTHERWISE THE SYSTEM WILL RESTART");
						System.out.println();
						while(a>0) {

							System.out.print("Passaword: ");
							String clave_usuario = Cajero.nextLine();
							if (arrcodigo.indexOf(codigo)==arrclave.indexOf(clave_usuario)) {
								System.out.println("Correct password");
								break;
							}
							else {
								System.out.println("Incorrect password");
								System.out.println("Remember that you have "+(a-1)+" attempts left.");
								System.out.println("\n");
							}
							a--;

						}
						String condicion = "S";
						if(a == 0) {
							condicion = "";
							System.out.println("The system crashed, restart the program or try again later ...");
							
						}
							
				
						
						int ubicacion = arrcodigo.indexOf(codigo);
						float saldo = arrmonto.get(ubicacion);
						while(condicion.equalsIgnoreCase("S")) {
							System.out.println("\nWhat operation do you want to carry out? \n1: Show balance \n2: To deposit \n3: Remove \n4: Transfer \n5: Leave");
							String pregunta_2 = Cajero.nextLine();	
							
							switch(pregunta_2) {
							case "1":
								System.out.println();
								System.out.println("Account owner: "+ arrusuario.get(ubicacion));
								System.out.println("Account code: "+arrcodigo.get(ubicacion));
								System.out.println("Balance: "+saldo);
								System.out.println();
								break;
							case "2":
								System.out.println();
								System.out.println("How much do you want to deposit into your account?");
								float deposito = Cajero.nextFloat();
								Cajero.nextLine();
								saldo += deposito;
								System.out.println(saldo);
								
								System.out.println();
								System.out.println("\nSuccessful deposit");
								System.out.println();
								System.out.println("Current balance: " +(saldo));
								//Nota al parecer solo puedo sumar enteros. REVISAR
								System.out.println();
								
								break;
								
							case "3":
								System.out.println();
								System.out.println("How much do you want to withdraw from your account?");
								float retiro = Cajero.nextFloat();
								Cajero.nextLine();
								if(retiro<=saldo) {
									saldo -= retiro;
									System.out.println("Successful withdrawal");
									System.out.println("Current balance: "+(saldo));
									
								}else if(retiro>saldo) {
									System.out.println("ERROR");
									System.out.println("-----------------------------------------------------");
									System.out.println("The desired withdrawal exceeds your current balance.");
									System.out.println("Check your balance and withdraw the appropriate.");
									
								}
								break;
							case "4":
								System.out.println();
								System.out.println("How much do you want to transfer?");
								float transferencia = Cajero.nextFloat();
								Cajero.nextLine();
								if(transferencia<=saldo) {
									System.out.println("Enter the account number or account code to transfer: ");
									String t_codigo = Cajero.nextLine();
									
									while(arrcodigo.contains(t_codigo) == false) {
										System.out.println("Sorry this code has not been identified. Please try again.");
										System.out.println();
										System.out.println("Enter the account number or account code to transfer: ");
										t_codigo = Cajero.nextLine();
									}
									
									if(arrcodigo.contains(t_codigo)) {
										int t_ubicacion = arrcodigo.indexOf(t_codigo); // 0
										float t_monto = arrmonto.get(t_ubicacion);
										t_monto += transferencia;
										saldo -= transferencia;
										System.out.println("Successful transfer");
										System.out.println("\nCurrent balance: " + (saldo));
										System.out.println();
										System.out.println(transferencia + " has been transferred to the following account ...");
										System.out.println("User: " + arrusuario.get(t_ubicacion));
										System.out.println("Your account code is: " + t_codigo);
									}
									
								}else if(transferencia>saldo) {
									System.out.println("ERROR");
									System.out.println("-----------------------------------------------------");
									System.out.println("The desired transfer exceeds your current balance.");
									System.out.println("Check your balance and transfer the appropriate.");
								}
								break;
							
							case "5":
								Cajero.nextLine();
								break;
								
							default:
								System.out.println("The operation is not identified ...");
							}	
							
							
							// Fuera del caso5
							if(pregunta_2.equals("5") == false) {
								System.out.print("Do you want to perform another operation?[S/N]");
								condicion = Cajero.nextLine();

								
							}
							else if(pregunta_2.equals("5")) {
								condicion = "";
								System.out.println("   THANK YOU!  ");
								System.out.println("HAVE A NICE DAY");

							}
							
						}
						break;

				case "2":
					System.out.print("Enter your full name, please: ");
					String usuario_nuevo = Cajero.nextLine();
					//se agrega el nombre del usuario.
					arrusuario.add(usuario_nuevo);
					
					System.out.print("Create an account code: ");
					String codigo_nuevo = Cajero.nextLine();
					//se agrega un nuevo codigo relacionado al nuevo usuario.
					arrcodigo.add(codigo_nuevo);
					
					System.out.print("Create a password: ");
					String clave_nuevo = Cajero.nextLine();
					arrclave.add(clave_nuevo);
					
					float pr_deposito = 0.0f;
					arrmonto.add(pr_deposito);
				
					System.out.println("\nYour order has been processed...");
					System.out.println("\nCongratulations, you already have an account ");
					System.out.println("You will return to the Main Menu");
					break;
					
				default:
					System.out.println("Invalid entered value");
					System.out.println("Enter [1] or [2] depending on the operation you want");
				}
			}while(pregunta_inicial.equals("2"));
			
			/*System.out.println();
			System.out.println("   THANK YOU!  ");
			System.out.println("HAVE A NICE DAY");*/
			break;
			
		default:
			System.out.println("Invalid Value ...");	
		}

	}

}
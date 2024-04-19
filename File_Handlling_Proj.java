
package Project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handlling_Proj {
	

			public static void main(String[] args) throws IOException {
				
			Scanner scanner = new Scanner(System.in);
		
		
				int options;
				String fname;
				

				System.out.println("================************=================");
				System.out.println("-------------Welcome to my Application-------");
				System.out.println("-------------Regina Machava----------------");
				System.out.println("-------------Java Full Stack Developer------");
				System.out.println("===============************==============");
				
				
				do
				{
					
					System.out.println("operations");
					System.out.println("1. File creation");
					System.out.println("2. Write in the file ");
					System.out.println("3. Reading a file ");
					System.out.println("4. Delete the file ");
					System.out.println("5. Search the file");
					System.out.println("6. List of Files ");
					System.out.println("7. Exit");
					
					System.out.println("enter your choice !!");
					options=scanner.nextInt();
					
					switch(options)
					{
					case 1:
						
						System.out.println("Enter the file name you want to create : ");
						
						fname=scanner.next();
						
						File f = new File(fname+ ".txt");		
						if(f.createNewFile())
						{
							System.out.println("file created successfully !!");
						}
						else
						{
							if(f.exists())
							{
								System.out.println("File already exist ! ");
							}
							else
							{
								System.out.println("error in creating the file ! ");
							}
						}
						break;
					case  2:
						
						System.out.println("Enter the file name where you want to write : ");
						fname=scanner.next();
						
						Scanner scanner1= new Scanner(System.in);
						
						System.out.println("Enter the content you want to write in the : ");
						
						String content=scanner1.nextLine();
						
						FileWriter fw = new FileWriter(fname+ ".txt");
						fw.write(content);
						
						System.out.println("Data Written successfully in the file ! ");
						
						fw.close();
						break;
						
					case 3:
						
						System.out.println("Enter the name of the file you want to read data from : ");
						fname=scanner.next();
						
						File f2= new File(fname+ ".txt");
						Scanner scanner2 = new Scanner(f2);
						
						while(scanner2.hasNextLine())
						{
							String line=scanner2.nextLine();
							System.out.println(line);
						}
						
						scanner2.close();
						
						
						
						break;
					case 4:
						
						System.out.println("Enter file name which you wanna delete : ");
						fname=scanner.next();
						
						File f3 = new File(fname+ ".txt");
						
						
						if(f3.exists())
						{
							f3.delete();
							System.out.println("File deleted uccessfully ! ");
							
						}
						else
						{
							System.out.println("Error found in deleting the file ! ");
						}
						
						break;
					case 5:
						
						System.out.print("Enter the file name you are searching for :");
						fname=scanner.next();
						
						File f5 = new File("/Users/nkosazane/eclipse-workspace/Phase1");
						
						String[] list = f5.list();
						int fl=0;
						if(list==null)
						{
							System.out.println("File is not present in the directory ! ");
						}
						else
						{
							for(int i=0;i<list.length;i++)
							{
								String searchFile= list[i];
								if(searchFile.equalsIgnoreCase(fname))
								{
									System.out.println("File is present in the directory ! );");
								
									fl=1;
								}
							}
							
							if(fl==0)
							{
								System.out.println("File not found ! ");
							}
						}
						
						
						
						break;
						
					case 6:
						
						System.out.println("List of Files and Folders are : ");
						
						File f6 = new File("/Users/nkosazane/eclipse-workspace/Phase1/");
						
						File[] list1 = f6.listFiles();
						
						for(File name: list1)
						{
							if(name.isDirectory())
							{
								System.out.println(name.getName());
							}
							else if(name.isFile())
							{
								System.out.println(name.getName());
							}
						}
						break;
					case 7:
						System.out.println("Thankyou for using the Application !! ");
						scanner.close();
						System.exit(options);
						break;
						
					default:
						System.out.println("enter the choice : ");
					}
				}
				while(true);
				
				
				

			}

		}


	



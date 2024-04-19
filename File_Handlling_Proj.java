
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
				

				System.out.println("----------------************---------------- \n========== Welcome to my Application ==========");
		        System.out.println("============== Regina Machava ============== \n========== Java Full Stack Developer ===========");
		        System.out.println("----------------************----------------\n");

				
				do
				{
					System.out.println("\n------OPERATIONS------ \n1. File creation \n2. Write in the file \n3. Reading a file \n4. Delete the file ");
			        System.out.println("5. Search the file \n6. List of Files \n7. Exit\n");
					
					System.out.println("enter your choice !!");
					options=scanner.nextInt();
					
					switch(options)
					{
					case 1:
						
						System.out.println("Enter the file name: ");
						
						fname=scanner.next();
						
						File fNum = new File(fname+ ".txt");		
						if(fNum.createNewFile())
						{
							System.out.println("file created successfully !!");
						}
						else
						{
							if(fNum.exists())
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
						
						System.out.println("Enter the content you want to write to the file : ");
						
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
						
						System.out.println("Enter file name which you want to delete : ");
						fname=scanner.next();
						
						File fNumDel = new File(fname+ ".txt");
						
						
						if(fNumDel.exists())
						{
							fNumDel.delete();
							System.out.println("File deleted uccessfully ! ");
							
						}
						else
						{
							System.out.println("Error found in deleting the file ! ");
						}
						
						break;
					case 5:
						
						try
	                    {
	                        File dir = new File("/Users/nkosazane/eclipse-workspace/Phase1");
	                        System.out.print("Enter The File Name To Be Searched: ");
	                        
	                        String fileName = scanner.next();
	                        boolean isFound = searchFile(dir, fileName);

	                        if(isFound)
	                        {
	                            System.out.println("The File Was Found Successfully!!");
	                        }
	                        else
	                        {
	                            System.out.println("The File Was Not Found");
	                        }
	                    }
	                    catch (Exception ex)
	                    {
	                        System.out.println("Error Searching The File");
	                    }
						
						
						break;
						
					case 6:
						
						File fileDirect = new File("/Users/nkosazane/eclipse-workspace/Phase1");
	                    listFileAndDirectory(fileDirect);
	                    break;
	                    
					case 7:
						System.out.println("Thankyou for using the Application !! ");
						scanner.close();
						System.exit(options);
						
						break;
						
					default:
						System.out.println("OOPS! I think You have made a mistake. Please enter your choice again.");
					}
				}
				while(true);
				

			}
			
			public static boolean searchFile(File fileDirect, String fName) throws IOException
		    {
		        boolean isFound = false;
		        File data[] = fileDirect.listFiles();

		        
		        for(File item: data)
		        {
		            if(item.isFile())
		            {
		                if(fName.equalsIgnoreCase(item.getName()))
		                {
		                    isFound = true;
		                    break;
		                }
		            }
		            else if(item.isDirectory())
		            {
		                searchFile(item.getAbsoluteFile(), fName);
		            }
		        }
		        return isFound;
		    }
			
			
			public static void listFileAndDirectory(File fileDirect)
		    {
		        System.out.println("\n----List of Files and Folders Names---");

		        File data[] = fileDirect.listFiles();
		        for(File item: data)
		        {
		            if(item.isFile())
		            {
		                System.out.println("File: " + item.getName());
		            }
		            else if(item.isDirectory())
		            {
		                System.out.println("Folder: " + item.getName());
		            }
		        }
		    }

		}


	



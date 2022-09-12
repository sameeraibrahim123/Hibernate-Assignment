package client;

import java.util.Scanner;

import entities.Author;
import service.AuthorService;
import service.AuthorServiceImpl;

public class Client {

	public static void main(String[] args) {

		AuthorService service=new AuthorServiceImpl();
		int ch=5;
		Scanner sc=new Scanner(System.in);
		 int author_Id;
		 String firstName;
		 String middleName;
		 String lastName;
		 int phoneNo;
		Author a1;
		do
		{
			System.out.println("------------------Author Menu-------------");
			System.out.println("1. Insert Author");
			System.out.println("2. Update Author");
			System.out.println("3. Delete Author");
			System.out.println("4. Display Author");
			System.out.println("5. Exit");
			System.out.println("Enter Choice(1..5) ");
			ch=sc.nextInt();
				switch(ch)
			{
				case 1:
						System.out.println("Enter Author Id, firstName, middleName, LastName and phoneNo. ");
						author_Id=sc.nextInt();
						firstName=sc.next();
						middleName=sc.next();
						lastName=sc.next();
						phoneNo=sc.nextInt();
						a1=new Author();
						a1.setAuthor_Id(author_Id);
						a1.setFirstName(firstName);
						a1.setMiddleName(middleName);
						a1.setLastName(lastName);
						a1.setPhoneNo(phoneNo);
						service.addauthor(a1);
						break;
				case 2:
						System.out.println("Enter Author Id and updated PhoneNo ");
						author_Id=sc.nextInt();
						phoneNo=sc.nextInt();
						a1=service.getauthorById(author_Id);
						if (a1==null)
							System.out.println("Author not found");
						else
						{
							a1.setPhoneNo(phoneNo);
							service.updateauthor(a1);
						}
						break;
				case 3:	System.out.println("Enter Author Id to be delete ");
						author_Id=sc.nextInt();
						a1=service.getauthorById(author_Id);
						if (a1==null)
							System.out.println("Author not found");
						else
						{
							service.removeauthor(a1);
						}
						break;
				case 4:	System.out.println("Enter Author Id to be search...");
						author_Id=sc.nextInt();
						a1=service.getauthorById(author_Id);
						if (a1==null)
							System.out.println("Author not found");
						else
						{
							System.out.println("author id "+a1.getAuthor_Id()+"\tAuthorFirstName "+a1.getFirstName()+"\tAuthorMiddleName "+a1.getMiddleName()+"\tAuthorLastName "+a1.getLastName()+"\tPhonrNo "+a1.getPhoneNo());
						}

						break;
				case 5: System.exit(0);

			}



		}while(ch!=5);
	}

}

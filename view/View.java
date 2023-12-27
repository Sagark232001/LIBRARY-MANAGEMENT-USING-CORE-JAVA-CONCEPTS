package edu.qsp.lms.view;
import java.util.Scanner;

import edu.qsp.lms.controller.Controller;
import edu.qsp.lms.model.Book;
import edu.qsp.lms.model.Library;

public class View {
	static Scanner Input = new Scanner(System.in);
	static Library library = new Library();
	static Controller controller = new Controller();
	static {
		System.out.println("-----Welcome To Library Management System-----");
		System.out.println("Enter Library Name:-");
		String libraryName = Input.nextLine();
		library.setLibraryName(libraryName);
		System.out.println("Enter Library Address:-");
		String libraryAddress = Input.nextLine();
		library.setLibraryAddress(libraryAddress);
		System.out.println("Enter Library Pincode:-");
		int libraryPincode = Input.nextInt();
		library.setPincode(libraryPincode);
		Input.nextLine();	
		
	}
	public static void main(String[] args) {
		do {
			System.out.println("Select Operation To Perform: ");
			System.out.println("1. Add book .\n2. Remove book.\n3. Update book.\n4. Get book by name.\n5. Get all book .\n0. Exit ");
			int choice = Input.nextInt();
			Input.nextLine();
			switch (choice) {
			case 0:
				Input.close();
				System.out.println("-------Exited-------");
				System.exit(0);
				break;
			case 1:
				Book book1 = new Book();
				System.out.println("Enter book name");
				book1.setBookName(Input.nextLine());
				System.out.println("Enter book author name");
				book1.setBookAuthor(Input.nextLine());
				System.out.println("Enter book price");
				book1.setBookPrice(Input.nextDouble());
				System.out.println("Enter book publication");
				book1.setPublication(Input.nextLine());
				Input.nextLine();
				//
				controller.addBook(book1);
				break;
			case 2:
				
				System.out.println("Enter book name to remove");
				String bookToRemove = Input.nextLine();
				boolean verifyBookToRemove = controller.removeBook(bookToRemove);
				if (verifyBookToRemove) {
					System.out.println("Book  removed");
				}
				else {
					System.out.println("book not exist ");
				}
				break;
			case 3:
				Book book3 = new Book();
				System.out.println("Enter book name to update");
				String bookToUpdate = Input.nextLine();
				boolean verifyBookToUpdate = controller.updateBookPriceByBookName(book3);
				System.out.println("Enter book price");
				double updatePrice = Input.nextDouble();
				if (verifyBookToUpdate) {
					book3.setBookPrice(updatePrice);
				} else {
					System.out.println("book not exist ");
				}
				
				break;
			case 4:
				System.out.println("Enter book name to get");
				String bookToGet = Input.nextLine();
				Book book = controller.searchBook(bookToGet);
				if(book!=null) {
					System.out.println("Book availabe"+book);
				}
				else {
					System.out.println("book not exist ");
				}
				break;
			case 5:
				System.out.println(controller.getAllBooks());
				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}
		} while (true);
	}
}

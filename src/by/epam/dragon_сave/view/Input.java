package by.epam.dragon_сave.view;

import java.util.Scanner;

import by.epam.dragon_сave.controller.CommandName;
import by.epam.dragon_сave.controller.Controller;
import by.epam.dragon_сave.controller.Request;
import by.epam.dragon_сave.controller.Response;

public class Input
{

	Controller controller = new Controller();
	Output output = Output.getInstance();

	public void userEnter()
	{
		try (Scanner sc = new Scanner(System.in))
		{
			while (true)
			{
				output.printMenu();
				System.out.print("Enter> ");

				while (!sc.hasNextInt())
				{

					System.out.println("\t" + sc.next() + "??? Error, You have entered an invalid value.");
					output.printMenu();
					System.out.print("Enter> ");
				}

				int input = sc.nextInt();

				switch (input)
				{

					case 1:
						Request request1 = new Request(CommandName.JEWEL_LIST.name());
						Response response1 = controller.send(request1);
						output.print("\tJewel list:", response1.getListJewelry());
						break;

					case 2:
						Request request2 = new Request(CommandName.MAX_PRICE.name());
						Response response2 = controller.send(request2);
						output.print("\tJewel with the highest price:", response2.getListJewelry());
						break;

					case 3:
						System.out.println("\tEnter an amount between 20 and 100 inclusive.");
						System.out.print("Enter> ");

						while (!sc.hasNextInt())
						{
							System.out.println("\t" + sc.next() + "??? Error, You have entered an invalid value.");
							output.printMenu();
							System.out.print("Enter> ");
						}

						double limitPrice = sc.nextInt();

						Request request3 = new Request(CommandName.BY_SUM.name(), limitPrice);
						Response response3 = controller.send(request3);
						output.print("\tTreasures by sum:", response3.getListJewelry());
						break;

					case 0:
						System.out.println("Good luck.");
						return;

					default:
						Request errorReequest = new Request(String.valueOf(input));
						Response errorResponse = controller.send(errorReequest);
						output.print(errorResponse);
				}
			}
		}
	}
}

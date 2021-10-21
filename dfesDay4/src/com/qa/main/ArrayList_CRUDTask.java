package com.qa.main;

import java.util.ArrayList;

public class ArrayList_CRUDTask {

//		Exercise - You are running a successful cafe called QA-Cafe. 
//		With a list of orders, create methods with parameters that can
//		do the following:
//
//		2 ArrayLists, one doneOrders and orders
//
//			- Add a new order to an orders array
//			- Move an existing order to a 'Done orders array'
//			- Return the name of an order
//			- Modify the order by index with a new name
//			- Remove the order from either arrays
//			- Print the length of either arrays
//			- Clear either arrays
		
		public static ArrayList<String> orders = new ArrayList<>();
		public static ArrayList<String> doneOrders = new ArrayList<>();
		
		public static void addOrder(String newOrder) {		
			orders.add("Small Espresso");
			orders.add("Large Cold Brew");
			orders.add("Medium Cappuccino");
			orders.add("Large Choc Cookie Frappe");
			orders.add("Small Caramel Iced Latte");
			orders.add("Small Americano");
			orders.add("lettuce");
			orders.add("Large Cafe Au Lait");
			orders.add("Medium Strawberry Iced Tea");
		}
		
		public static void moveOrder(int index) {
			
			doneOrders.add(null);
		}
		
		public static void removeOrder(int index) {
			
			System.out.println(orders);
			
			orders.add(null);
		}
		
		public static void updateOrder(int index, String newOrder) {
			
			System.out.println(orders);
			
			orders.add(null);
		}
	}



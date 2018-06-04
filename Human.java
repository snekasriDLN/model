package com.java;

public abstract class Human implements Travel{
}
	class Women extends Human{
		
		@Override
		public int getspeed() {
			return 50;
		}
		
		public static void main(String[] args) {
		}
	}
		class Men extends Human{

			@Override
			public int getspeed() {
				return 70;
			}
		}
			class Child extends Human{

				@Override
				public int getspeed() {
					return 20;
				}
				
		
			}
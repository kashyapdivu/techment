package com.techment.assignment1.oops;


interface Rewardable {
	
	int rewardPoint(int amount);
}

abstract class PrepaidCard {
	
	private int CardNo;
	private double availableBalance;
	private double swipeLimit;
	
	abstract boolean swipeCard (int amount) ;

	@Override
	public String toString() {
		return "PrepaidCard [CardNo=" + CardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	
	
	void rechargeCard (int amount) {
		availableBalance +=amount;
	}
}


class TravelCard extends PrepaidCard implements Rewardable{

	@Override
	boolean swipeCard(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int rewardPoint(int amount) {
	
		return 0;
	}
	
	
	
	
	
}
 








public class TestCard {

	public static void main(String[] args) {


	}

}

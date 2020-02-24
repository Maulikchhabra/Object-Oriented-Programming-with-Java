class Player{
	
		int teamNo;
		String teamName;
		int playerNo;
		String playerName;
		
	    void showInfo(){
			System.out.println("-------------------------------");
			System.out.println("Player Details :");
			System.out.println("Team number :"+teamNo);
			System.out.println("Team name:"+teamName);
			System.out.println("Player name :"+playerName);
			System.out.println("Player number :"+playerNo);
			//System.out.println("-------------------------------");
			//Sytem.out.println(equipment);
			
		}
	
	void dim(){
	}
	
}

class Cricket_Player extends Player{ //extending player thru cricket player
	
	Cricket_Player(){
		teamNo= 1;
		teamName =new String("India");
		playerName=new String("Mahender Singh Dhoni");
		playerNo= 7;
      		
	}
	
	void dim(){
		int diameter = 137;
		int length = 20;
		int width = 10;
		System.out.println("Diameter ="+diameter);
		System.out.println("Pitch Length = "+length);
		System.out.println("Pitch Width = "+width);
		
	}
}

class Football_Player extends Player{ //extending player thru football player
	
	Football_Player(){
		teamNo= 2;
        teamName=new String("Argentina");
        playerNo= 10;
        playerName=new String("Lionel Messi");		
	}
	
	void dim(){
		int length = 100;
		int width = 60;
		System.out.println("Length ="+length);
		System.out.println("Width ="+width);
	}
	
}

class Hockey_player extends Player{ //extending player thru hockey player
	
	Hockey_player(){
		teamNo= 3;
		teamName= new String("India");
		playerNo= 5;
		playerName= new String("Dhyanchand");
	}
	
	void dim(){
		int length = 91;
		int width = 55;
		System.out.println("Pitch Length ="+length);
		System.out.println("Width ="+width);
	}
	
	
}

public class InheritancePlayer{
	public static void main(String []args){
		Cricket_Player c1 = new Cricket_Player();
		Football_Player f1 = new Football_Player();
		Hockey_player h1 = new Hockey_player();
		
		c1.showInfo();
		c1.dim();
		
		f1.showInfo();
		f1.dim();
		
		h1.showInfo();
		h1.dim();
	}
}
package com.edu;

import org.springframework.beans.factory.annotation.Autowired;

public class HumanBody 
{
	@Autowired //field with Autowired
private HumanHeart humanHeart;


//dependency injection constructor
//	@Autowired //constructor Based Autowired
public HumanBody(HumanHeart humanHeart) {
	
	this.humanHeart = humanHeart;
}


public void humanMethod()
{
	if(humanHeart!=null)
	{
		System.out.println("Human Is Alive");
		humanHeart.heartBeat();
	}
	else
	{
		System.out.println("Human Is not Alive");
	}
}
}

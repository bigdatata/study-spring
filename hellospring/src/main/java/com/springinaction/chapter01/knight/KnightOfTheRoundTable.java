package com.springinaction.chapter01.knight;

public class KnightOfTheRoundTable implements Knight {

	private String name;
	private Quest quest;
	public KnightOfTheRoundTable(String name){
		this.name=name;
	}
	public Object embarkOnQuest() throws QuestFailedException {
		System.out.printf("knight %s embark on holyGrailQuest\n",name);
		return quest.embark();
	}
	public void setQuest(Quest quest) {
		this.quest = quest;
	}
	
	public String getName(){
		return name;
	}

}

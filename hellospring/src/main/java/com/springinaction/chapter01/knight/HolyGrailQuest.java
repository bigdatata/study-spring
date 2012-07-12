package com.springinaction.chapter01.knight;

public class HolyGrailQuest implements Quest {

	public Object embark() throws QuestFailedException {
		// Do whatever it means to embark on a quest
		return new HolyGrailQuest();
	}

}

package org.pavan.poc.BddPoc.Jbehave;

import net.serenitybdd.jbehave.SerenityStory;

public class AdditionTestSuite extends SerenityStory{
	
	@Override
	protected String getStoryPath() {
		String ownPath = "**/*.story";
		return ownPath;
	}

}

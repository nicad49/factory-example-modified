package factories;

import javax.naming.Context;

import interfaces.IControl;
import interfaces.IControlFactory;
import models.ExerciseControl;
import models.MultiplierControl;
import models.RankControl;

public class CardControlFactory implements IControlFactory{
	

	public CardControlFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public IControl CreateExerciseControl() {
		
		return new ExerciseControl();
	}

	@Override
	public IControl CreateMultiplierControl() {

		return new MultiplierControl();
		
	}

	@Override
	public IControl CreateRankControl() {
		
		return new RankControl();
		
	}
	
	public void makeUI() {
		IControl exerciseControl = this.CreateExerciseControl();
		IControl multiplierControl = this.CreateMultiplierControl();
		IControl rankControl = this.CreateRankControl();
		
		exerciseControl.createControl();
		multiplierControl.createControl();
		rankControl.createControl();
	}

}

package rock.view;

import javax.swing.*;
import rock.controller.RockController;

public class RockFrame
{

	private RockController baseController;
	private RockPanel appPanel;
	
	public RockFrame(RockController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new RockPanel(baseController);
	}
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("ROCK, PAPER, SISSORS");
		this.setSize(new Dimension(900, 600));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}

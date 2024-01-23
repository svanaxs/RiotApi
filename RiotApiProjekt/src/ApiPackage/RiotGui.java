package ApiPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import ApiPackage.Fetcher.Suchen;

import ApiPackage.Fetcher.Select;

import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class RiotGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblName;
	private JLabel lblRank;
	private JLabel lblTier;
	private JLabel lblWins;
	private JLabel lblLosses;
	private JLabel lblRatio;
	private JLabel lblInactive;
	private JLabel lblLevel;
	private JLabel lblNameOut;
	private JLabel lblRankOut;
	private JLabel lblTierOut;
	private JLabel lblWinsOut;
	private JLabel lblLossesOut;
	private JLabel lblRatioOut;
	private JLabel lblInactiveOut;
	private JLabel lblLevelOut;
	private JTextField textFieldName;
	private JButton btnSuchen;
	private JComboBox comboBox;
	private JLabel lblTip;
	private JLabel lblIron;
	private JLabel lblBronze;
	private JLabel lblSilver;
	private JLabel lblGold;
	private JLabel lblPlat;
	private JLabel lblEmerald;
	private JLabel lblDiamond;
	private JLabel lblMaster;
	private JLabel lblGrandmaster;
	private JLabel lblChallenger;
	private JLabel lblNewLabel_1;


	public RiotGui() {
		initialize();
	}
	private void initialize() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
				setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblName());
		contentPane.add(getLblRank());
		contentPane.add(getLblTier());
		contentPane.add(getLblWins());
		contentPane.add(getLblLosses());
		contentPane.add(getLblRatio());
		contentPane.add(getLblInactive());
		contentPane.add(getLblLevel());
		contentPane.add(getLblNameOut());
		contentPane.add(getLblRankOut());
		contentPane.add(getLblTierOut());
		contentPane.add(getLblWinsOut());
		contentPane.add(getLblLossesOut());
		contentPane.add(getLblRatioOut());
		contentPane.add(getLblInactiveOut());
		contentPane.add(getLblLevelOut());
		contentPane.add(getTextFieldName());
		contentPane.add(getBtnSuchen());
		
		contentPane.add(getComboBox());
		contentPane.add(getLblTip());
		contentPane.add(getLblIron());
		contentPane.add(getLblBronze());
		contentPane.add(getLblSilver());
		contentPane.add(getLblGold());
		contentPane.add(getLblPlat());
		contentPane.add(getLblEmerald());
		contentPane.add(getLblDiamond());
		contentPane.add(getLblMaster());
		contentPane.add(getLblGrandmaster());
		contentPane.add(getLblChallenger());
		
		contentPane.add(getLblNewLabel_1());
		this.setVisible(true);
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Name eingeben:");
			lblNewLabel.setBounds(10, 11, 98, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name:");
			lblName.setBounds(10, 36, 90, 14);
		}
		return lblName;
	}
	private JLabel getLblRank() {
		if (lblRank == null) {
			lblRank = new JLabel("Rank:");
			lblRank.setBounds(10, 61, 90, 14);
		}
		return lblRank;
	}
	private JLabel getLblTier() {
		if (lblTier == null) {
			lblTier = new JLabel("Tier:");
			lblTier.setBounds(10, 86, 90, 14);
		}
		return lblTier;
	}
	private JLabel getLblWins() {
		if (lblWins == null) {
			lblWins = new JLabel("Wins:");
			lblWins.setBounds(10, 111, 90, 14);
		}
		return lblWins;
	}
	private JLabel getLblLosses() {
		if (lblLosses == null) {
			lblLosses = new JLabel("Losses:");
			lblLosses.setBounds(10, 136, 90, 14);
		}
		return lblLosses;
	}
	private JLabel getLblRatio() {
		if (lblRatio == null) {
			lblRatio = new JLabel("W/R Ratio:");
			lblRatio.setBounds(10, 161, 90, 14);
		}
		return lblRatio;
	}
	private JLabel getLblInactive() {
		if (lblInactive == null) {
			lblInactive = new JLabel("Inactive:");
			lblInactive.setBounds(10, 186, 90, 14);
		}
		return lblInactive;
	}
	private JLabel getLblLevel() {
		if (lblLevel == null) {
			lblLevel = new JLabel("Level:");
			lblLevel.setBounds(10, 211, 90, 14);
		}
		return lblLevel;
	}
	public JLabel getLblNameOut() {
		if (lblNameOut == null) {
			lblNameOut = new JLabel("");
			lblNameOut.setBounds(110, 36, 90, 14);
		}
		return lblNameOut;
	}
	public JLabel getLblRankOut() {
		if (lblRankOut == null) {
			lblRankOut = new JLabel("");
			lblRankOut.setBounds(110, 61, 90, 14);
		}
		return lblRankOut;
	}
	public JLabel getLblTierOut() {
		if (lblTierOut == null) {
			lblTierOut = new JLabel("");
			lblTierOut.setBounds(110, 86, 90, 14);
		}
		return lblTierOut;
	}
	public JLabel getLblWinsOut() {
		if (lblWinsOut == null) {
			lblWinsOut = new JLabel("");
			lblWinsOut.setBounds(110, 111, 90, 14);
		}
		return lblWinsOut;
	}
	public JLabel getLblLossesOut() {
		if (lblLossesOut == null) {
			lblLossesOut = new JLabel("");
			lblLossesOut.setBounds(110, 136, 90, 14);
		}
		return lblLossesOut;
	}
	public JLabel getLblRatioOut() {
		if (lblRatioOut == null) {
			lblRatioOut = new JLabel("");
			lblRatioOut.setBounds(110, 161, 90, 14);
		}
		return lblRatioOut;
	}
	public JLabel getLblInactiveOut() {
		if (lblInactiveOut == null) {
			lblInactiveOut = new JLabel("");
			lblInactiveOut.setBounds(110, 186, 90, 14);
		}
		return lblInactiveOut;
	}
	public JLabel getLblLevelOut() {
		if (lblLevelOut == null) {
			lblLevelOut = new JLabel("");
			lblLevelOut.setBounds(110, 211, 90, 14);
		}
		return lblLevelOut;
	}
	public JTextField getTextFieldName() {
		if (textFieldName == null) {
			textFieldName = new JTextField();
			textFieldName.setBounds(110, 8, 134, 20);
			textFieldName.setColumns(10);
		}
		return textFieldName;
	}
	public JButton getBtnSuchen() {
		if (btnSuchen == null) {
			btnSuchen = new JButton("Suchen");
			btnSuchen.setBounds(254, 7, 89, 23);
		}
		return btnSuchen;
	}
	
	
	public JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(353, 7, 158, 22);
		}
		return comboBox;
	}
	
	public void setListener(Suchen Suchen)
	{
	
		getBtnSuchen().addActionListener(Suchen);
		
	}
	
	public void setListener(Select Select)
	{
	
		getComboBox().addActionListener(Select);
		
	}
	public JLabel getLblTip() {
		if (lblTip == null) {
			lblTip = new JLabel("Select queuetype");
			lblTip.setForeground(new Color(255, 0, 0));
			lblTip.setBounds(305, 36, 103, 14);
			lblTip.setVisible(false);
		}
		return lblTip;
	}
	public JLabel getLblIron() {
		if (lblIron == null) {
			lblIron = new JLabel("");
			lblIron.setIcon(new ImageIcon(RiotGui.class.getResource("/ApiPackage/Images/iron.png")));
			lblIron.setBounds(254, 61, 257, 189);
			lblIron.setVisible(false);
		}
		return lblIron;
	}
	
	
	public JLabel getLblBronze() {
		if (lblBronze == null) {
			lblBronze = new JLabel("");
			lblBronze.setIcon(new ImageIcon(RiotGui.class.getResource("/ApiPackage/Images/bronze.png")));
			lblBronze.setBounds(254, 61, 257, 189);
			lblBronze.setVisible(false);
		}
		return lblBronze;
	}
	public JLabel getLblSilver() {
		if (lblSilver == null) {
			lblSilver = new JLabel("");
			lblSilver.setIcon(new ImageIcon(RiotGui.class.getResource("/ApiPackage/Images/silver.png")));
			lblSilver.setBounds(254, 61, 257, 189);
			lblSilver.setVisible(false);
		}
		return lblSilver;
	}
	public JLabel getLblGold() {
		if (lblGold == null) {
			lblGold = new JLabel("");
			lblGold.setIcon(new ImageIcon(RiotGui.class.getResource("/ApiPackage/Images/gold.png")));
			lblGold.setBounds(254, 61, 257, 189);
			lblGold.setVisible(false);
		}
		return lblGold;
	}
	public JLabel getLblPlat() {
		if (lblPlat == null) {
			lblPlat = new JLabel("");
			lblPlat.setIcon(new ImageIcon(RiotGui.class.getResource("/ApiPackage/Images/plat.png")));
			lblPlat.setBounds(254, 61, 257, 189);
			lblPlat.setVisible(false);
		}
		return lblPlat;
	}
	public JLabel getLblEmerald() {
		if (lblEmerald == null) {
			lblEmerald = new JLabel("");
			lblEmerald.setIcon(new ImageIcon(RiotGui.class.getResource("/ApiPackage/Images/emerald.png")));
			lblEmerald.setBounds(254, 61, 257, 189);
			lblEmerald.setVisible(false);
		}
		return lblEmerald;
	}
	public JLabel getLblDiamond() {
		if (lblDiamond == null) {
			lblDiamond = new JLabel("");
			lblDiamond.setIcon(new ImageIcon(RiotGui.class.getResource("/ApiPackage/Images/diamond.png")));
			lblDiamond.setBounds(254, 61, 257, 189);
			lblDiamond.setVisible(false);
		}
		return lblDiamond;
	}
	public JLabel getLblMaster() {
		if (lblMaster == null) {
			lblMaster = new JLabel("");
			lblMaster.setIcon(new ImageIcon(RiotGui.class.getResource("/ApiPackage/Images/grandmaster.png")));
			lblMaster.setBounds(254, 61, 257, 189);
			lblMaster.setVisible(false);
		}
		return lblMaster;
	}
	public JLabel getLblGrandmaster() {
		if (lblGrandmaster == null) {
			lblGrandmaster = new JLabel("");
			lblGrandmaster.setIcon(new ImageIcon(RiotGui.class.getResource("/ApiPackage/Images/grandmaster.png")));
			lblGrandmaster.setBounds(254, 61, 257, 189);
			lblGrandmaster.setVisible(false);
		}
		return lblGrandmaster;
	}
	public JLabel getLblChallenger() {
		if (lblChallenger == null) {
			lblChallenger = new JLabel("");
			lblChallenger.setIcon(new ImageIcon(RiotGui.class.getResource("/ApiPackage/Images/challenger.png")));
			lblChallenger.setBounds(254, 61, 257, 189);
			lblChallenger.setVisible(false);
		}
		return lblChallenger;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setIcon(new ImageIcon(RiotGui.class.getResource("/ApiPackage/Images/background.png")));
			lblNewLabel_1.setBounds(0, 0, 521, 261);
		}
		return lblNewLabel_1;
	}
}

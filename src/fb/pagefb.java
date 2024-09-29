package fb;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import javax.swing.border.Border;


public class pagefb extends JFrame{

	final static int WIDTH = 800;
    final static int HEIGHT = 600;

    // Variables for components
    JFrame window;
    JPanel mainPanel;
    JLabel profilePic, userName, status;
    JButton searchButton;
    JTextField searchBar;
    JScrollPane newsFeedScrollPane;
    JTextArea newsFeed;
    // Variables for images
    Image header, profilePhoto, messengerLogo, watchLogo, photoVideoLogo,
            findFriendsLogo, moodActivityLogo, publishLogo;
    ImageIcon headerIcon, profileIcon, messengerIcon, watchIcon, photoVideoIcon,
            findFriendsIcon, moodActivityIcon, publishIcon;
	    public pagefb() {
	    	 window = new JFrame("My Facebook Page");
	         window.setSize(WIDTH, HEIGHT);
	         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	         mainPanel = new JPanel();
	         mainPanel.setLayout(null); // Absolute layout for component placement

	         window.add(mainPanel);

	         // Load and display images (assuming images are in a "images" folder)
	         try {
	             header = ImageIO.read(getClass().getResource("/images/entete.png"));
	             profilePhoto = ImageIO.read(getClass().getResource("/images/photo_profil.png"));
	             messengerLogo = ImageIO.read(getClass().getResource("/images/logo_messenger.png"));
	             watchLogo = ImageIO.read(getClass().getResource("/images/logo_watch.png"));
	             photoVideoLogo = ImageIO.read(getClass().getResource("/images/logo_photo_video.png"));
	             findFriendsLogo = ImageIO.read(getClass().getResource("/images/logo_identifier_amis.png"));
	             moodActivityLogo = ImageIO.read(getClass().getResource("/images/logo_humeur_activite.png"));
	             publishLogo = ImageIO.read(getClass().getResource("/images/logo_publier.png"));
	         } catch (IOException e) {
	             e.printStackTrace();
	             System.out.println("Error loading images. Please check image paths.");
	         }

	         // Create icons from images
	         headerIcon = new ImageIcon(header);
	         profileIcon = new ImageIcon(profilePhoto);
	         messengerIcon = new ImageIcon(messengerLogo);
	         watchIcon = new ImageIcon(watchLogo);
	         photoVideoIcon = new ImageIcon(photoVideoLogo);
	         findFriendsIcon = new ImageIcon(findFriendsLogo);
	         moodActivityIcon = new ImageIcon(moodActivityLogo);
	         publishIcon = new ImageIcon(publishLogo);

	         // Create and position components

	         // Header
	         JLabel headerLabel = new JLabel(headerIcon);
	         headerLabel.setBounds(0, 0, WIDTH, 80);
	         mainPanel.add(headerLabel);

	         // Profile picture
	         profilePic = new JLabel(profileIcon);
	         profilePic.setBounds(10, 10, 100, 100);
	         mainPanel.add(profilePic);

	         // User name
	         userName = new JLabel("Fatma");
	         userName.setFont(new Font("Arial", Font.BOLD, 16));
	         userName.setBounds(120, 20, 200, 20);
	         mainPanel.add(userName);

	         // Status
	         status = new JLabel("Exprimez-vous, Fatma");
	         status.setFont(new Font("Arial", Font.ITALIC, 14));
	         status.setBounds(120, 40, 200, 20);
	         mainPanel.add(status);

	         // Search bar and button
	         searchButton = new JButton("Rechercher");
	         searchButton.setBounds(WIDTH - 150, 10, 100, 25);

	         searchBar = new JTextField();
	         searchBar.setBounds(WIDTH - 250, 10, 100, 25);

	         mainPanel.add(searchButton);
	         mainPanel.add(searchBar);

	         newsFeed = new JTextArea();
	         newsFeed.setEditable(false);
	         newsFeed.setLineWrap(true);

	         newsFeedScrollPane = new JScrollPane(newsFeed);
	         newsFeedScrollPane.setBounds(10, 80, WIDTH - 20, HEIGHT - 100);

	         mainPanel.add(newsFeedScrollPane);

	         // Sample news feed content
	         String post1 = "**L'ISET de Mahdia organise une session de certification en Java Z01-808 pour les étudiants de DS14**";
	         String post2 = "**Collecte de fonds pour aider les familles dans le besoin**";

	         newsFeed.append(post1 + "\n\n");
	         newsFeed.append(post2 + "\n\n");

	         // Make the window visible
	         window.setVisible(true);
	    }

	


public static void main(String[] args) {
	 new pagefb();
   
}
}
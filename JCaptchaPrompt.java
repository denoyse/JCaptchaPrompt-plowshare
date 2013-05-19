import javax.swing.*;

public class JCaptchaPrompt {
  public static void main(String[] args) {
    System.err.println(
      "Module: " + args[0] +
      "; Image: " + args[1] +
      "; Type: " + args[2]
    );
    JLabel image = new JLabel(new ImageIcon(args[1]));
    JTextField input = new JTextField();
    Object[] message = {"Please solve this captcha.", image, input};
    JOptionPane pane = new JOptionPane(
      message,
      JOptionPane.PLAIN_MESSAGE,
      JOptionPane.OK_CANCEL_OPTION
    );
    pane.createDialog(null, "JCaptchaPrompt").setVisible(true);
    System.out.println(input.getText());
    System.exit(0);
  }
}

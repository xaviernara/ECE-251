import java.awt.*;
import javax.swing.*;
public class GridBagLayoutManagerExample extends JFrame {

     public GridBagLayoutManagerExample(String name) {
          super(name);

          GridBagLayout layout = new GridBagLayout();
          GridBagConstraints constraints = new GridBagConstraints();
          setLayout(layout);

          JTextField newItemField = new JTextField();
          constraints.gridx = 0;
          constraints.gridy = 0;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          constraints.insets = new Insets(12, 12, 3, 3);
          constraints.weightx = 10;
          constraints.weighty = 0;
          layout.setConstraints(newItemField, constraints);
          add(newItemField);

          JButton addButton = new JButton("Add");
          addButton.setMnemonic('A');
          constraints.gridx = 1;
          constraints.gridy = 0;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(12, 3, 3, 12);
          constraints.anchor = GridBagConstraints.NORTHWEST;
          constraints.weightx = 0;
          constraints.weighty = 0;
          layout.setConstraints(addButton, constraints);
          add(addButton);

         // String[] stuff = {"Apples", "Oranges", "Grapes", "Pineapples", "Cherries"};
          String[] stuff = {};
          JList itemsList = new JList(stuff);
          JScrollPane scrollPane = new JScrollPane(itemsList,
              ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
              ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
          constraints.gridx = 0;
          constraints.gridy = 1;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.BOTH;
          constraints.insets = new Insets(3, 12, 12, 3);
          constraints.anchor = GridBagConstraints.CENTER;
          constraints.weightx = 10;
          constraints.weighty = 1;
          layout.setConstraints(scrollPane, constraints);
          add(scrollPane);

          JButton removeButton = new JButton("Remove");
          removeButton.setMnemonic('R');
          constraints.gridx = 1;
          constraints.gridy = 1;
          constraints.gridwidth = 1;
          constraints.gridheight = 1;
          constraints.fill = GridBagConstraints.HORIZONTAL;
          constraints.insets = new Insets(3, 3, 0, 12);
          constraints.anchor = GridBagConstraints.NORTH;
          constraints.weightx = 0;
          constraints.weighty = 0;

          layout.setConstraints(removeButton, constraints);
          add(removeButton);

          setDefaultCloseOperation(EXIT_ON_CLOSE);
          setSize(400,300);
     }

     public static void main(String[] args) {
          JFrame frame = new GridBagLayoutManagerExample("Example");
          frame.setVisible(true);
     }
}




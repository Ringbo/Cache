diff --git a/src/net/java/sip/communicator/impl/gui/main/chat/conference/ChatContactCellRenderer.java b/src/net/java/sip/communicator/impl/gui/main/chat/conference/ChatContactCellRenderer.java
index f5ba8ca..5815a6b 100644
--- a/src/net/java/sip/communicator/impl/gui/main/chat/conference/ChatContactCellRenderer.java
+++ b/src/net/java/sip/communicator/impl/gui/main/chat/conference/ChatContactCellRenderer.java
@@ -24,6 +24,18 @@
 public class ChatContactCellRenderer
     extends ContactListCellRenderer
 {
+    /**
+     * Implements the <tt>ListCellRenderer</tt> method. Returns this panel that
+     * has been configured to display a chat contact.
+     *
+     * @param list the source list
+     * @param value the value of the current cell
+     * @param index the index of the current cell in the source list
+     * @param isSelected indicates if this cell is selected
+     * @param cellHasFocus indicates if this cell is focused
+     * 
+     * @return this panel
+     */
     public Component getListCellRendererComponent(  JList list,
                                                     Object value,
                                                     int index,
@@ -32,7 +44,7 @@
     {
         this.index = index;
 
-        this.photoLabel.setIcon(null);
+        this.rightLabel.setIcon(null);
 
         ChatContact chatContact = (ChatContact) value;
 
@@ -60,7 +72,7 @@
         ImageIcon avatar = chatContact.getAvatar();
 
         if (avatar != null)
-            this.photoLabel.setIcon(avatar);
+            this.rightLabel.setIcon(avatar);
 
         // We should set the bounds of the cell explicitly in order to
         // make getComponentAt work properly.
@@ -69,7 +81,7 @@
         this.nameLabel.setBounds(
                     0, 0, list.getWidth() - 28, 17);
 
-        this.photoLabel.setBounds(
+        this.rightLabel.setBounds(
             list.getWidth() - 28, 0, 25, 30);
 
         this.isLeaf = true;

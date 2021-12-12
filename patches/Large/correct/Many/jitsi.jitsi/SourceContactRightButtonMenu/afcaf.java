diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/SourceContactRightButtonMenu.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/SourceContactRightButtonMenu.java
index 59bac1b..0401efe 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/SourceContactRightButtonMenu.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/SourceContactRightButtonMenu.java
@@ -74,7 +74,7 @@
             final ContactDetail detail = details.next();
             // add all the contacts that support telephony to the call menu
             JMenuItem callContactItem = new JMenuItem();
-            callContactItem.setName(detail.getContactAddress());
+            callContactItem.setText(detail.getContactAddress());
             callContactItem.addActionListener(new ActionListener()
             {
                 public void actionPerformed(ActionEvent e)

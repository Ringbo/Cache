diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java
index 5af7bec..c6b6fe2 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java
@@ -635,7 +635,7 @@
         constraints.fill = GridBagConstraints.NONE;
         constraints.gridx = 1;
         constraints.gridy = 1;
-        constraints.weightx = 0f;
+        constraints.weightx = 1f;
         constraints.weighty = 0f;
         constraints.gridwidth = nameLabelGridWidth;
         constraints.gridheight = 1;
@@ -669,7 +669,7 @@
         constraints.fill = GridBagConstraints.NONE;
         constraints.gridx = 1;
         constraints.gridy = 1;
-        constraints.weightx = 0f;
+        constraints.weightx = 1f;
         constraints.weighty = 0f;
         constraints.gridwidth = 1;
         constraints.gridheight = 1;

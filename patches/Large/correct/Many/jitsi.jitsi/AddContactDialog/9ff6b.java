diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/AddContactDialog.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/AddContactDialog.java
index c2e9c2d..773b428 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/AddContactDialog.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/AddContactDialog.java
@@ -192,7 +192,7 @@
         {
             groupCombo.setEnabled(false);
 
-            this.setSelectedGroup(metaContact.getParentMetaContactGroup());
+            groupCombo.setSelectedItem(metaContact.getParentMetaContactGroup());
         }
 
         TransparentPanel labelsPanel

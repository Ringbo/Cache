diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/RenameContactDialog.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/RenameContactDialog.java
index beffa8a..f48d14d 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/RenameContactDialog.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/RenameContactDialog.java
@@ -88,7 +88,7 @@
         if (name.equals("rename")) {
             if (metaContact != null) {
                 this.clist.renameMetaContact(
-                    metaContact, renameContactPanel.getName());
+                    metaContact, renameContactPanel.getNewName());
             }
             this.dispose();
         }

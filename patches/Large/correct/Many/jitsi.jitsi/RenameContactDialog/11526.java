diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/RenameContactDialog.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/RenameContactDialog.java
index bea37ea..b711498 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/RenameContactDialog.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/RenameContactDialog.java
@@ -143,7 +143,7 @@
         }
         else if (name.equals("clear"))
         {
-            clist.clearDisplayNameUserDefined(metaContact);
+            clist.clearUserDefinedDisplayName(metaContact);
         }
         this.dispose();
     }

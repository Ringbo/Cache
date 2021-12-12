diff --git a/src/net/java/sip/communicator/impl/gui/main/call/PreCallDialog.java b/src/net/java/sip/communicator/impl/gui/main/call/PreCallDialog.java
index da30a29..384996e 100644
--- a/src/net/java/sip/communicator/impl/gui/main/call/PreCallDialog.java
+++ b/src/net/java/sip/communicator/impl/gui/main/call/PreCallDialog.java
@@ -136,7 +136,7 @@
 
             if (accounts != null)
             {
-                accountsCombo = new JComboBox();
+                accountsCombo = new JComboBox(accounts);
             }
         }
 

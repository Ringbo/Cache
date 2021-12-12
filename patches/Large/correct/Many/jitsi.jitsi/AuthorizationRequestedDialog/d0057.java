diff --git a/src/net/java/sip/communicator/impl/gui/main/authorization/AuthorizationRequestedDialog.java b/src/net/java/sip/communicator/impl/gui/main/authorization/AuthorizationRequestedDialog.java
index 7020a5d..5b8146d 100644
--- a/src/net/java/sip/communicator/impl/gui/main/authorization/AuthorizationRequestedDialog.java
+++ b/src/net/java/sip/communicator/impl/gui/main/authorization/AuthorizationRequestedDialog.java
@@ -122,7 +122,7 @@
             this.mainPanel.setPreferredSize(new Dimension(550, 400));            
         }
         else {
-            this.mainPanel.setPreferredSize(new Dimension(550, 300));
+            this.mainPanel.setPreferredSize(new Dimension(550, 350));
         }
         
         this.responseScrollPane.setBorder(BorderFactory.createCompoundBorder(

diff --git a/src/net/java/sip/communicator/impl/gui/main/chat/ChatPanel.java b/src/net/java/sip/communicator/impl/gui/main/chat/ChatPanel.java
index 78c5981..9528f5f 100644
--- a/src/net/java/sip/communicator/impl/gui/main/chat/ChatPanel.java
+++ b/src/net/java/sip/communicator/impl/gui/main/chat/ChatPanel.java
@@ -427,7 +427,7 @@
      */
     public void requestFocusInWriteArea()
     {
-        getChatWritePanel().getEditorPane().requestFocus();
+        getChatWritePanel().getEditorPane().requestFocusInWindow();
     }
 
     /**

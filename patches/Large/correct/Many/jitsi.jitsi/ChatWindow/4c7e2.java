diff --git a/src/net/java/sip/communicator/impl/gui/main/chat/ChatWindow.java b/src/net/java/sip/communicator/impl/gui/main/chat/ChatWindow.java
index c3f3ee9..877d764 100755
--- a/src/net/java/sip/communicator/impl/gui/main/chat/ChatWindow.java
+++ b/src/net/java/sip/communicator/impl/gui/main/chat/ChatWindow.java
@@ -193,7 +193,7 @@
 
                 // Add first two tabs to the tabbed pane.
                 chatTabbedPane.addTab(  firstChatPanel.getChatName(),
-                                        chatPanel.getChatStatusIcon(),
+                                        firstChatPanel.getChatStatusIcon(),
                                         firstChatPanel);
 
                 chatTabbedPane.addTab(  chatName,

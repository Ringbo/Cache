diff --git a/src/net/java/sip/communicator/impl/gui/main/message/ChatWindow.java b/src/net/java/sip/communicator/impl/gui/main/message/ChatWindow.java
index 56ed37b..147e033 100755
--- a/src/net/java/sip/communicator/impl/gui/main/message/ChatWindow.java
+++ b/src/net/java/sip/communicator/impl/gui/main/message/ChatWindow.java
@@ -291,10 +291,10 @@
         				.getDefaultContact().getPresenceStatus();
                 //Add the first two tabs to the tabbed pane.                
                 chatTabbedPane.addTab
-                		(currentChatPanel.getDefaultContact().getDisplayName(),
+                		(firstChatPanel.getDefaultContact().getDisplayName(),
                     new ImageIcon(Constants.getStatusIcon
                     			(currentContactStatus)),
-                    currentChatPanel);
+                    firstChatPanel);
                                
                 chatPanel = new ChatPanel(this, contactIMOperationSet);
                 
@@ -308,7 +308,7 @@
                     .setTabIndex(chatTabbedPane.getTabCount() - 1);
                 
                 this.contactTabsTable.put(contact.getMetaUID(),
-                                currentChatPanel);
+                                chatPanel);
             }
             
             this.getContentPane().add(chatTabbedPane, BorderLayout.CENTER);

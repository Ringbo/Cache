diff --git a/src/net/java/sip/communicator/impl/gui/main/presence/StatusPanel.java b/src/net/java/sip/communicator/impl/gui/main/presence/StatusPanel.java
index aa8d457..ab08ce6 100644
--- a/src/net/java/sip/communicator/impl/gui/main/presence/StatusPanel.java
+++ b/src/net/java/sip/communicator/impl/gui/main/presence/StatusPanel.java
@@ -84,7 +84,7 @@
         if(isHidden)
             hiddenProviders++;
 
-        if (protocolStatusCombos.size() - hiddenProviders == 1)
+        if (protocolStatusCombos.size() - hiddenProviders == 1 && !isHidden)
         {
             this.globalStatusBox = new GlobalStatusSelectorBox(mainFrame);
 

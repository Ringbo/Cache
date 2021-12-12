diff --git a/src/net/java/sip/communicator/impl/gui/main/call/CallPanel.java b/src/net/java/sip/communicator/impl/gui/main/call/CallPanel.java
index 0b84eee..51fc669 100644
--- a/src/net/java/sip/communicator/impl/gui/main/call/CallPanel.java
+++ b/src/net/java/sip/communicator/impl/gui/main/call/CallPanel.java
@@ -1674,7 +1674,7 @@
             settingsPanel.add(recordButton);
         if (showHideVideoButton != null)
             settingsPanel.add(showHideVideoButton);
-        if (mergeButton != null)
+        if (transferCallButton != null)
             settingsPanel.add(transferCallButton);
         if (videoButton != null)
             settingsPanel.add(videoButton);

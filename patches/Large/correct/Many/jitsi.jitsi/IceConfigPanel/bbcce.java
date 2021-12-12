diff --git a/src/net/java/sip/communicator/plugin/jabberaccregwizz/IceConfigPanel.java b/src/net/java/sip/communicator/plugin/jabberaccregwizz/IceConfigPanel.java
index 93b7baa..503dcc0 100644
--- a/src/net/java/sip/communicator/plugin/jabberaccregwizz/IceConfigPanel.java
+++ b/src/net/java/sip/communicator/plugin/jabberaccregwizz/IceConfigPanel.java
@@ -1268,7 +1268,7 @@
      */
     protected boolean isUseUPNP()
     {
-        return iceBox.isSelected();
+        return upnpBox.isSelected();
     }
 
     /**

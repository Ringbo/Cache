diff --git a/src/java/org/jivesoftware/wildfire/mediaproxy/MediaProxyService.java b/src/java/org/jivesoftware/wildfire/mediaproxy/MediaProxyService.java
index ee64f1e..b9ed041 100644
--- a/src/java/org/jivesoftware/wildfire/mediaproxy/MediaProxyService.java
+++ b/src/java/org/jivesoftware/wildfire/mediaproxy/MediaProxyService.java
@@ -45,7 +45,7 @@
     private PacketRouter router;
 
     private MediaProxy mediaProxy = null;
-    private boolean enabled = false;
+    private boolean enabled = true;
 
     public static final String NAMESPACE = "http://www.jivesoftware.com/protocol/rtpbridge";
 
@@ -232,7 +232,7 @@
         catch (NumberFormatException e) {
             // Do nothing let the default values to be used.
         }
-        this.enabled = JiveGlobals.getBooleanProperty("mediaproxy.enabled");
+        setEnabled(JiveGlobals.getBooleanProperty("mediaproxy.enabled"));
     }
 
     /**

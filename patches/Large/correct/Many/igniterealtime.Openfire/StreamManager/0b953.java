diff --git a/src/java/org/jivesoftware/openfire/streammanagement/StreamManager.java b/src/java/org/jivesoftware/openfire/streammanagement/StreamManager.java
index d41b2a1..a0d0d21 100644
--- a/src/java/org/jivesoftware/openfire/streammanagement/StreamManager.java
+++ b/src/java/org/jivesoftware/openfire/streammanagement/StreamManager.java
@@ -47,7 +47,7 @@
     }
     
     public static boolean isStreamManagementActive() {
-        return JiveGlobals.getBooleanProperty("stream.management.active", false);
+        return JiveGlobals.getBooleanProperty("stream.management.active", true);
     }
 
     /**

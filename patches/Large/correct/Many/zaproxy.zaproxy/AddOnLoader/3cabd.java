diff --git a/src/org/zaproxy/zap/control/AddOnLoader.java b/src/org/zaproxy/zap/control/AddOnLoader.java
index cbb6be4..61a4f42 100644
--- a/src/org/zaproxy/zap/control/AddOnLoader.java
+++ b/src/org/zaproxy/zap/control/AddOnLoader.java
@@ -375,11 +375,11 @@
     		return;
     	}
     	if (! dir.exists()) {
-    		logger.error("No such directory: " + dir.getAbsolutePath());
+    		logger.debug("No such directory: " + dir.getAbsolutePath());
     		return;
     	}
     	if (! dir.isDirectory()) {
-    		logger.error("Not a directory: " + dir.getAbsolutePath());
+    		logger.warn("Not a directory: " + dir.getAbsolutePath());
     		return;
     	}
 

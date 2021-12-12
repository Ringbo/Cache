diff --git a/src/main/java/org/reflections/Reflections.java b/src/main/java/org/reflections/Reflections.java
index 31583b3..e22cad7 100644
--- a/src/main/java/org/reflections/Reflections.java
+++ b/src/main/java/org/reflections/Reflections.java
@@ -180,7 +180,7 @@
             return;
         }
 
-        if (log != null) {
+        if (log != null && log.isDebugEnabled()) {
             log.debug("going to scan these urls:\n{}", Joiner.on("\n").join(configuration.getUrls()));
         }
 

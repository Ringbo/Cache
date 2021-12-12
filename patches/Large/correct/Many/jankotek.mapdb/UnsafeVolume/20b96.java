diff --git a/src/main/java/org/mapdb/volume/UnsafeVolume.java b/src/main/java/org/mapdb/volume/UnsafeVolume.java
index 3c6946a..0553cbd 100644
--- a/src/main/java/org/mapdb/volume/UnsafeVolume.java
+++ b/src/main/java/org/mapdb/volume/UnsafeVolume.java
@@ -160,7 +160,7 @@
         //*LOG*/ System.err.flush();
         if(hasLimit && offset>sizeLimit) {
             //return false;
-            throw new IllegalAccessError("too big"); //TODO size limit here
+            throw new IllegalStateException("too big"); //TODO size limit here
         }
 
 

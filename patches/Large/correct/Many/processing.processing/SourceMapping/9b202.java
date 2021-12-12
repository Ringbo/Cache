diff --git a/java/src/processing/mode/java/pdex/SourceMapping.java b/java/src/processing/mode/java/pdex/SourceMapping.java
index 802b008..82443e4 100644
--- a/java/src/processing/mode/java/pdex/SourceMapping.java
+++ b/java/src/processing/mode/java/pdex/SourceMapping.java
@@ -225,7 +225,7 @@
 
 
   private void checkApplied() {
-    if (applied) throw new RuntimeException("this mapping was not applied yet");
+    if (!applied) throw new RuntimeException("this mapping was not applied yet");
   }
 
 

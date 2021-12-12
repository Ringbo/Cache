diff --git a/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java b/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java
index fb64cf0..fed1971 100644
--- a/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java
+++ b/platform/platform-api/src/com/intellij/openapi/ui/DialogWrapper.java
@@ -1755,7 +1755,7 @@
   }
 
   public long getTypeAheadTimeoutMs() {
-    return 0l;
+    return 0L;
   }
 
   public boolean isToDispatchTypeAhead() {

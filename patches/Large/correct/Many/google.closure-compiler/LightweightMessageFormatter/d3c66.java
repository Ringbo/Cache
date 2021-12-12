diff --git a/src/com/google/javascript/jscomp/LightweightMessageFormatter.java b/src/com/google/javascript/jscomp/LightweightMessageFormatter.java
index cf44343..1f6315b 100644
--- a/src/com/google/javascript/jscomp/LightweightMessageFormatter.java
+++ b/src/com/google/javascript/jscomp/LightweightMessageFormatter.java
@@ -128,7 +128,7 @@
     return b.toString();
   }
 
-  private String formatPosition(String sourceName, int lineNumber) {
+  private static String formatPosition(String sourceName, int lineNumber) {
     StringBuilder b = new StringBuilder();
     if (sourceName != null) {
       b.append(sourceName);

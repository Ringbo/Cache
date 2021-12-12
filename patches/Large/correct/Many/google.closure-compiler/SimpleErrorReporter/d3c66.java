diff --git a/src/com/google/javascript/rhino/SimpleErrorReporter.java b/src/com/google/javascript/rhino/SimpleErrorReporter.java
index a0767b9..d0a9c37 100644
--- a/src/com/google/javascript/rhino/SimpleErrorReporter.java
+++ b/src/com/google/javascript/rhino/SimpleErrorReporter.java
@@ -72,7 +72,7 @@
         errors.add(formatDetailedMessage(message, sourceName, line));
     }
 
-    private String formatDetailedMessage(
+    private static String formatDetailedMessage(
         String message, String sourceName, int lineNumber) {
       String details = message;
       if (sourceName == null || lineNumber <= 0) {

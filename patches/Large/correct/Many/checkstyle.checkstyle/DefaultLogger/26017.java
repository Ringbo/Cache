diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/DefaultLogger.java b/src/main/java/com/puppycrawl/tools/checkstyle/DefaultLogger.java
index 8c3fbc4..70b5065 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/DefaultLogger.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/DefaultLogger.java
@@ -53,7 +53,7 @@
     private final boolean closeError;
 
     /** Formatter for the log message. */
-    private final AuditEvemtFormatter formatter;
+    private final AuditEventFormatter formatter;
 
     /**
      * Creates a new {@code DefaultLogger} instance.
@@ -93,7 +93,7 @@
                          boolean closeInfoAfterUse,
                          OutputStream errorStream,
                          boolean closeErrorAfterUse,
-                         AuditEvemtFormatter messageFormatter) {
+                         AuditEventFormatter messageFormatter) {
         closeInfo = closeInfoAfterUse;
         closeError = closeErrorAfterUse;
         final Writer infoStreamWriter = new OutputStreamWriter(infoStream, StandardCharsets.UTF_8);

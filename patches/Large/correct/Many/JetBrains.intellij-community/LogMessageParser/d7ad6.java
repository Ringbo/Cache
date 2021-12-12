diff --git a/plugins/cvs/javacvs-src/org/netbeans/lib/cvsclient/command/log/LogMessageParser.java b/plugins/cvs/javacvs-src/org/netbeans/lib/cvsclient/command/log/LogMessageParser.java
index f1eeea2..9d30fe7 100644
--- a/plugins/cvs/javacvs-src/org/netbeans/lib/cvsclient/command/log/LogMessageParser.java
+++ b/plugins/cvs/javacvs-src/org/netbeans/lib/cvsclient/command/log/LogMessageParser.java
@@ -57,7 +57,7 @@
   @NonNls private static final String FINAL_SPLIT = "=============";
   @NonNls private static final String FINAL_SPLIT_WITH_TAB = "\t=============";
 
-  private static final SyncDateFormat[] EXPECTED_DATE_FORMATS = new SyncDateFormat[3];
+  private static final SyncDateFormat[] EXPECTED_DATE_FORMATS = new SyncDateFormat[2];
   @NonNls private static final String NO_FILE_MESSAGE = "no file";
 
   static {
@@ -335,7 +335,7 @@
         revision.setDate(parsedDate);
       }
       else {
-        BugLog.getInstance().showException(new Exception(JavaCvsSrcBundle.message("line.could.be.be.parsed.error.message", line)));
+        BugLog.getInstance().showException(new Exception(JavaCvsSrcBundle.message("line.could.not.be.parsed.error.message", line)));
       }
     }
     if (token.hasMoreTokens()) {

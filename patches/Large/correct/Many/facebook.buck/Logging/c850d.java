diff --git a/src/com/facebook/buck/cli/Logging.java b/src/com/facebook/buck/cli/Logging.java
index bb8681b..2d10fa4 100644
--- a/src/com/facebook/buck/cli/Logging.java
+++ b/src/com/facebook/buck/cli/Logging.java
@@ -28,7 +28,7 @@
   public static void setLoggingLevelForVerbosity(Verbosity verbosity) {
     Level loggerLevel = verbosity == Verbosity.ALL
         ? Level.ALL
-        : (verbosity.shouldPrintCommand()) ? Level.INFO : Level.OFF;
+        : (verbosity.shouldPrintOutput()) ? Level.INFO : Level.OFF;
     // TODO(mbolin): Figure out why "com.facebook.buck" cannot be used instead of "".
     Logger.getLogger("").setLevel(loggerLevel);
   }

diff --git a/logback-classic/src/main/java/ch/qos/logback/classic/Logger.java b/logback-classic/src/main/java/ch/qos/logback/classic/Logger.java
index 1696123..7acb1aa 100644
--- a/logback-classic/src/main/java/ch/qos/logback/classic/Logger.java
+++ b/logback-classic/src/main/java/ch/qos/logback/classic/Logger.java
@@ -130,7 +130,7 @@
     return name;
   }
 
-  private final boolean isRootLogger() {
+  private boolean isRootLogger() {
     // only the root logger has a null parent
     return parent == null;
   }
@@ -405,7 +405,7 @@
    * logging by about 20 nanoseconds.
    */
 
-  private final void filterAndLog_0_Or3Plus(final String localFQCN,
+  private void filterAndLog_0_Or3Plus(final String localFQCN,
       final Marker marker, final Level level, final String msg,
       final Object[] params, final Throwable t) {
 
@@ -424,7 +424,7 @@
     buildLoggingEventAndAppend(localFQCN, marker, level, msg, params, t);
   }
 
-  private final void filterAndLog_1(final String localFQCN,
+  private void filterAndLog_1(final String localFQCN,
       final Marker marker, final Level level, final String msg,
       final Object param, final Throwable t) {
 
@@ -443,7 +443,7 @@
         new Object[] { param }, t);
   }
 
-  private final void filterAndLog_2(final String localFQCN,
+  private void filterAndLog_2(final String localFQCN,
       final Marker marker, final Level level, final String msg,
       final Object param1, final Object param2, final Throwable t) {
 

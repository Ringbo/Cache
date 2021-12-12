diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/ant/CheckstyleAntTask.java b/src/main/java/com/puppycrawl/tools/checkstyle/ant/CheckstyleAntTask.java
index 08ef8b9..fb5ee5e 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/ant/CheckstyleAntTask.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/ant/CheckstyleAntTask.java
@@ -345,7 +345,7 @@
                 + " files", Project.MSG_INFO);
         log("Using configuration " + configLocation, Project.MSG_VERBOSE);
 
-        int numErrs;
+        final int numErrs;
 
         try {
             final long processingStartTime = System.currentTimeMillis();
@@ -380,7 +380,7 @@
      * @return new instance of {@code Checker}
      */
     private Checker createChecker() {
-        Checker checker;
+        final Checker checker;
         try {
             final Properties props = createOverridingProperties();
             final Configuration config =

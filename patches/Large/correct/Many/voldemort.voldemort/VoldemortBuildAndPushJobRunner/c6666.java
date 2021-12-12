diff --git a/contrib/hadoop-store-builder/src/java/voldemort/store/readonly/mr/azkaban/VoldemortBuildAndPushJobRunner.java b/contrib/hadoop-store-builder/src/java/voldemort/store/readonly/mr/azkaban/VoldemortBuildAndPushJobRunner.java
index 088ce75..743573d 100644
--- a/contrib/hadoop-store-builder/src/java/voldemort/store/readonly/mr/azkaban/VoldemortBuildAndPushJobRunner.java
+++ b/contrib/hadoop-store-builder/src/java/voldemort/store/readonly/mr/azkaban/VoldemortBuildAndPushJobRunner.java
@@ -10,7 +10,7 @@
  */
 public class VoldemortBuildAndPushJobRunner {
     private static final Logger logger = Logger.getLogger(VoldemortBuildAndPushJobRunner.class);
-    public static void main(String[] args) {
+    public static void main(String[] args) throws Exception {
         // Validate arguments
         if (args.length < 1) {
             logger.error("Please provide a job config file name as the argument to this script.");

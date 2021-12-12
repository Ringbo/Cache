diff --git a/hcatalog/core/src/main/java/org/apache/hive/hcatalog/common/HCatUtil.java b/hcatalog/core/src/main/java/org/apache/hive/hcatalog/common/HCatUtil.java
index 2f624df..63909b8 100644
--- a/hcatalog/core/src/main/java/org/apache/hive/hcatalog/common/HCatUtil.java
+++ b/hcatalog/core/src/main/java/org/apache/hive/hcatalog/common/HCatUtil.java
@@ -84,7 +84,8 @@
   private static volatile HiveClientCache hiveClientCache;
 
   public static boolean checkJobContextIfRunningFromBackend(JobContext j) {
-    if (j.getConfiguration().get("mapred.task.id", "").equals("") &&
+    if (j.getConfiguration().get("pig.job.converted.fetch", "").equals("") &&
+          j.getConfiguration().get("mapred.task.id", "").equals("") &&
         !("true".equals(j.getConfiguration().get("pig.illustrating")))) {
       return false;
     }

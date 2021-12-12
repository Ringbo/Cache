diff --git a/assembly/src/test/java/org/apache/kylin/job/BuildIIWithStreamTest.java b/assembly/src/test/java/org/apache/kylin/job/BuildIIWithStreamTest.java
index b420463..2317e62 100644
--- a/assembly/src/test/java/org/apache/kylin/job/BuildIIWithStreamTest.java
+++ b/assembly/src/test/java/org/apache/kylin/job/BuildIIWithStreamTest.java
@@ -118,7 +118,7 @@
     }
     
     @AfterClass
-    public void cleanup() throws Exception {
+    public static void cleanup() throws Exception {
         cleanupOldStorage();
     }
 
@@ -280,7 +280,7 @@
         return unsorted;
     }
 
-    private int cleanupOldStorage() throws Exception {
+    private static int cleanupOldStorage() throws Exception {
         String[] args = { "--delete", "true" };
 
         int exitCode = ToolRunner.run(new StorageCleanupJob(), args);

diff --git a/h2o-persist-s3/src/test/java/water/persist/PersistS3Test.java b/h2o-persist-s3/src/test/java/water/persist/PersistS3Test.java
index 96385b8..e92747b 100644
--- a/h2o-persist-s3/src/test/java/water/persist/PersistS3Test.java
+++ b/h2o-persist-s3/src/test/java/water/persist/PersistS3Test.java
@@ -20,7 +20,7 @@
 
 
   @BeforeClass
-  public static void setup() { stall_till_cloudsize(1); }
+  public static void setup() { stall_till_cloudsize(5); }
 
   private static class XORTask extends MRTask<XORTask> {
     long _res = 0;

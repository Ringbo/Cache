diff --git a/core/common/src/test/java/alluxio/ConfigurationTest.java b/core/common/src/test/java/alluxio/ConfigurationTest.java
index b8af727..e4096cf 100644
--- a/core/common/src/test/java/alluxio/ConfigurationTest.java
+++ b/core/common/src/test/java/alluxio/ConfigurationTest.java
@@ -178,7 +178,7 @@
     Assert.assertEquals(Constants.SECOND_MS, intValue);
 
     intValue = sDefaultConfiguration.getInt(Constants.MASTER_WORKER_THREADS_MIN);
-    Assert.assertEquals(Runtime.getRuntime().availableProcessors(), intValue);
+    Assert.assertEquals(512, intValue);
 
     intValue = sDefaultConfiguration.getInt(Constants.MASTER_WORKER_TIMEOUT_MS);
     Assert.assertEquals(10 * Constants.SECOND_MS, intValue);
@@ -221,7 +221,7 @@
     Assert.assertEquals(Constants.SECOND_MS, intValue);
 
     intValue = sDefaultConfiguration.getInt(Constants.WORKER_WORKER_BLOCK_THREADS_MIN);
-    Assert.assertEquals(1, intValue);
+    Assert.assertEquals(256, intValue);
 
     intValue = sDefaultConfiguration.getInt(Constants.WORKER_SESSION_TIMEOUT_MS);
     Assert.assertEquals(10 * Constants.SECOND_MS, intValue);

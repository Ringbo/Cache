diff --git a/core/common/src/test/java/alluxio/ConfigurationTest.java b/core/common/src/test/java/alluxio/ConfigurationTest.java
index 464ea19..bb9e494 100644
--- a/core/common/src/test/java/alluxio/ConfigurationTest.java
+++ b/core/common/src/test/java/alluxio/ConfigurationTest.java
@@ -184,7 +184,7 @@
     Assert.assertEquals(512, intValue);
 
     intValue = sDefaultConfiguration.getInt(Constants.MASTER_WORKER_TIMEOUT_MS);
-    Assert.assertEquals(10 * Constants.SECOND_MS, intValue);
+    Assert.assertEquals(300 * Constants.SECOND_MS, intValue);
   }
 
   /**

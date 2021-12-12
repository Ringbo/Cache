diff --git a/core/common/src/test/java/alluxio/ConfigurationTest.java b/core/common/src/test/java/alluxio/ConfigurationTest.java
index 464ea19..3c91ac7 100644
--- a/core/common/src/test/java/alluxio/ConfigurationTest.java
+++ b/core/common/src/test/java/alluxio/ConfigurationTest.java
@@ -127,7 +127,7 @@
 
     long longBytesValue =
         sDefaultConfiguration.getBytes(Constants.USER_BLOCK_REMOTE_READ_BUFFER_SIZE_BYTES);
-    Assert.assertEquals(Constants.MB * 8, longBytesValue);
+    Assert.assertEquals(Constants.KB * 4, longBytesValue);
 
     longBytesValue = sDefaultConfiguration.getBytes(Constants.NETWORK_THRIFT_FRAME_SIZE_BYTES_MAX);
     Assert.assertEquals(Constants.MB * 16, longBytesValue);
@@ -254,7 +254,7 @@
     Assert.assertEquals(Constants.MB, longValue);
 
     longValue = sDefaultConfiguration.getBytes(Constants.USER_BLOCK_REMOTE_READ_BUFFER_SIZE_BYTES);
-    Assert.assertEquals(8 * Constants.MB, longValue);
+    Assert.assertEquals(4 * Constants.KB, longValue);
   }
 
   /**

diff --git a/servers/src/test/java/tachyon/worker/block/BlockWorkerUtilsTest.java b/servers/src/test/java/tachyon/worker/block/BlockWorkerUtilsTest.java
index 4a24ff9..8f92a4a 100644
--- a/servers/src/test/java/tachyon/worker/block/BlockWorkerUtilsTest.java
+++ b/servers/src/test/java/tachyon/worker/block/BlockWorkerUtilsTest.java
@@ -73,19 +73,19 @@
 
     InetSocketAddress masterAddress = BlockWorkerUtils.getMasterAddress(mCustomPropsTachyonConf);
     Assert.assertNotNull(masterAddress);
-    Assert.assertEquals(masterAddress, new InetSocketAddress("RemoteMaster1", 10000));
+    Assert.assertEquals(new InetSocketAddress("RemoteMaster1", 10000), masterAddress);
 
     masterAddress = BlockWorkerUtils.getMasterAddress(mNullMasterHostNameTachyonConf);
     Assert.assertNotNull(masterAddress);
-    Assert.assertEquals(masterAddress, new InetSocketAddress(defaultHostname, 20000));
+    Assert.assertEquals(new InetSocketAddress(defaultHostname, 20000), masterAddress);
 
     masterAddress = BlockWorkerUtils.getMasterAddress(mNullMasterPortTachyonConf);
     Assert.assertNotNull(masterAddress);
-    Assert.assertEquals(masterAddress, new InetSocketAddress("RemoteMaster3", defaultPort));
+    Assert.assertEquals(new InetSocketAddress("RemoteMaster3", defaultPort), masterAddress);
 
     masterAddress = BlockWorkerUtils.getMasterAddress(mNullTachyonConf);
     Assert.assertNotNull(masterAddress);
-    Assert.assertEquals(masterAddress, new InetSocketAddress(defaultHostname, defaultPort));
+    Assert.assertEquals(new InetSocketAddress(defaultHostname, defaultPort), masterAddress);
   }
 
   @Test
@@ -95,10 +95,10 @@
 
     InetSocketAddress workerAddress = BlockWorkerUtils.getWorkerAddress(mCustomPropsTachyonConf);
     Assert.assertNotNull(workerAddress);
-    Assert.assertEquals(workerAddress, new InetSocketAddress(defaultHostname, 10001));
+    Assert.assertEquals(new InetSocketAddress(defaultHostname, 10001), workerAddress);
 
     workerAddress = BlockWorkerUtils.getWorkerAddress(mNullTachyonConf);
     Assert.assertNotNull(workerAddress);
-    Assert.assertEquals(workerAddress, new InetSocketAddress(defaultHostname, defaultPort));
+    Assert.assertEquals(new InetSocketAddress(defaultHostname, defaultPort), workerAddress);
   }
 }

diff --git a/enterprise/ha/src/test/java/slavetest/SingleJvmWithNettyTest.java b/enterprise/ha/src/test/java/slavetest/SingleJvmWithNettyTest.java
index 95ffc50..1f0500b 100644
--- a/enterprise/ha/src/test/java/slavetest/SingleJvmWithNettyTest.java
+++ b/enterprise/ha/src/test/java/slavetest/SingleJvmWithNettyTest.java
@@ -569,7 +569,7 @@
         } );
         
         DoubleLatch latch = latchFetcher.fetch();
-        latch.countDownFirst();
+        latch.awaitFirst(); // Wait for lockHolder to grab the lock
         try
         {
             executeJob( new CommonJobs.SetNodePropertyWithThrowJob( otherNodeId.longValue(),

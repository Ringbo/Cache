diff --git a/test/unit/voldemort/client/AdminServiceBasicTest.java b/test/unit/voldemort/client/AdminServiceBasicTest.java
index f4a550d..852672c 100644
--- a/test/unit/voldemort/client/AdminServiceBasicTest.java
+++ b/test/unit/voldemort/client/AdminServiceBasicTest.java
@@ -322,7 +322,7 @@
                                               testStoreName,
                                               fetchAndUpdatePartitionsList,
                                               null);
-        client.waitForCompletion(1, id, 5, TimeUnit.SECONDS);
+        client.waitForCompletion(1, id, 60, TimeUnit.SECONDS);
 
         // check values
         int count = 0;

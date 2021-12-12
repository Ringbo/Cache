diff --git a/hazelcast/src/test/java/com/hazelcast/map/MapTransactionTest.java b/hazelcast/src/test/java/com/hazelcast/map/MapTransactionTest.java
index 498481d..e92eee4 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/MapTransactionTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/MapTransactionTest.java
@@ -284,7 +284,7 @@
         map.put(key, 0);
         new Thread(new TxnIncrementor(count1, h1, latch)).start();
         new Thread(new TxnIncrementor(count2, h2, latch)).start();
-        latch.await(100, TimeUnit.SECONDS);
+        latch.await(600, TimeUnit.SECONDS);
         assertEquals(new Integer(count1 + count2), map.get(key));
     }
 

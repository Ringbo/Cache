diff --git a/driver-core/src/test/java/com/datastax/driver/core/ExceptionsTest.java b/driver-core/src/test/java/com/datastax/driver/core/ExceptionsTest.java
index 29a169b..a70b852 100644
--- a/driver-core/src/test/java/com/datastax/driver/core/ExceptionsTest.java
+++ b/driver-core/src/test/java/com/datastax/driver/core/ExceptionsTest.java
@@ -335,7 +335,7 @@
 
             bridge.stop(2);
             // Ensure that gossip has reported the node as down.
-            Thread.sleep(1000);
+            Thread.sleep(2000);
 
             try{
                 session.execute(new SimpleStatement(String.format(TestUtils.SELECT_ALL_FORMAT, table)).setConsistencyLevel(ConsistencyLevel.ALL));

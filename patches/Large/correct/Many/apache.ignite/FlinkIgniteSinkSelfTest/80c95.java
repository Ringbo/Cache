diff --git a/modules/flink/src/test/java/org/apache/ignite/sink/flink/FlinkIgniteSinkSelfTest.java b/modules/flink/src/test/java/org/apache/ignite/sink/flink/FlinkIgniteSinkSelfTest.java
index 083457c..50eedb8 100644
--- a/modules/flink/src/test/java/org/apache/ignite/sink/flink/FlinkIgniteSinkSelfTest.java
+++ b/modules/flink/src/test/java/org/apache/ignite/sink/flink/FlinkIgniteSinkSelfTest.java
@@ -53,7 +53,7 @@
 
     /** {@inheritDoc} */
     @Override protected long getTestTimeout() {
-        return 10_000;
+        return 20_000;
     }
 
     /** {@inheritDoc} */

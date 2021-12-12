diff --git a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/MaxMinObject.java b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/MaxMinObject.java
index 4014c06..8602811 100644
--- a/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/MaxMinObject.java
+++ b/truffle/com.oracle.truffle.tck/src/com/oracle/truffle/tck/MaxMinObject.java
@@ -29,7 +29,7 @@
 final class MaxMinObject implements LongBinaryOperation {
     private final boolean max;
 
-    public MaxMinObject(boolean max) {
+    MaxMinObject(boolean max) {
         this.max = max;
     }
 

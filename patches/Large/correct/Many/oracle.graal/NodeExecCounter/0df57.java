diff --git a/truffle/com.oracle.truffle.tools/src/com/oracle/truffle/tools/NodeExecCounter.java b/truffle/com.oracle.truffle.tools/src/com/oracle/truffle/tools/NodeExecCounter.java
index 0b7ea2078..23bc30c 100644
--- a/truffle/com.oracle.truffle.tools/src/com/oracle/truffle/tools/NodeExecCounter.java
+++ b/truffle/com.oracle.truffle.tools/src/com/oracle/truffle/tools/NodeExecCounter.java
@@ -334,7 +334,7 @@
         private final Class<?> nodeClass;
         private final long count;
 
-        public NodeExecCountImpl(Class<?> nodeClass, long count) {
+        NodeExecCountImpl(Class<?> nodeClass, long count) {
             this.nodeClass = nodeClass;
             this.count = count;
         }

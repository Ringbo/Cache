diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/StructuredGraph.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/StructuredGraph.java
index 26aeafd..b98260d 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/StructuredGraph.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/StructuredGraph.java
@@ -591,7 +591,7 @@
      * Determines if {@link ProfilingInfo} is used during construction of this graph.
      */
     public boolean useProfilingInfo() {
-        return hasValueProxies;
+        return useProfilingInfo;
     }
 
     /**

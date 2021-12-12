diff --git a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/LoweringPhase.java b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/LoweringPhase.java
index 314e155..ebfeb24 100644
--- a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/LoweringPhase.java
+++ b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/LoweringPhase.java
@@ -178,7 +178,7 @@
         Mark expectedMark = graph.getMark();
         lower(graph, context, 1);
         Mark mark = graph.getMark();
-        assert mark.equals(expectedMark) : graph + ": a second round in the current lowering phase introduced these new nodes: " + graph.getNewNodes(mark).snapshot();
+        assert mark.equals(expectedMark) : graph + ": a second round in the current lowering phase introduced these new nodes: " + graph.getNewNodes(expectedMark).snapshot();
         return true;
     }
 

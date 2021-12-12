diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/phases/OnStackReplacementPhase.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/phases/OnStackReplacementPhase.java
index 6e6b504..b509f03 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/phases/OnStackReplacementPhase.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/phases/OnStackReplacementPhase.java
@@ -111,6 +111,6 @@
         GraphUtil.killCFG(start);
 
         Debug.dump(graph, "OnStackReplacement result");
-        new DeadCodeEliminationPhase(OPTIONAL).apply(graph);
+        new DeadCodeEliminationPhase(Optional).apply(graph);
     }
 }

diff --git a/graal/com.oracle.graal.virtual/src/com/oracle/graal/virtual/phases/ea/EffectsPhase.java b/graal/com.oracle.graal.virtual/src/com/oracle/graal/virtual/phases/ea/EffectsPhase.java
index d741dfa..be8c573 100644
--- a/graal/com.oracle.graal.virtual/src/com/oracle/graal/virtual/phases/ea/EffectsPhase.java
+++ b/graal/com.oracle.graal.virtual/src/com/oracle/graal/virtual/phases/ea/EffectsPhase.java
@@ -101,7 +101,7 @@
                     Debug.dump(graph, "after " + getName() + " iteration");
                 }
 
-                new DeadCodeEliminationPhase(REQUIRED).apply(graph);
+                new DeadCodeEliminationPhase(Required).apply(graph);
 
                 Set<Node> changedNodes = listener.getNodes();
                 for (Node node : graph.getNodes()) {

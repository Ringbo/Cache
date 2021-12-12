diff --git a/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/ReplacementsImpl.java b/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/ReplacementsImpl.java
index d3b1c8c..90aaa63 100644
--- a/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/ReplacementsImpl.java
+++ b/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/ReplacementsImpl.java
@@ -512,7 +512,7 @@
                     new CollapseFrameForSingleSideEffectPhase().apply(graph);
                     break;
             }
-            new DeadCodeEliminationPhase(REQUIRED).apply(graph);
+            new DeadCodeEliminationPhase(Required).apply(graph);
         }
 
         /**
@@ -614,7 +614,7 @@
          */
         protected void afterInlining(StructuredGraph graph) {
             new NodeIntrinsificationPhase(providers, snippetReflection).apply(graph);
-            new DeadCodeEliminationPhase(OPTIONAL).apply(graph);
+            new DeadCodeEliminationPhase(Optional).apply(graph);
             if (OptCanonicalizer.getValue()) {
                 new CanonicalizerPhase(true).apply(graph, new PhaseContext(providers, assumptions));
             }
@@ -687,7 +687,7 @@
                     end.disableSafepoint();
                 }
 
-                new DeadCodeEliminationPhase(REQUIRED).apply(graph);
+                new DeadCodeEliminationPhase(Required).apply(graph);
             } catch (Throwable e) {
                 throw Debug.handle(e);
             }

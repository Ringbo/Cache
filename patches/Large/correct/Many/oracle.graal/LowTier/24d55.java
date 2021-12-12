diff --git a/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/phases/LowTier.java b/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/phases/LowTier.java
index 2f7c14c..caae6b6 100644
--- a/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/phases/LowTier.java
+++ b/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/phases/LowTier.java
@@ -64,6 +64,6 @@
 
         appendPhase(new UseTrappingNullChecksPhase());
 
-        appendPhase(new DeadCodeEliminationPhase(REQUIRED));
+        appendPhase(new DeadCodeEliminationPhase(Required));
     }
 }

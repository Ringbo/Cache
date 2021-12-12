diff --git a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/ConditionalEliminationPhase.java b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/ConditionalEliminationPhase.java
index 679e6a0..cd4bf9f 100644
--- a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/ConditionalEliminationPhase.java
+++ b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/ConditionalEliminationPhase.java
@@ -347,10 +347,10 @@
                 } else {
                     if (state.isNull(x) && !state.isNonNull(y)) {
                         metricObjectEqualsRegistered.increment();
-                        state.addNullness(true, y);
+                        state.addNullness(false, y);
                     } else if (!state.isNonNull(x) && state.isNull(y)) {
                         metricObjectEqualsRegistered.increment();
-                        state.addNullness(true, x);
+                        state.addNullness(false, x);
                     }
                 }
             }

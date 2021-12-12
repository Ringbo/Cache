diff --git a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/debug/CompilationStatisticsListener.java b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/debug/CompilationStatisticsListener.java
index 8a63619..42a76b5 100644
--- a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/debug/CompilationStatisticsListener.java
+++ b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/debug/CompilationStatisticsListener.java
@@ -349,13 +349,13 @@
                 } else {
                     callCountDirectDispatched++;
                 }
-                if (decision.getProfile().getCallNode().isCallTargetCloned()) {
+                if (decision != null && decision.getProfile().getCallNode().isCallTargetCloned()) {
                     callCountDirectCloned++;
                 } else {
                     callCountDirectNotCloned++;
                 }
             } else if (node instanceof IndirectCallNode) {
-                callCountDirectInlined++;
+                callCountIndirect++;
             } else if (node instanceof LoopNode) {
                 loopCount++;
             }

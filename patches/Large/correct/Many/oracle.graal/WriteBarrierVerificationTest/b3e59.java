diff --git a/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/WriteBarrierVerificationTest.java b/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/WriteBarrierVerificationTest.java
index d57708a..edc9b70 100644
--- a/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/WriteBarrierVerificationTest.java
+++ b/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/WriteBarrierVerificationTest.java
@@ -683,7 +683,7 @@
                     }
 
                     @Override
-                    protected State afterSplit(BeginNode node, State oldState) {
+                    protected State afterSplit(AbstractBeginNode node, State oldState) {
                         return new State();
                     }
                 };

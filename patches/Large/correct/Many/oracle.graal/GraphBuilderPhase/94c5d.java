diff --git a/graal/com.oracle.graal.java/src/com/oracle/graal/java/GraphBuilderPhase.java b/graal/com.oracle.graal.java/src/com/oracle/graal/java/GraphBuilderPhase.java
index 58facf2..8229bdc 100644
--- a/graal/com.oracle.graal.java/src/com/oracle/graal/java/GraphBuilderPhase.java
+++ b/graal/com.oracle.graal.java/src/com/oracle/graal/java/GraphBuilderPhase.java
@@ -1176,7 +1176,7 @@
         }
         if (invokeKind != InvokeKind.Static) {
             emitExplicitExceptions(args[0], null);
-            if (invokeKind != InvokeKind.Special) {
+            if (invokeKind != InvokeKind.Special && this.optimisticOpts.useTypeCheckHints()) {
                 JavaTypeProfile profile = profilingInfo.getTypeProfile(bci());
                 args[0] = TypeProfileProxyNode.create(args[0], profile);
             }

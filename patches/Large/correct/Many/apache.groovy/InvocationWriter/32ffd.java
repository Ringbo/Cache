diff --git a/src/main/org/codehaus/groovy/classgen/asm/InvocationWriter.java b/src/main/org/codehaus/groovy/classgen/asm/InvocationWriter.java
index 79beba4..dc931e7 100644
--- a/src/main/org/codehaus/groovy/classgen/asm/InvocationWriter.java
+++ b/src/main/org/codehaus/groovy/classgen/asm/InvocationWriter.java
@@ -426,7 +426,7 @@
     }
     
     private void loadVariableWithReference(VariableExpression var) {
-        if (!var.isClosureSharedVariable()) {
+        if (!var.isUseReferenceDirectly()) {
             var.visit(controller.getAcg());
         } else {
             ClosureWriter.loadReference(var.getName(), controller);

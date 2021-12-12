diff --git a/plugins/java-decompiler/engine/src/org/jetbrains/java/decompiler/modules/decompiler/SwitchHelper.java b/plugins/java-decompiler/engine/src/org/jetbrains/java/decompiler/modules/decompiler/SwitchHelper.java
index cf935f4..6bf5975 100644
--- a/plugins/java-decompiler/engine/src/org/jetbrains/java/decompiler/modules/decompiler/SwitchHelper.java
+++ b/plugins/java-decompiler/engine/src/org/jetbrains/java/decompiler/modules/decompiler/SwitchHelper.java
@@ -42,7 +42,7 @@
         DecompilerContext.getClassProcessor().getMapRootClasses().get(arrayField.getClassname());
       if (classNode != null) {
         MethodWrapper wrapper = classNode.getWrapper().getMethodWrapper(CodeConstants.CLINIT_NAME, "()V");
-        if (wrapper != null) {
+        if (wrapper != null && wrapper.root != null) {
           wrapper.getOrBuildGraph().iterateExprents(new DirectGraph.ExprentIterator() {
             @Override
             public int processExprent(Exprent exprent) {

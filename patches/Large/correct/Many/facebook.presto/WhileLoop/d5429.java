diff --git a/presto-main/src/main/java/com/facebook/presto/byteCode/control/WhileLoop.java b/presto-main/src/main/java/com/facebook/presto/byteCode/control/WhileLoop.java
index 3fa7043..4d24b5e 100644
--- a/presto-main/src/main/java/com/facebook/presto/byteCode/control/WhileLoop.java
+++ b/presto-main/src/main/java/com/facebook/presto/byteCode/control/WhileLoop.java
@@ -88,7 +88,7 @@
     @Override
     public void accept(MethodVisitor visitor, MethodGenerationContext generationContext)
     {
-        checkState(condition.isEmpty(), "WhileLoop does not have a condition set");
+        checkState(!condition.isEmpty(), "WhileLoop does not have a condition set");
 
         Block block = new Block()
                 .visitLabel(continueLabel)

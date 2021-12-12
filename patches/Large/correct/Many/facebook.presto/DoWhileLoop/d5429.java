diff --git a/presto-main/src/main/java/com/facebook/presto/byteCode/control/DoWhileLoop.java b/presto-main/src/main/java/com/facebook/presto/byteCode/control/DoWhileLoop.java
index 2a0c444..88d9544 100644
--- a/presto-main/src/main/java/com/facebook/presto/byteCode/control/DoWhileLoop.java
+++ b/presto-main/src/main/java/com/facebook/presto/byteCode/control/DoWhileLoop.java
@@ -89,7 +89,7 @@
     @Override
     public void accept(MethodVisitor visitor, MethodGenerationContext generationContext)
     {
-        checkState(condition.isEmpty(), "DoWhileLoop does not have a condition set");
+        checkState(!condition.isEmpty(), "DoWhileLoop does not have a condition set");
 
         Block block = new Block()
                 .visitLabel(beginLabel)

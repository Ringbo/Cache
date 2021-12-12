diff --git a/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/nodes/WriteRegisterNode.java b/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/nodes/WriteRegisterNode.java
index f176eba..17f5e67 100644
--- a/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/nodes/WriteRegisterNode.java
+++ b/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/nodes/WriteRegisterNode.java
@@ -54,7 +54,7 @@
     @Override
     public void generate(LIRGeneratorTool generator) {
         Value val = generator.operand(value);
-        generator.emitMove(val, register.asValue(val.getKind()));
+        generator.emitMove(register.asValue(val.getKind()), val);
     }
 
     @Override

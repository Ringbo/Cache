diff --git a/compiler/src/org.graalvm.compiler.java/src/org/graalvm/compiler/java/BytecodeParser.java b/compiler/src/org.graalvm.compiler.java/src/org/graalvm/compiler/java/BytecodeParser.java
index 6ced33f..9a2705a 100644
--- a/compiler/src/org.graalvm.compiler.java/src/org/graalvm/compiler/java/BytecodeParser.java
+++ b/compiler/src/org.graalvm.compiler.java/src/org/graalvm/compiler/java/BytecodeParser.java
@@ -3552,7 +3552,7 @@
     private Object lookupConstant(int cpi, int opcode) {
         maybeEagerlyResolve(cpi, opcode);
         Object result = constantPool.lookupConstant(cpi);
-        assert !graphBuilderConfig.eagerResolving() || !(result instanceof JavaType) || (result instanceof ResolvedJavaType) : result;
+        assert !graphBuilderConfig.unresolvedIsError() || !(result instanceof JavaType) || (result instanceof ResolvedJavaType) : result;
         return result;
     }
 

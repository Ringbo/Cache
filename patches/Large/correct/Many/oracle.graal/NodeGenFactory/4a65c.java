diff --git a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java
index 522c3b8..d57e898 100644
--- a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java
+++ b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeGenFactory.java
@@ -2118,7 +2118,7 @@
         boolean elseIf = false;
         for (ExecutableTypeData executableType : executableTypes) {
             elseIf = builder.startIf(elseIf);
-            builder.string(implicitClassFieldName).string(" == ").typeLiteral(executableType.getType().getBoxedType());
+            builder.string(implicitClassFieldName).string(" == ").typeLiteral(executableType.getType().getPrimitiveType());
             builder.end();
             builder.startBlock();
             builder.startStatement().tree(assignment);

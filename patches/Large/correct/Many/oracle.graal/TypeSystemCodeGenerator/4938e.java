diff --git a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/TypeSystemCodeGenerator.java b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/TypeSystemCodeGenerator.java
index deda2a8..c5eafaf 100644
--- a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/TypeSystemCodeGenerator.java
+++ b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/TypeSystemCodeGenerator.java
@@ -238,7 +238,7 @@
         private final ProcessorContext context;
         private final TypeSystemData typeSystem;
 
-        public TypeClassFactory(ProcessorContext context, TypeSystemData typeSystem) {
+        TypeClassFactory(ProcessorContext context, TypeSystemData typeSystem) {
             this.context = context;
             this.typeSystem = typeSystem;
         }

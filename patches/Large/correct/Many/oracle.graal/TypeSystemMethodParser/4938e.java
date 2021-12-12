diff --git a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/TypeSystemMethodParser.java b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/TypeSystemMethodParser.java
index 144d5ca..4db1c9e 100644
--- a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/TypeSystemMethodParser.java
+++ b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/TypeSystemMethodParser.java
@@ -32,7 +32,7 @@
 
 abstract class TypeSystemMethodParser<E extends TemplateMethod> extends TemplateMethodParser<TypeSystemData, E> {
 
-    public TypeSystemMethodParser(ProcessorContext context, TypeSystemData typeSystem) {
+    TypeSystemMethodParser(ProcessorContext context, TypeSystemData typeSystem) {
         super(context, typeSystem);
     }
 

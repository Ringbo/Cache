diff --git a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/TypeCheckParser.java b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/TypeCheckParser.java
index aebd725..459f914 100644
--- a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/TypeCheckParser.java
+++ b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/TypeCheckParser.java
@@ -36,7 +36,7 @@
 
 class TypeCheckParser extends TypeSystemMethodParser<TypeCheckData> {
 
-    public TypeCheckParser(ProcessorContext context, TypeSystemData typeSystem) {
+    TypeCheckParser(ProcessorContext context, TypeSystemData typeSystem) {
         super(context, typeSystem);
     }
 

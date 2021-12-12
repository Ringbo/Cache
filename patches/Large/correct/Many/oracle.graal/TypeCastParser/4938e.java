diff --git a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/TypeCastParser.java b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/TypeCastParser.java
index 9286ec4..266498c 100644
--- a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/TypeCastParser.java
+++ b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/TypeCastParser.java
@@ -37,7 +37,7 @@
 
 class TypeCastParser extends TypeSystemMethodParser<TypeCastData> {
 
-    public TypeCastParser(ProcessorContext context, TypeSystemData typeSystem) {
+    TypeCastParser(ProcessorContext context, TypeSystemData typeSystem) {
         super(context, typeSystem);
     }
 

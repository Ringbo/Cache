diff --git a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/AnnotationProcessor.java b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/AnnotationProcessor.java
index 0e193cd..8244e06 100644
--- a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/AnnotationProcessor.java
+++ b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/AnnotationProcessor.java
@@ -45,7 +45,7 @@
 
     private final Set<String> processedElements = new HashSet<>();
 
-    public AnnotationProcessor(AbstractParser<M> parser, CodeTypeElementFactory<M> factory) {
+    AnnotationProcessor(AbstractParser<M> parser, CodeTypeElementFactory<M> factory) {
         this.parser = parser;
         this.factory = factory;
     }

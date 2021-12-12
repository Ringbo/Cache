diff --git a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeFactoryFactory.java b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeFactoryFactory.java
index b4eaa78..060cca2 100644
--- a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeFactoryFactory.java
+++ b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/generator/NodeFactoryFactory.java
@@ -52,7 +52,7 @@
     private final NodeData node;
     private final CodeTypeElement createdFactoryElement;
 
-    public NodeFactoryFactory(ProcessorContext context, NodeData node, CodeTypeElement createdClass) {
+    NodeFactoryFactory(ProcessorContext context, NodeData node, CodeTypeElement createdClass) {
         this.context = context;
         this.node = node;
         this.createdFactoryElement = createdClass;

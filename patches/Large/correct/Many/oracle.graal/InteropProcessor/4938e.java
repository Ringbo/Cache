diff --git a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/InteropProcessor.java b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/InteropProcessor.java
index 5f7dbf5..061f178 100644
--- a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/InteropProcessor.java
+++ b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/InteropProcessor.java
@@ -718,7 +718,7 @@
 
         private final Map<Message, String> messageHandlers;
 
-        public FactoryGenerator(String packageName, String className, String receiverTypeClass, JavaFileObject factoryFile) {
+        FactoryGenerator(String packageName, String className, String receiverTypeClass, JavaFileObject factoryFile) {
             this.receiverTypeClass = receiverTypeClass;
             this.className = className;
             this.packageName = packageName;

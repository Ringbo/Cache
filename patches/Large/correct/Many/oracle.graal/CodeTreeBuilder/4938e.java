diff --git a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/model/CodeTreeBuilder.java b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/model/CodeTreeBuilder.java
index 7528273..b7d93b4 100644
--- a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/model/CodeTreeBuilder.java
+++ b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/model/CodeTreeBuilder.java
@@ -738,7 +738,7 @@
         private EndCallback atEndListener;
         private CodeTreeKind removeLast;
 
-        public BuilderCodeTree(CodeTree parent, CodeTreeKind kind, TypeMirror type, String string) {
+        BuilderCodeTree(CodeTree parent, CodeTreeKind kind, TypeMirror type, String string) {
             super(parent, kind, type, string);
         }
 
@@ -766,7 +766,7 @@
             private final EndCallback callback1;
             private final EndCallback callback2;
 
-            public CompoundCallback(EndCallback callback1, EndCallback callback2) {
+            CompoundCallback(EndCallback callback1, EndCallback callback2) {
                 this.callback1 = callback1;
                 this.callback2 = callback2;
             }

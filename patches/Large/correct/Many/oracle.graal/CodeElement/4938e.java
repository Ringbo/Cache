diff --git a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/model/CodeElement.java b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/model/CodeElement.java
index cec17c7..fe2ccaf 100644
--- a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/model/CodeElement.java
+++ b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/model/CodeElement.java
@@ -174,7 +174,7 @@
 
     private static class StringBuilderCodeWriter extends AbstractCodeWriter {
 
-        public StringBuilderCodeWriter() {
+        StringBuilderCodeWriter() {
             this.writer = new CharArrayWriter();
         }
 
@@ -194,7 +194,7 @@
         private final Element parent;
         private final List<T> delegate;
 
-        public ParentableList(Element parent, List<T> delegate) {
+        ParentableList(Element parent, List<T> delegate) {
             this.parent = parent;
             this.delegate = delegate;
         }

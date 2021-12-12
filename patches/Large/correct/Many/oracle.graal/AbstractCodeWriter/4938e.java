diff --git a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/transform/AbstractCodeWriter.java b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/transform/AbstractCodeWriter.java
index 3cd5dc7..5e2fa81 100644
--- a/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/transform/AbstractCodeWriter.java
+++ b/truffle/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/java/transform/AbstractCodeWriter.java
@@ -372,7 +372,7 @@
 
         private final Element enclosedElement;
 
-        public AnnotationValueWriterVisitor(Element enclosedElement) {
+        AnnotationValueWriterVisitor(Element enclosedElement) {
             this.enclosedElement = enclosedElement;
         }
 
@@ -741,7 +741,7 @@
         private final Writer delegate;
         private final StringBuilder buffer = new StringBuilder();
 
-        public TrimTrailingSpaceWriter(Writer delegate) {
+        TrimTrailingSpaceWriter(Writer delegate) {
             this.delegate = delegate;
         }
 

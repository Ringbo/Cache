diff --git a/requery-processor/src/main/java/io/requery/processor/ElementValidator.java b/requery-processor/src/main/java/io/requery/processor/ElementValidator.java
index a7d676f..10f3c8a 100644
--- a/requery-processor/src/main/java/io/requery/processor/ElementValidator.java
+++ b/requery-processor/src/main/java/io/requery/processor/ElementValidator.java
@@ -42,12 +42,12 @@
         this.messager = processingEnvironment.getMessager();
     }
 
-    public void error(String message) {
+    void error(String message) {
         hasErrors = true;
         messager.printMessage(Diagnostic.Kind.ERROR, message, element);
     }
 
-    public void error(String message, Class<? extends Annotation> annotation) {
+    void error(String message, Class<? extends Annotation> annotation) {
         hasErrors = true;
         String name = annotation.getName();
         Optional<? extends AnnotationMirror> mirror = Mirrors.findAnnotationMirror(element, name);
@@ -58,12 +58,12 @@
         }
     }
 
-    public void warning(String message) {
+    void warning(String message) {
         hasWarnings = true;
         messager.printMessage(Diagnostic.Kind.WARNING, message, element);
     }
 
-    public void warning(String message, Class<? extends Annotation> annotation) {
+    void warning(String message, Class<? extends Annotation> annotation) {
         hasWarnings = true;
         String name = annotation.getName();
         Optional<? extends AnnotationMirror> mirror = Mirrors.findAnnotationMirror(element, name);
@@ -74,11 +74,11 @@
         }
     }
 
-    public boolean hasWarnings() {
+    boolean hasWarnings() {
         return hasWarnings;
     }
 
-    public boolean hasErrors() {
+    boolean hasErrors() {
         return hasErrors;
     }
 

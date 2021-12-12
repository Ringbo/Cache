diff --git a/src/main/org/codehaus/groovy/runtime/metaclass/MethodSelectionException.java b/src/main/org/codehaus/groovy/runtime/metaclass/MethodSelectionException.java
index 209c6a6..c34a8e5 100644
--- a/src/main/org/codehaus/groovy/runtime/metaclass/MethodSelectionException.java
+++ b/src/main/org/codehaus/groovy/runtime/metaclass/MethodSelectionException.java
@@ -53,7 +53,7 @@
     }
 
     public String getMessage() {
-        StringBuffer buffer = new StringBuffer();
+        StringBuilder buffer = new StringBuilder();
         buffer.append("Could not find which method ").append(methodName);
         appendClassNames(buffer,arguments);
         buffer.append(" to invoke from this list:");
@@ -62,7 +62,7 @@
     }
     
     
-    private void appendClassNames(StringBuffer argBuf, Class[] classes) {
+    private void appendClassNames(StringBuilder argBuf, Class[] classes) {
         argBuf.append("(");
         for (int i = 0; i < classes.length; i++) {
             if (i > 0) {
@@ -75,7 +75,7 @@
         argBuf.append(")");
     }
     
-    private void appendMethods(StringBuffer buffer) {
+    private void appendMethods(StringBuilder buffer) {
         for (int i = 0; i < methods.size; i++) {
             buffer.append("\n  ");
             Object methodOrConstructor = methods.get(i);

diff --git a/src/main/org/codehaus/groovy/tools/javac/JavaStubGenerator.java b/src/main/org/codehaus/groovy/tools/javac/JavaStubGenerator.java
index 906e147..85620a8 100644
--- a/src/main/org/codehaus/groovy/tools/javac/JavaStubGenerator.java
+++ b/src/main/org/codehaus/groovy/tools/javac/JavaStubGenerator.java
@@ -541,7 +541,7 @@
     private void printDefaultValue(PrintWriter out, ClassNode type) {
         if (type.redirect() != ClassHelper.OBJECT_TYPE && type.redirect() != ClassHelper.boolean_TYPE) {
             out.print("(");
-            printTypeWithoutBounds(out, type);
+            printType(out, type);
             out.print(")");
         }
 

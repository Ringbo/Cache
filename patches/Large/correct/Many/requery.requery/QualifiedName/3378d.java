diff --git a/requery-processor/src/main/java/io/requery/processor/QualifiedName.java b/requery-processor/src/main/java/io/requery/processor/QualifiedName.java
index c68b654..f867cd2 100644
--- a/requery-processor/src/main/java/io/requery/processor/QualifiedName.java
+++ b/requery-processor/src/main/java/io/requery/processor/QualifiedName.java
@@ -34,7 +34,7 @@
             throw new IllegalArgumentException();
         }
         if (!SourceVersion.isIdentifier(className)) {
-            throw new IllegalArgumentException("invalid class name identifier");
+            throw new IllegalArgumentException("Invalid class name identifier: " + className);
         }
         this.packageName = packageName;
         this.className = className;
@@ -62,19 +62,19 @@
         }
         packageName = packageBuilder.toString();
         if (Names.isEmpty(className)) {
-            throw new IllegalArgumentException("empty class name");
+            throw new IllegalArgumentException("Empty class name");
         }
         if (!SourceVersion.isIdentifier(className)) {
-            throw new IllegalArgumentException("invalid class name identifier");
+            throw new IllegalArgumentException("Invalid class name identifier: " + className);
         }
         this.className = className;
     }
 
-    public String packageName() {
+    String packageName() {
         return packageName;
     }
 
-    public String className() {
+    String className() {
         return className;
     }
 

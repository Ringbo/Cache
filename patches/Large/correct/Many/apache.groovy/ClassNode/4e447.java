diff --git a/src/main/org/codehaus/groovy/ast/ClassNode.java b/src/main/org/codehaus/groovy/ast/ClassNode.java
index bd9c767..159ea12 100644
--- a/src/main/org/codehaus/groovy/ast/ClassNode.java
+++ b/src/main/org/codehaus/groovy/ast/ClassNode.java
@@ -482,7 +482,7 @@
     public String resolveClassName(String type) {
         String answer = null;
         if (type != null) {
-            if (getNameWithoutPackage().equals(type)) {
+            if (getName().equals(type) || getNameWithoutPackage().equals(type)) {
                 return getName();
             }
             answer = tryResolveClassFromCompileUnit(type);

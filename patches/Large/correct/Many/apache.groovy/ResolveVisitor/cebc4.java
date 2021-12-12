diff --git a/src/main/org/codehaus/groovy/control/ResolveVisitor.java b/src/main/org/codehaus/groovy/control/ResolveVisitor.java
index 81b792a..dec2343 100644
--- a/src/main/org/codehaus/groovy/control/ResolveVisitor.java
+++ b/src/main/org/codehaus/groovy/control/ResolveVisitor.java
@@ -1096,7 +1096,7 @@
         currentClass.setUsingGenerics(true);
         for (GenericsType type : types) {
             ClassNode classNode = type.getType();
-            String name = classNode.getName();
+            String name = type.getName();
             ClassNode[] bounds = type.getUpperBounds();
             if (bounds != null) {
                 boolean nameAdded = false;

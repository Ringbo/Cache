diff --git a/translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java b/translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java
index acd088e..ae114ac 100644
--- a/translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java
+++ b/translator/src/main/java/com/google/devtools/j2objc/util/NameTable.java
@@ -417,7 +417,7 @@
     }
     String name;
     if (type.getKind().isPrimitive()) {
-      name = typeUtil.getName(type);
+      name = TypeUtil.getName(type);
     } else {
       // For type variables, use the first bound for the parameter keyword.
       List<? extends TypeMirror> bounds = typeUtil.getUpperBounds(type);

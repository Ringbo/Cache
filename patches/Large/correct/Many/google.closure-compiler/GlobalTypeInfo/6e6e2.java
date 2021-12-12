diff --git a/src/com/google/javascript/jscomp/GlobalTypeInfo.java b/src/com/google/javascript/jscomp/GlobalTypeInfo.java
index d94399c..3bcfbf6 100644
--- a/src/com/google/javascript/jscomp/GlobalTypeInfo.java
+++ b/src/com/google/javascript/jscomp/GlobalTypeInfo.java
@@ -1509,11 +1509,10 @@
             } else if (ctorType.isStruct() && !parentClass.isStruct()) {
               warnings.add(JSError.make(
                   declNode, TypeCheck.CONFLICTING_SHAPE_TYPE,
-                      className, "struct", "struct"));
+                      "struct", className));
             } else if (ctorType.isDict() && !parentClass.isDict()) {
               warnings.add(JSError.make(
-                  declNode, TypeCheck.CONFLICTING_SHAPE_TYPE, className,
-                  "dict", "dict"));
+                  declNode, TypeCheck.CONFLICTING_SHAPE_TYPE, "dict", className));
             }
           }
           if (ctorType.isDict() && !implementedIntfs.isEmpty()) {

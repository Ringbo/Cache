diff --git a/src/com/google/javascript/jscomp/newtypes/ObjectType.java b/src/com/google/javascript/jscomp/newtypes/ObjectType.java
index 628e379..09a6da0 100644
--- a/src/com/google/javascript/jscomp/newtypes/ObjectType.java
+++ b/src/com/google/javascript/jscomp/newtypes/ObjectType.java
@@ -434,7 +434,7 @@
         resultNominalType,
         meetPropsHelper(false, resultNominalType, obj1.props, obj2.props),
         FunctionType.meet(obj1.fn, obj2.fn),
-        obj1.isLoose || obj2.isLoose,
+        obj1.isLoose && obj2.isLoose,
         ObjectKind.meet(obj1.objectKind, obj2.objectKind));
   }
 

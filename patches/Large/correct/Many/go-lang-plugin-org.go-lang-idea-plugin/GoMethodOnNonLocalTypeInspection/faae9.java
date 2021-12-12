diff --git a/src/com/goide/inspections/GoMethodOnNonLocalTypeInspection.java b/src/com/goide/inspections/GoMethodOnNonLocalTypeInspection.java
index 9c11c53..75c0b97 100644
--- a/src/com/goide/inspections/GoMethodOnNonLocalTypeInspection.java
+++ b/src/com/goide/inspections/GoMethodOnNonLocalTypeInspection.java
@@ -39,7 +39,7 @@
         if (methodType == null ||
             methodType.getTypeReferenceExpression() == null) return;
 
-        methodType = GoPsiImplUtil.findBaseTypeFromRef(methodType.getTypeReferenceExpression());
+        methodType = GoPsiImplUtil.findTypeFromTypeRef(methodType.getTypeReferenceExpression());
         if (methodType == null) return;
 
         String typeImportPath = ((GoFile)methodType.getContainingFile()).getImportPath();

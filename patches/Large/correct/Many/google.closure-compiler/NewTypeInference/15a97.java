diff --git a/src/com/google/javascript/jscomp/NewTypeInference.java b/src/com/google/javascript/jscomp/NewTypeInference.java
index eb30eff..46709e5 100644
--- a/src/com/google/javascript/jscomp/NewTypeInference.java
+++ b/src/com/google/javascript/jscomp/NewTypeInference.java
@@ -123,8 +123,10 @@
   static final DiagnosticType NOT_UNIQUE_INSTANTIATION =
       DiagnosticType.warning(
           "JSC_NTI_NOT_UNIQUE_INSTANTIATION",
-          "Illegal instantiation in function type {0} for the type variable "
-          + "{1}.\n You can only specify one type. Found {2}.");
+          "When instantiating a polymorphic function,"
+          + " you can only specify one type for each type variable.\n"
+          + " Found {0} types for type variable {1}: {2},\n"
+          + " when instantiating type: {3}");
 
   static final DiagnosticType FAILED_TO_UNIFY =
       DiagnosticType.warning(
@@ -2268,9 +2270,11 @@
       if (types.size() > 1) {
         if (isFwd) {
           warnings.add(JSError.make(
-              callNode, NOT_UNIQUE_INSTANTIATION, funType.toString(),
+              callNode, NOT_UNIQUE_INSTANTIATION,
+              Integer.toString(types.size()),
               UniqueNameGenerator.getOriginalName(typeParam),
-              types.toString()));
+              types.toString(),
+              funType.toString()));
         }
         builder.put(typeParam, JSType.UNKNOWN);
       } else if (types.size() == 1) {

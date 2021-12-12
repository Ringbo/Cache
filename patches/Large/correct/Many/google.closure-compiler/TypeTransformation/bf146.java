diff --git a/src/com/google/javascript/jscomp/TypeTransformation.java b/src/com/google/javascript/jscomp/TypeTransformation.java
index f8a3e43..fb8028b 100644
--- a/src/com/google/javascript/jscomp/TypeTransformation.java
+++ b/src/com/google/javascript/jscomp/TypeTransformation.java
@@ -69,7 +69,7 @@
           "Expected templatized type in {0} found {1}");
   static final DiagnosticType INDEX_OUTOFBOUNDS =
       DiagnosticType.warning("INDEX_OUTOFBOUNDS",
-      "Index out of bounds in templateTypeOf: {0} > {1}");
+      "Index out of bounds in templateTypeOf: {0} >= {1}");
   static final DiagnosticType DUPLICATE_VARIABLE =
       DiagnosticType.warning("DUPLICATE_VARIABLE",
           "The variable {0} is already defined");
@@ -625,7 +625,7 @@
     int index = (int) params.get(1).getDouble();
     ImmutableList<JSType> templateTypes =
         ((TemplatizedType) type).getTemplateTypes();
-    if (index > templateTypes.size()) {
+    if (index >= templateTypes.size()) {
       reportWarning(ttlAst, INDEX_OUTOFBOUNDS,
           Integer.toString(index), Integer.toString(templateTypes.size()));
       return getUnknownType();

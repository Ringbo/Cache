diff --git a/src/com/google/javascript/jscomp/ClosureCheckModule.java b/src/com/google/javascript/jscomp/ClosureCheckModule.java
index 4510136..b3238e9 100644
--- a/src/com/google/javascript/jscomp/ClosureCheckModule.java
+++ b/src/com/google/javascript/jscomp/ClosureCheckModule.java
@@ -66,7 +66,7 @@
   static final DiagnosticType REFERENCE_TO_SHORT_IMPORT_BY_LONG_NAME =
       DiagnosticType.disabled(
           "JSC_REFERENCE_TO_SHORT_IMPORT_BY_LONG_NAME",
-          "Reference fully qualified import name ''{0}''. Please use the short name instead.");
+          "Reference to fully qualified import name ''{0}''. Please use the short name instead.");
 
   static final DiagnosticType REQUIRE_NOT_AT_TOP_LEVEL =
       DiagnosticType.error(
@@ -139,7 +139,7 @@
         if (currentModuleName != null && n.matchesQualifiedName(currentModuleName)) {
           t.report(n, REFERENCE_TO_MODULE_GLOBAL_NAME);
         } else if (shortRequiredNamespaces.contains(n.getQualifiedName())) {
-          t.report(n, REFERENCE_TO_SHORT_IMPORT_BY_LONG_NAME);
+          t.report(n, REFERENCE_TO_SHORT_IMPORT_BY_LONG_NAME, n.getQualifiedName());
         }
         break;
       case Token.SCRIPT:

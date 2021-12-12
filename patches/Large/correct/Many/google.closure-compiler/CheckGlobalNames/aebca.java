diff --git a/src/com/google/javascript/jscomp/CheckGlobalNames.java b/src/com/google/javascript/jscomp/CheckGlobalNames.java
index 1e63880..8542008 100644
--- a/src/com/google/javascript/jscomp/CheckGlobalNames.java
+++ b/src/com/google/javascript/jscomp/CheckGlobalNames.java
@@ -43,7 +43,7 @@
   static final DiagnosticType NAME_DEFINED_LATE_WARNING =
       DiagnosticType.warning(
           "JSC_NAME_DEFINED_LATE",
-          "{0} is not defined yet, so properties cannot be referenced on it");
+          "{0} defined before its owner. {1} is defined at {2}:{3}");
 
   static final DiagnosticType STRICT_MODULE_DEP_QNAME =
       DiagnosticType.disabled(
@@ -131,7 +131,11 @@
           parent.declaration.preOrderIndex > ref.preOrderIndex) {
         compiler.report(
             JSError.make(ref.source.getName(), ref.node,
-                NAME_DEFINED_LATE_WARNING, parent.fullName()));
+                NAME_DEFINED_LATE_WARNING,
+                name.fullName(),
+                parent.fullName(),
+                parent.declaration.source.getName(),
+                String.valueOf(parent.declaration.node.getLineno())));
       }
     }
   }

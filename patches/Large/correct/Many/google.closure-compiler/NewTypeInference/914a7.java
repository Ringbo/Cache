diff --git a/src/com/google/javascript/jscomp/NewTypeInference.java b/src/com/google/javascript/jscomp/NewTypeInference.java
index 0e4e487..d037f4a 100644
--- a/src/com/google/javascript/jscomp/NewTypeInference.java
+++ b/src/com/google/javascript/jscomp/NewTypeInference.java
@@ -185,7 +185,8 @@
   static final DiagnosticType GOOG_BIND_EXPECTS_FUNCTION =
       DiagnosticType.warning(
           "JSC_GOOG_BIND_EXPECTS_FUNCTION",
-          "The first argument to goog.bind/goog.partial must be a function.");
+          "The first argument to goog.bind/goog.partial must be a function,"
+          + " found: {0}");
 
   static final DiagnosticType BOTTOM_PROP =
       DiagnosticType.warning(
@@ -1759,7 +1760,7 @@
     TypeEnv env = pair.env;
     FunctionType boundFunType = pair.type.getFunTypeIfSingletonObj();
     if (!pair.type.isSubtypeOf(commonTypes.topFunction())) {
-      warnings.add(JSError.make(boundFunNode, GOOG_BIND_EXPECTS_FUNCTION));
+      warnings.add(JSError.make(boundFunNode, GOOG_BIND_EXPECTS_FUNCTION, pair.type.toString()));
     }
     // For some function types, we don't know enough to handle .bind specially.
     if (boundFunType == null

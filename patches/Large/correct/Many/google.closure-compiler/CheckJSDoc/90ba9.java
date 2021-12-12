diff --git a/src/com/google/javascript/jscomp/CheckJSDoc.java b/src/com/google/javascript/jscomp/CheckJSDoc.java
index 8f9d727..5b773ee 100644
--- a/src/com/google/javascript/jscomp/CheckJSDoc.java
+++ b/src/com/google/javascript/jscomp/CheckJSDoc.java
@@ -173,31 +173,32 @@
 
     if (functionNode == null) {
       // @abstract annotation on a non-function
-      report(n, MISPLACED_ANNOTATION);
+      report(n, MISPLACED_ANNOTATION, "@abstract", "only functions or methods can be abstract");
       return;
     }
 
     if (NodeUtil.getFunctionBody(functionNode).hasChildren()) {
       // @abstract annotation on a function with a non-empty body
-      report(n, MISPLACED_ANNOTATION);
+      report(n, MISPLACED_ANNOTATION, "@abstract",
+          "function with a non-empty body cannot be abstract");
       return;
     }
 
     if (n.isMemberFunctionDef() && "constructor".equals(n.getString())) {
       // @abstract annotation on an ES6 constructor
-      report(n, MISPLACED_ANNOTATION);
+      report(n, MISPLACED_ANNOTATION, "@abstract", "constructors cannot be abstract");
       return;
     }
 
     if (!n.isMemberFunctionDef() && !NodeUtil.isPrototypeMethod(functionNode)) {
       // @abstract annotation on a non-method (or static method) in ES5
-      report(n, MISPLACED_ANNOTATION);
+      report(n, MISPLACED_ANNOTATION, "@abstract", "only functions or methods can be abstract");
       return;
     }
 
     if (n.isStaticMember()) {
       // @abstract annotation on a static method in ES6
-      report(n, MISPLACED_ANNOTATION);
+      report(n, MISPLACED_ANNOTATION, "@abstract", "static methods cannot be abstract");
       return;
     }
   }

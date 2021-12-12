diff --git a/test/com/google/javascript/jscomp/RemoveUnusedCodeNameAnalyzerTest.java b/test/com/google/javascript/jscomp/RemoveUnusedCodeNameAnalyzerTest.java
index b5fef34..0f55d30 100644
--- a/test/com/google/javascript/jscomp/RemoveUnusedCodeNameAnalyzerTest.java
+++ b/test/com/google/javascript/jscomp/RemoveUnusedCodeNameAnalyzerTest.java
@@ -588,20 +588,20 @@
         "var ns = {}; ns.Class1 = class {}; use(ns.Class1);");
   }
 
-  // TODO(b/66971163): enable or remove this
-  public void disabledTestAssignmentToThisPrototype() {
+  public void testAssignmentToThisPrototype() {
     testSame(
         lines(
             "Function.prototype.inherits = function(parentCtor) {",
             "  function tempCtor() {};",
             "  tempCtor.prototype = parentCtor.prototype;",
-            // the test currently fails because the assignment to this.superClass_ gets removed.
-            // Maybe we need to include codingConvention.getIndirectlyDeclaredProperties(), which
-            // includes "superClass_" in the initial list of referenced properties?
             "  this.superClass_ = parentCtor.prototype;",
             "  this.prototype = new tempCtor();",
             "  this.prototype.constructor = this;",
-            "};"));
+            "};",
+            "/** @constructor */ function A() {}",
+            "/** @constructor */ function B() {}",
+            "B.inherits(A);",
+            "use(B.superClass_);"));
   }
 
   public void testAssignmentToCallResultPrototype() {

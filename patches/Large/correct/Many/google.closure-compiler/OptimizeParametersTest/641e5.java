diff --git a/test/com/google/javascript/jscomp/OptimizeParametersTest.java b/test/com/google/javascript/jscomp/OptimizeParametersTest.java
index 7012b25..1eb1839 100644
--- a/test/com/google/javascript/jscomp/OptimizeParametersTest.java
+++ b/test/com/google/javascript/jscomp/OptimizeParametersTest.java
@@ -163,13 +163,13 @@
     testSame("var foo = function () {}; foo.call();");
 
     testSame("var foo = function () {}; foo.call(this);");
-    testSame(
+    test(
         "var foo = function (a) {}; foo.call(this, 1);",
-        "var foo = function () {var a$jscomp$1 = 1;}; foo.call(this);");
+        "var foo = function () {var a = 1;}; foo.call(this);");
     testSame("var foo = function () {}; foo.call(null);");
-    testSame(
+    test(
         "var foo = function (a) {}; foo.call(null, 1);",
-        "var foo = function () {var a$jscomp$1 = 1;}; foo.call(null);");
+        "var foo = function () {var a = 1;}; foo.call(null);");
   }
 
   public void testDoOptimizeApply() {
@@ -445,11 +445,9 @@
   }
 
   public void testFunctionWithReferenceToArgumentsShouldNotBeOptimize() {
-    testSame("function foo(a,b,c) { return arguments.size; };" +
-             "foo(1);");
+    testSame("function foo(a,b,c) { return arguments.size; }; foo(1);");
     testSame("var foo = function(a,b,c) { return arguments.size }; foo(1);");
-    testSame("var foo = function bar(a,b,c) { return arguments.size }; " +
-             "foo(2); bar(2);");
+    testSame("var foo = function bar(a,b,c) { return arguments.size }; foo(2); bar(2);");
   }
 
   public void testFunctionWithTwoNames() {

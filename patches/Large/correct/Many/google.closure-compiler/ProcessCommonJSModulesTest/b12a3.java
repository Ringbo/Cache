diff --git a/test/com/google/javascript/jscomp/ProcessCommonJSModulesTest.java b/test/com/google/javascript/jscomp/ProcessCommonJSModulesTest.java
index 191bcfe..e2475e1 100644
--- a/test/com/google/javascript/jscomp/ProcessCommonJSModulesTest.java
+++ b/test/com/google/javascript/jscomp/ProcessCommonJSModulesTest.java
@@ -177,19 +177,19 @@
 
   public void testModuleExportsScope() {
     setFilename("test");
-    test(
+    testModules(
         "var foo = function (module) {module.exports = {};};" +
         "module.exports = foo;",
         "goog.provide('module$test');" +
         "var foo$$module$test=function(module){module.exports={}};" +
         "var module$test=foo$$module$test");
-    test(
+    testModules(
         "var foo = function () {var module = {};module.exports = {};};" +
         "module.exports = foo;",
         "goog.provide('module$test');" +
         "var foo$$module$test=function(){var module={};module.exports={}};" +
         "var module$test=foo$$module$test");
-    test(
+    testModules(
         "var foo = function () {if (true) var module = {};" +
         "module.exports = {};};" +
         "module.exports = foo;",

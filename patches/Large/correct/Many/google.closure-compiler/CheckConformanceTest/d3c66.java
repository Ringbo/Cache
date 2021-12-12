diff --git a/test/com/google/javascript/jscomp/CheckConformanceTest.java b/test/com/google/javascript/jscomp/CheckConformanceTest.java
index 8c95572..a806f38 100644
--- a/test/com/google/javascript/jscomp/CheckConformanceTest.java
+++ b/test/com/google/javascript/jscomp/CheckConformanceTest.java
@@ -1054,7 +1054,7 @@
         "function f() {goog.asserts.assertInstanceof(this, Error);}");
   }
 
-  private String config(String rule, String message, String... fields) {
+  private static String config(String rule, String message, String... fields) {
     String result = "requirement: {\n"
         + "  type: CUSTOM\n"
         + "  java_class: '" + rule + "'\n";
@@ -1065,11 +1065,11 @@
     return result;
   }
 
-  private String rule(String rule) {
+  private static String rule(String rule) {
     return "com.google.javascript.jscomp.ConformanceRules$" + rule;
   }
 
-  private String value(String value) {
+  private static String value(String value) {
     return "  value: '" + value + "'\n";
   }
 

diff --git a/test/com/google/javascript/jscomp/NormalizeTest.java b/test/com/google/javascript/jscomp/NormalizeTest.java
index 45329b3..34b9088 100644
--- a/test/com/google/javascript/jscomp/NormalizeTest.java
+++ b/test/com/google/javascript/jscomp/NormalizeTest.java
@@ -187,7 +187,7 @@
          "function f() { f(); if (true) {var bar = function () {}}}");
   }
 
-  private String inFunction(String code) {
+  private static String inFunction(String code) {
     return "(function(){" + code + "})";
   }
 

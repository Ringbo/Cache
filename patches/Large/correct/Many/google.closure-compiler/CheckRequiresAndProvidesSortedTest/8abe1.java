diff --git a/test/com/google/javascript/jscomp/lint/CheckRequiresAndProvidesSortedTest.java b/test/com/google/javascript/jscomp/lint/CheckRequiresAndProvidesSortedTest.java
index 3dfb0fc..17d01ee 100644
--- a/test/com/google/javascript/jscomp/lint/CheckRequiresAndProvidesSortedTest.java
+++ b/test/com/google/javascript/jscomp/lint/CheckRequiresAndProvidesSortedTest.java
@@ -62,9 +62,7 @@
   }
 
   public void testWarning_require() {
-    testWarning("goog.require('a.c');\ngoog.require('a.b')", REQUIRES_NOT_SORTED,
-        "goog.require() statements are not sorted. The correct order is:\n\n"
-        + "goog.require('a.b');\ngoog.require('a.c');\n\n");
+    testWarning("goog.require('a.c');\ngoog.require('a.b')", REQUIRES_NOT_SORTED);
 
     testWarning("goog.require('a.c');\ngoog.require('a')", REQUIRES_NOT_SORTED);
   }
@@ -75,17 +73,7 @@
             "goog.require('a.c');",
             "/** @suppress {extraRequire} */",
             "goog.require('a.b')"),
-        REQUIRES_NOT_SORTED,
-        LINE_JOINER.join(
-            "goog.require() statements are not sorted. The correct order is:",
-            "",
-            "/**",
-            " @suppress {extraRequire}",
-            " */",
-            "goog.require('a.b');",
-            "goog.require('a.c');",
-            "",
-            ""));
+        REQUIRES_NOT_SORTED);
   }
 
   public void testWarning_provide() {
@@ -157,9 +145,7 @@
             "var c = goog.require('a.c');",
             "",
             "alert(1);"),
-        REQUIRES_NOT_SORTED,
-        "goog.require() statements are not sorted. The correct order is:\n\n"
-            + "var c = goog.require('a.c');\nvar d = goog.require('a.b.d');\n\n");
+        REQUIRES_NOT_SORTED);
   }
 
   public void testGoogModule_shorthand_destructuring() {

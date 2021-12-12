diff --git a/test/com/google/javascript/jscomp/ClosureReverseAbstractInterpreterTest.java b/test/com/google/javascript/jscomp/ClosureReverseAbstractInterpreterTest.java
index e6e6f8c..8c0b429 100644
--- a/test/com/google/javascript/jscomp/ClosureReverseAbstractInterpreterTest.java
+++ b/test/com/google/javascript/jscomp/ClosureReverseAbstractInterpreterTest.java
@@ -205,7 +205,7 @@
   public void testGoogIsArray2() throws Exception {
     testClosureFunction("goog.isArray",
         ALL_TYPE,
-        ALL_TYPE, // TODO(johnlenz): should be ARRAY_TYPE?
+        ARRAY_TYPE,
         ALL_TYPE);
   }
 

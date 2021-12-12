diff --git a/test/com/google/javascript/jscomp/ProcessClosurePrimitivesTest.java b/test/com/google/javascript/jscomp/ProcessClosurePrimitivesTest.java
index 7154c06..b1c93da 100644
--- a/test/com/google/javascript/jscomp/ProcessClosurePrimitivesTest.java
+++ b/test/com/google/javascript/jscomp/ProcessClosurePrimitivesTest.java
@@ -1039,12 +1039,12 @@
 
   public void testInvalidGoogBase14() {
     testError("class Foo extends BaseFoo { constructor() { Foo.base(this); } }",
-        GOOG_BASE_CLASS_ERROR);
+        BASE_CLASS_ERROR);
   }
 
   public void testInvalidGoogBase14b() {
     testError("class Foo extends BaseFoo { method() { Foo.base(this, 'method'); } }",
-        GOOG_BASE_CLASS_ERROR);
+        BASE_CLASS_ERROR);
   }
 
   public void testValidBase1() {

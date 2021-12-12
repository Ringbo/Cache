diff --git a/src/main/java/org/testng/asserts/Assertion.java b/src/main/java/org/testng/asserts/Assertion.java
index 743dfcf..200df71 100644
--- a/src/main/java/org/testng/asserts/Assertion.java
+++ b/src/main/java/org/testng/asserts/Assertion.java
@@ -106,7 +106,7 @@
 
 
   public void assertTrue(final boolean condition, final String message) {
-    doAssert(new SimpleAssert<Boolean>(condition, Boolean.TRUE) {
+    doAssert(new SimpleAssert<Boolean>(condition, Boolean.TRUE, message) {
       @Override
       public void doAssert() {
         org.testng.Assert.assertTrue(condition, message);

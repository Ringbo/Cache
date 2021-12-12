diff --git a/src/main/java/org/testng/Assert.java b/src/main/java/org/testng/Assert.java
index 51217f4..6597895 100644
--- a/src/main/java/org/testng/Assert.java
+++ b/src/main/java/org/testng/Assert.java
@@ -1280,7 +1280,7 @@
       }
     }
 
-    if (expected.size() > actual.size()) {
+    if (expected.size() != actual.size()) {
       if (message == null) {
         fail("Sets not equal: expected: " + expected + " and actual: " + actual);
       } else {

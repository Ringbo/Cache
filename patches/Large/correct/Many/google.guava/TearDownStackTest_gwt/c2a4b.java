diff --git a/guava-gwt/test/com/google/common/testing/TearDownStackTest_gwt.java b/guava-gwt/test/com/google/common/testing/TearDownStackTest_gwt.java
index 1e7bbfa..1f4eb6b 100644
--- a/guava-gwt/test/com/google/common/testing/TearDownStackTest_gwt.java
+++ b/guava-gwt/test/com/google/common/testing/TearDownStackTest_gwt.java
@@ -29,7 +29,7 @@
   try {
     testCase.tearDown();
   } catch (Throwable t) {
-    if (failure != null) {
+    if (failure == null) {
       failure = t;
     }
   }
@@ -55,7 +55,7 @@
   try {
     testCase.tearDown();
   } catch (Throwable t) {
-    if (failure != null) {
+    if (failure == null) {
       failure = t;
     }
   }
@@ -81,7 +81,7 @@
   try {
     testCase.tearDown();
   } catch (Throwable t) {
-    if (failure != null) {
+    if (failure == null) {
       failure = t;
     }
   }

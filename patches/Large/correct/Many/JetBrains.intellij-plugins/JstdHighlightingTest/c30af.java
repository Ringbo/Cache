diff --git a/JsTestDriver/test/testSrc/com/google/jstestdriver/idea/assertFramework/jstd/JstdHighlightingTest.java b/JsTestDriver/test/testSrc/com/google/jstestdriver/idea/assertFramework/jstd/JstdHighlightingTest.java
index 7390b60..8076cd5 100644
--- a/JsTestDriver/test/testSrc/com/google/jstestdriver/idea/assertFramework/jstd/JstdHighlightingTest.java
+++ b/JsTestDriver/test/testSrc/com/google/jstestdriver/idea/assertFramework/jstd/JstdHighlightingTest.java
@@ -23,7 +23,7 @@
   }
 
   private void defaultTest() throws IOException {
-    doTestFor(true, getTestName(false)+".js");
+    doTestFor(true, getTestName(true)+".js");
   }
 
   @Override

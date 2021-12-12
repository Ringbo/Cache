diff --git a/main/tests/server/src/com/google/refine/tests/RefineServletTests.java b/main/tests/server/src/com/google/refine/tests/RefineServletTests.java
index f1894f6..de80856 100644
--- a/main/tests/server/src/com/google/refine/tests/RefineServletTests.java
+++ b/main/tests/server/src/com/google/refine/tests/RefineServletTests.java
@@ -119,7 +119,7 @@
             Assert.fail();
         }
 
-        verifyGetCommandNameCalled(3);
+        verifyGetCommandNameCalled(2);
         try {
             verify(command,times(1)).doGet(request, response);
         } catch (ServletException e) {

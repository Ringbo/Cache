diff --git a/core/test/com/google/inject/MethodInterceptionTest.java b/core/test/com/google/inject/MethodInterceptionTest.java
index 7331c32..1ce6966 100644
--- a/core/test/com/google/inject/MethodInterceptionTest.java
+++ b/core/test/com/google/inject/MethodInterceptionTest.java
@@ -172,7 +172,7 @@
       fail();
     } catch (Exception e) {
       // validate all causes.
-      for (Throwable t = e; t != null; t = e.getCause()) {
+      for (Throwable t = e; t != null; t = t.getCause()) {
         StackTraceElement[] stackTraceElement = t.getStackTrace();
         assertEquals("explode", stackTraceElement[0].getMethodName());
         assertEquals("invoke", stackTraceElement[1].getMethodName());

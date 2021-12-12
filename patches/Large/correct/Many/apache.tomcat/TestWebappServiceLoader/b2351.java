diff --git a/test/org/apache/catalina/startup/TestWebappServiceLoader.java b/test/org/apache/catalina/startup/TestWebappServiceLoader.java
index fed4964..5e083f6 100644
--- a/test/org/apache/catalina/startup/TestWebappServiceLoader.java
+++ b/test/org/apache/catalina/startup/TestWebappServiceLoader.java
@@ -172,7 +172,7 @@
         try {
             loader.loadServices(ServletContainerInitializer.class, names);
         } catch (IOException e) {
-            Assert.assertTrue(e.getCause() instanceof InstantiationException);
+            Assert.assertTrue(e.getCause() instanceof ReflectiveOperationException);
         } finally {
             control.verify();
         }

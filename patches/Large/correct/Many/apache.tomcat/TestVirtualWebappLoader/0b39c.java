diff --git a/test/org/apache/catalina/loader/TestVirtualWebappLoader.java b/test/org/apache/catalina/loader/TestVirtualWebappLoader.java
index 9a19f67..625399d 100644
--- a/test/org/apache/catalina/loader/TestVirtualWebappLoader.java
+++ b/test/org/apache/catalina/loader/TestVirtualWebappLoader.java
@@ -63,7 +63,7 @@
 
         loader.start();
         String[] repos = loader.getLoaderRepositories();
-        assertEquals(3,repos.length);
+        assertEquals(4,repos.length);
         loader.stop();
 
         repos = loader.getLoaderRepositories();
@@ -72,7 +72,7 @@
         // no leak
         loader.start();
         repos = loader.getLoaderRepositories();
-        assertEquals(3,repos.length);
+        assertEquals(4,repos.length);
 
         // clear loader
         ctx.setLoader(null);

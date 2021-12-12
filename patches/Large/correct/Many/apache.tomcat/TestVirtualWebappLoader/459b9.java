diff --git a/test/org/apache/catalina/loader/TestVirtualWebappLoader.java b/test/org/apache/catalina/loader/TestVirtualWebappLoader.java
index d2aa3e2..62b573c 100644
--- a/test/org/apache/catalina/loader/TestVirtualWebappLoader.java
+++ b/test/org/apache/catalina/loader/TestVirtualWebappLoader.java
@@ -46,16 +46,16 @@
         ctx.resourcesStart();
         File dir = new File("test/webapp-3.0-fragments/WEB-INF/lib");
         loader.setVirtualClasspath(dir.getAbsolutePath() + "/*.jar");
-        loader.startInternal();
+        loader.start();
         String[] repos = loader.getRepositories();
         assertEquals(2,repos.length);
-        loader.stopInternal();
+        loader.stop();
         // ToDo: Why doesn't remove repositories?
         repos = loader.getRepositories();
         assertEquals(2, repos.length);
         
         // no leak
-        loader.startInternal();
+        loader.start();
         repos = loader.getRepositories();
         assertEquals(2,repos.length);
         

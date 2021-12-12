diff --git a/jetty-deploy/src/test/java/org/eclipse/jetty/deploy/test/XmlConfiguredJetty.java b/jetty-deploy/src/test/java/org/eclipse/jetty/deploy/test/XmlConfiguredJetty.java
index 6ff0727..89e03dd 100644
--- a/jetty-deploy/src/test/java/org/eclipse/jetty/deploy/test/XmlConfiguredJetty.java
+++ b/jetty-deploy/src/test/java/org/eclipse/jetty/deploy/test/XmlConfiguredJetty.java
@@ -120,7 +120,7 @@
         System.setProperty("jetty.home",jettyHome.getAbsolutePath());
         properties.setProperty("test.basedir",MavenTestingUtils.getBasedir().getAbsolutePath());
         properties.setProperty("test.resourcesdir",MavenTestingUtils.getTestResourcesDir().getAbsolutePath());
-        properties.setProperty("test.webapps",workishDir.getAbsolutePath());
+        properties.setProperty("test.webapps",webappsDir.getAbsolutePath());
         properties.setProperty("test.targetdir",MavenTestingUtils.getTargetDir().getAbsolutePath());
         properties.setProperty("test.workdir",workishDir.getAbsolutePath());
 

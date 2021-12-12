diff --git a/jetty-spdy/spdy-npn-tests/src/test/java/org/eclipse/jetty/spdy/server/NPNModuleTest.java b/jetty-spdy/spdy-npn-tests/src/test/java/org/eclipse/jetty/spdy/server/NPNModuleTest.java
index 0c53e42..8ccfcb3 100644
--- a/jetty-spdy/spdy-npn-tests/src/test/java/org/eclipse/jetty/spdy/server/NPNModuleTest.java
+++ b/jetty-spdy/spdy-npn-tests/src/test/java/org/eclipse/jetty/spdy/server/NPNModuleTest.java
@@ -67,7 +67,7 @@
     @Parameters(name = "{index}: mod:{0}")
     public static List<Object[]> data()
     {
-        File npnBootModDir = MavenTestingUtils.getProjectDir("../spdy-http-server/src/main/config/modules/protonego");
+        File npnBootModDir = MavenTestingUtils.getProjectDir("../spdy-http-server/src/main/config/modules/protonego-impl");
         List<Object[]> data = new ArrayList<>();
         for (File file : npnBootModDir.listFiles())
         {
@@ -99,7 +99,7 @@
     @Test
     public void testModuleValues() throws IOException
     {
-        File modFile = basehome.getFile("modules/protonego/" + modBootFile);
+        File modFile = basehome.getFile("modules/protonego-impl/" + modBootFile);
         Module mod = new Module(basehome,modFile);
         assertNotNull("module",mod);
         
@@ -118,7 +118,7 @@
             }
         }
 
-        for (String line : mod.getInitialise())
+        for (String line : mod.getJvmArgs())
         {
             expectedBootClasspath.remove(line);
         }
@@ -126,10 +126,10 @@
         if (expectedBootClasspath.size() > 0)
         {
             StringBuilder err = new StringBuilder();
-            err.append("XBootClasspath mismatch between [files] and [ini-template]");
+            err.append("XBootClasspath mismatch between [files] and [exec]");
             err.append("\nThe following are inferred from your [files] definition in ");
             err.append(modFile.getAbsolutePath());
-            err.append("\nbut are not referenced in your [ini-template] section");
+            err.append("\nbut are not referenced in your [exec] section");
             for (String entry : expectedBootClasspath)
             {
                 err.append("\n").append(entry);

diff --git a/maven-plugins/maven-war-plugin/src/main/java/org/apache/maven/plugin/war/WarExplodedMojo.java b/maven-plugins/maven-war-plugin/src/main/java/org/apache/maven/plugin/war/WarExplodedMojo.java
index 0db7625..3b346d1 100644
--- a/maven-plugins/maven-war-plugin/src/main/java/org/apache/maven/plugin/war/WarExplodedMojo.java
+++ b/maven-plugins/maven-war-plugin/src/main/java/org/apache/maven/plugin/war/WarExplodedMojo.java
@@ -30,7 +30,7 @@
 {
     public void execute() throws MojoExecutionException
     {
-        buildExplodedWebapp( getWebappDirectory(), getWebappDirectory() );
+        buildExplodedWebapp( getWebappDirectory() );
     }
 
 }
\ No newline at end of file

diff --git a/maven-plugins/maven-eclipse-plugin/src/main/java/org/apache/maven/plugin/eclipse/EclipsePlugin.java b/maven-plugins/maven-eclipse-plugin/src/main/java/org/apache/maven/plugin/eclipse/EclipsePlugin.java
index 574e2b8..c504e26 100644
--- a/maven-plugins/maven-eclipse-plugin/src/main/java/org/apache/maven/plugin/eclipse/EclipsePlugin.java
+++ b/maven-plugins/maven-eclipse-plugin/src/main/java/org/apache/maven/plugin/eclipse/EclipsePlugin.java
@@ -350,9 +350,9 @@
         new EclipseProjectWriter( getLog() ).write( projectBaseDir, outputDir, project, executedProject,
                                                     reactorArtifacts, projectnatures, buildcommands );
 
-        new EclipseSettingsWriter( getLog() ).write( projectBaseDir, outputDir, executedProject );
+        new EclipseSettingsWriter( getLog() ).write( projectBaseDir, outputDir, project );
 
-        new EclipseWtpmodulesWriter( getLog() ).write( outputDir, executedProject, reactorArtifacts, sourceDirs,
+        new EclipseWtpmodulesWriter( getLog() ).write( outputDir, project, reactorArtifacts, sourceDirs,
                                                        localRepository );
 
         getLog().info( Messages.getString( "EclipsePlugin.wrote", //$NON-NLS-1$

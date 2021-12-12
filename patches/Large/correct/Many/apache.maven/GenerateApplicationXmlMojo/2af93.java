diff --git a/sandbox/maven-ear-plugin/src/main/java/org/apache/maven/plugin/ear/GenerateApplicationXmlMojo.java b/sandbox/maven-ear-plugin/src/main/java/org/apache/maven/plugin/ear/GenerateApplicationXmlMojo.java
index 5c2857c..a9c7a5d 100644
--- a/sandbox/maven-ear-plugin/src/main/java/org/apache/maven/plugin/ear/GenerateApplicationXmlMojo.java
+++ b/sandbox/maven-ear-plugin/src/main/java/org/apache/maven/plugin/ear/GenerateApplicationXmlMojo.java
@@ -90,7 +90,7 @@
         getLog().debug( "encoding[" + encoding + "]" );
         getLog().debug( "generatedDescriptorLocation[" + generatedDescriptorLocation + "]" );
 
-        if ( !version.equals( VERSION_1_3 ) && version.equals( VERSION_1_4 ) )
+        if ( !version.equals( VERSION_1_3 ) && !version.equals( VERSION_1_4 ) )
         {
             throw new MojoExecutionException( "Invalid version[" + version + "]" );
         }

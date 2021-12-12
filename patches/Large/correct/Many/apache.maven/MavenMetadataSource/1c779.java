diff --git a/maven-project/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java b/maven-project/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java
index c47ea86..bc18731 100644
--- a/maven-project/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java
+++ b/maven-project/src/main/java/org/apache/maven/project/artifact/MavenMetadataSource.java
@@ -372,7 +372,7 @@
         }
         else
         {
-            getLogger().warn( "\n\tDEPRECATION: The POM for the artifact '" + artifact.getDependencyConflictId() +
+            getLogger().debug( "\n\tDEPRECATION: The POM for the artifact '" + artifact.getDependencyConflictId() +
                 "' was invalid or not found on any repositories.\n" +
                 "\tThis may not be supported by future versions of Maven and should be corrected as soon as possible.\n" +
                 "\tError given: " + e.getMessage() + "\n" );

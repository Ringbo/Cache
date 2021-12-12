diff --git a/maven-project/src/main/java/org/apache/maven/profiles/DefaultMavenProfilesBuilder.java b/maven-project/src/main/java/org/apache/maven/profiles/DefaultMavenProfilesBuilder.java
index 103042d..559119f 100644
--- a/maven-project/src/main/java/org/apache/maven/profiles/DefaultMavenProfilesBuilder.java
+++ b/maven-project/src/main/java/org/apache/maven/profiles/DefaultMavenProfilesBuilder.java
@@ -50,7 +50,7 @@
 
         ProfilesRoot profilesRoot = null;
 
-        if ( profilesXml.exists() )
+        if ( profilesXml.isFile() )
         {
             getLogger().debug( "reading: " + profilesXml.getAbsolutePath() );
 

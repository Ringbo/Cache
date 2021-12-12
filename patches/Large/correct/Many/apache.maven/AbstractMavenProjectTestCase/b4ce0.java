diff --git a/maven-project/src/test/java/org/apache/maven/project/AbstractMavenProjectTestCase.java b/maven-project/src/test/java/org/apache/maven/project/AbstractMavenProjectTestCase.java
index 7eba704..06e0918 100644
--- a/maven-project/src/test/java/org/apache/maven/project/AbstractMavenProjectTestCase.java
+++ b/maven-project/src/test/java/org/apache/maven/project/AbstractMavenProjectTestCase.java
@@ -80,7 +80,7 @@
             throw new FileNotFoundException( "Unable to find: " + resource );
         }
 
-        return new File( new URI( resourceUrl.getPath() ) );
+        return new File( new URI( resourceUrl.toString() ) );
     }
 
     protected ArtifactRepository getLocalRepository()

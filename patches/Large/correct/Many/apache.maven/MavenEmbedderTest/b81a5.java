diff --git a/maven-embedder/src/test/java/org/apache/maven/embedder/MavenEmbedderTest.java b/maven-embedder/src/test/java/org/apache/maven/embedder/MavenEmbedderTest.java
index caf08ec..0792cd8 100644
--- a/maven-embedder/src/test/java/org/apache/maven/embedder/MavenEmbedderTest.java
+++ b/maven-embedder/src/test/java/org/apache/maven/embedder/MavenEmbedderTest.java
@@ -383,7 +383,7 @@
 
         Set artifacts = result.getProject().getArtifacts();
 
-        assertEquals( 2, artifacts.size() );
+        assertEquals( 1, artifacts.size() );
 
         artifacts.iterator().next();
     }

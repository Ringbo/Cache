diff --git a/maven-artifact/src/test/java/org/apache/maven/artifact/resolver/DefaultArtifactCollectorTest.java b/maven-artifact/src/test/java/org/apache/maven/artifact/resolver/DefaultArtifactCollectorTest.java
index 1d9c05d..86e17ab 100644
--- a/maven-artifact/src/test/java/org/apache/maven/artifact/resolver/DefaultArtifactCollectorTest.java
+++ b/maven-artifact/src/test/java/org/apache/maven/artifact/resolver/DefaultArtifactCollectorTest.java
@@ -671,9 +671,9 @@
     public void testSnapshotNotIncluded()
         throws ArtifactResolutionException, InvalidVersionSpecificationException
     {
-        ArtifactSpec a = createArtifact( "a", "1.0" );
+        ArtifactSpec a = createArtifactSpec( "a", "1.0" );
         a.addDependency( "b", "[1.0,)" );
-        createArtifact( "b", "1.0-SNAPSHOT" );
+        createArtifactSpec( "b", "1.0-SNAPSHOT" );
 
         try
         {

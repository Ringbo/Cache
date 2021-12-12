diff --git a/maven-compat/src/test/java/org/apache/maven/repository/legacy/DefaultWagonManagerTest.java b/maven-compat/src/test/java/org/apache/maven/repository/legacy/DefaultWagonManagerTest.java
index b9bcf9b..aa5dd68 100644
--- a/maven-compat/src/test/java/org/apache/maven/repository/legacy/DefaultWagonManagerTest.java
+++ b/maven-compat/src/test/java/org/apache/maven/repository/legacy/DefaultWagonManagerTest.java
@@ -138,7 +138,7 @@
 
         try
         {
-            wagonManager.getArtifact( artifact, repo, null, false );
+            wagonManager.getArtifact( artifact, repo, null, true );
 
             fail();
         }

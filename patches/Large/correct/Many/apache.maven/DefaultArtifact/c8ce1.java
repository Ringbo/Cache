diff --git a/maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java b/maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java
index 26f0fef..4d9566a 100644
--- a/maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java
+++ b/maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java
@@ -434,7 +434,7 @@
         }
         else
         {
-            return getVersion().endsWith( SNAPSHOT_VERSION ) || getVersion().equals( LATEST_VERSION );
+            return getBaseVersion().endsWith( SNAPSHOT_VERSION ) || getBaseVersion().equals( LATEST_VERSION );
         }
     }
 

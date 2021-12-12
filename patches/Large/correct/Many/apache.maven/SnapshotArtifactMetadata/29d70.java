diff --git a/maven-artifact/src/main/java/org/apache/maven/artifact/metadata/SnapshotArtifactMetadata.java b/maven-artifact/src/main/java/org/apache/maven/artifact/metadata/SnapshotArtifactMetadata.java
index 97a1750..92b8e98 100644
--- a/maven-artifact/src/main/java/org/apache/maven/artifact/metadata/SnapshotArtifactMetadata.java
+++ b/maven-artifact/src/main/java/org/apache/maven/artifact/metadata/SnapshotArtifactMetadata.java
@@ -245,6 +245,6 @@
             String fileTimestamp = getUtcDateFormatter().format( new Date( fileTime ) );
             return ( fileTimestamp.compareTo( timestamp ) < 0 );
         }
-        return true;
+        return false;
     }
 }

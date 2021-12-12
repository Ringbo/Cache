diff --git a/maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java b/maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java
index bd99570..dd7fd8f 100644
--- a/maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java
+++ b/maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java
@@ -172,7 +172,7 @@
         copy.setRepositoryCache( original.getRepositoryCache() );
         copy.setNoSnapshotUpdates( original.isNoSnapshotUpdates() );
         copy.setExecutionListener( original.getExecutionListener() );
-        return original;
+        return copy;
     }
 
     public String getBaseDirectory()

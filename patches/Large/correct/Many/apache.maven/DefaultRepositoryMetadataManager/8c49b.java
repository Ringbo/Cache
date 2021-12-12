diff --git a/maven-artifact-manager/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java b/maven-artifact-manager/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java
index d0ef113..46b15be 100644
--- a/maven-artifact-manager/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java
+++ b/maven-artifact-manager/src/main/java/org/apache/maven/artifact/repository/metadata/DefaultRepositoryMetadataManager.java
@@ -271,7 +271,7 @@
     {
         if ( !wagonManager.isOnline() )
         {
-            if ( !allowBlacklisting )
+            if ( allowBlacklisting )
             {
                 getLogger().debug(
                     "System is offline. Cannot resolve metadata:\n" + metadata.extendedToString() + "\n\n" );

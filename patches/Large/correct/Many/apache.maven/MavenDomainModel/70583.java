diff --git a/maven-mercury/src/main/java/org/apache/maven/mercury/MavenDomainModel.java b/maven-mercury/src/main/java/org/apache/maven/mercury/MavenDomainModel.java
index f52b5e8..9592707 100644
--- a/maven-mercury/src/main/java/org/apache/maven/mercury/MavenDomainModel.java
+++ b/maven-mercury/src/main/java/org/apache/maven/mercury/MavenDomainModel.java
@@ -145,15 +145,15 @@
         {
             if ( mp.getUri().equals( ProjectUri.Parent.version ) )
             {
-                version = mp.getValue();
+                version = mp.getResolvedValue();
             }
             else if ( mp.getUri().equals( ProjectUri.Parent.artifactId ) )
             {
-                artifactId = mp.getValue();
+                artifactId = mp.getResolvedValue();
             }
             else if ( mp.getUri().equals( ProjectUri.Parent.groupId ) )
             {
-                groupId = mp.getValue();
+                groupId = mp.getResolvedValue();
             }
             if ( groupId != null && artifactId != null && version != null )
             {
@@ -218,31 +218,31 @@
         {
             if ( mp.getUri().equals( ProjectUri.Dependencies.Dependency.groupId ) )
             {
-                metadata.setGroupId( mp.getValue() );
+                metadata.setGroupId( mp.getResolvedValue() );
             }
             else if ( mp.getUri().equals( ProjectUri.Dependencies.Dependency.artifactId ) )
             {
-                metadata.setArtifactId( mp.getValue() );
+                metadata.setArtifactId( mp.getResolvedValue() );
             }
             else if ( mp.getUri().equals( ProjectUri.Dependencies.Dependency.version ) )
             {
-                metadata.setVersion( mp.getValue() );
+                metadata.setVersion( mp.getResolvedValue() );
             }
             else if ( mp.getUri().equals( ProjectUri.Dependencies.Dependency.classifier ) )
             {
-                metadata.setClassifier( mp.getValue() );
+                metadata.setClassifier( mp.getResolvedValue() );
             }
             else if ( mp.getUri().equals( ProjectUri.Dependencies.Dependency.scope ) )
             {
-                metadata.setScope( mp.getValue() );
+                metadata.setScope( mp.getResolvedValue() );
             }
             else if ( mp.getUri().equals( ProjectUri.Dependencies.Dependency.type ) )
             {
-                metadata.setType( mp.getValue() );
+                metadata.setType( mp.getResolvedValue() );
             }
             else if ( mp.getUri().equals( ProjectUri.Dependencies.Dependency.optional ) )
             {
-                metadata.setOptional( mp.getValue() );
+                metadata.setOptional( mp.getResolvedValue() );
             }
         }
 
@@ -265,11 +265,11 @@
             {
                 if ( mp.getUri().equals( ProjectUri.Dependencies.Dependency.Exclusions.Exclusion.artifactId ) )
                 {
-                    meta.setArtifactId( mp.getValue() );
+                    meta.setArtifactId( mp.getResolvedValue() );
                 }
                 else if ( mp.getUri().equals( ProjectUri.Dependencies.Dependency.Exclusions.Exclusion.groupId ) )
                 {
-                    meta.setGroupId( mp.getValue() );
+                    meta.setGroupId( mp.getResolvedValue() );
                 }
             }
 

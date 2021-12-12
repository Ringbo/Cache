diff --git a/kie-ci/src/main/java/org/kie/scanner/embedder/MavenEmbedderUtils.java b/kie-ci/src/main/java/org/kie/scanner/embedder/MavenEmbedderUtils.java
index 0821aff..d27ede6 100644
--- a/kie-ci/src/main/java/org/kie/scanner/embedder/MavenEmbedderUtils.java
+++ b/kie-ci/src/main/java/org/kie/scanner/embedder/MavenEmbedderUtils.java
@@ -49,10 +49,10 @@
 
     public static ComponentProvider buildComponentProvider(ClassLoader mavenClassLoader, ClassLoader parent, MavenRequest mavenRequest) throws MavenEmbedderException {
         if (enforceWiredComponentProvider || MavenEmbedderUtils.class.getClassLoader().getClass().toString().contains( "Bundle" )) {
-            log.info( "In OSGi: using programmatically wired maven parser" );
+            log.debug( "In OSGi: using programmatically wired maven parser" );
             return new WiredComponentProvider();
         }
-        log.info( "Not in OSGi: using plexus based maven parser" );
+        log.debug( "Not in OSGi: using plexus based maven parser" );
         return new PlexusComponentProvider( mavenClassLoader, parent, mavenRequest );
     }
 

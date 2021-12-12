diff --git a/maven-core/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java b/maven-core/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java
index adc3ec9..0c1b8f4 100644
--- a/maven-core/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java
+++ b/maven-core/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java
@@ -226,7 +226,7 @@
         Model cachedModel = (Model) modelCache.get( key );
         if ( cachedModel == null )
         {
-            modelCache.put( cacheKey, model );
+            modelCache.put( key, model );
         }
 
         model = modelInterpolator.interpolate( model );

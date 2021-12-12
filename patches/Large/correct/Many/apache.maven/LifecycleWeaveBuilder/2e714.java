diff --git a/maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleWeaveBuilder.java b/maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleWeaveBuilder.java
index 477d66c..3ab189f 100644
--- a/maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleWeaveBuilder.java
+++ b/maven-core/src/main/java/org/apache/maven/lifecycle/internal/LifecycleWeaveBuilder.java
@@ -101,11 +101,11 @@
     }
 
     public void build( ProjectBuildList projectBuilds, ReactorContext buildContext, List<TaskSegment> taskSegments,
-                       MavenSession session, ExecutorService executoru, ReactorBuildStatus reactorBuildStatus )
+                       MavenSession session, ExecutorService executor, ReactorBuildStatus reactorBuildStatus )
         throws ExecutionException, InterruptedException
     {
         ConcurrentBuildLogger concurrentBuildLogger = new ConcurrentBuildLogger();
-        CompletionService<ProjectSegment> service = new ExecutorCompletionService<ProjectSegment>( executoru );
+        CompletionService<ProjectSegment> service = new ExecutorCompletionService<ProjectSegment>( executor );
 
         try
         {
@@ -136,7 +136,7 @@
                 }
                 for ( ProjectSegment projectBuild : segmentChunks )
                 {
-                    plans.put( projectBuild, executoru.submit( createEPFuture( projectBuild, projectArtifacts ) ) );
+                    plans.put( projectBuild, executor.submit( createEPFuture( projectBuild, projectArtifacts ) ) );
                 }
 
                 for ( ProjectSegment projectSegment : plans.keySet() )

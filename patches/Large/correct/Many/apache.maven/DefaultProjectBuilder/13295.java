diff --git a/maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java b/maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java
index 2dfc336..1260595 100644
--- a/maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java
+++ b/maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java
@@ -140,8 +140,6 @@
 
             project.setOriginalModel( result.getRawModel() );
 
-//            project.setRemoteArtifactRepositories( configuration.getRemoteRepositories() );
-//            project.setPluginArtifactRepositories( configuration.getPluginArtifactRepositories() );
             project.setRemoteArtifactRepositories( listener.getRemoteRepositories() );
             project.setPluginArtifactRepositories( listener.getPluginRepositories() );
 
@@ -153,7 +151,7 @@
                 {
                     lifecycle.populateDefaultConfigurationForPlugins( model.getBuild().getPlugins(),
                                                                       configuration.getLocalRepository(),
-                                                                      configuration.getPluginArtifactRepositories() );
+                                                                      project.getPluginArtifactRepositories() );
                 }
             }
             catch ( LifecycleExecutionException e )

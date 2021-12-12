diff --git a/maven-plugins/maven-project-info-reports-plugin/src/main/java/org/apache/maven/report/projectinfo/DependenciesReport.java b/maven-plugins/maven-project-info-reports-plugin/src/main/java/org/apache/maven/report/projectinfo/DependenciesReport.java
index ab5ff4a..108fe7e 100644
--- a/maven-plugins/maven-project-info-reports-plugin/src/main/java/org/apache/maven/report/projectinfo/DependenciesReport.java
+++ b/maven-plugins/maven-project-info-reports-plugin/src/main/java/org/apache/maven/report/projectinfo/DependenciesReport.java
@@ -276,10 +276,11 @@
                     }
                     catch ( ProjectBuildingException e )
                     {
+                        // TODO: better exception handling needed - log PBE
                         throw new IllegalArgumentException( "Can't find a valid Maven project in the repository for the artifact ["
                                                                 + artifact.getGroupId() + ":"
                                                                 + artifact.getArtifactId() + ":"
-                                                                + artifact.getVersion() + "].", e );
+                                                                + artifact.getVersion() + "]." );
                     }
                     tableRow( new String[]{artifact.getGroupId(), artifact.getArtifactId(), artifact.getVersion(),
                         artifactProject.getDescription(),

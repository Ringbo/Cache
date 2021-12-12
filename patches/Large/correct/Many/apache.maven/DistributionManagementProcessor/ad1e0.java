diff --git a/maven-model-builder/src/main/java/org/apache/maven/model/processors/DistributionManagementProcessor.java b/maven-model-builder/src/main/java/org/apache/maven/model/processors/DistributionManagementProcessor.java
index 3c9727c..5131cee 100644
--- a/maven-model-builder/src/main/java/org/apache/maven/model/processors/DistributionManagementProcessor.java
+++ b/maven-model-builder/src/main/java/org/apache/maven/model/processors/DistributionManagementProcessor.java
@@ -50,7 +50,7 @@
                 copy( p.getDistributionManagement(), t.getDistributionManagement(), false, c.getArtifactId(), p );
             }        	
             copy( c.getDistributionManagement(), t.getDistributionManagement(), isChildMostSpecialized,
-                  c.getArtifactId(), p );
+                  c.getArtifactId(), c );
         }
         else if ( p != null && p.getDistributionManagement() != null )
         {

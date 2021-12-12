diff --git a/subprojects/build-comparison/src/main/groovy/org/gradle/api/plugins/buildcomparison/gradle/CompareGradleBuilds.java b/subprojects/build-comparison/src/main/groovy/org/gradle/api/plugins/buildcomparison/gradle/CompareGradleBuilds.java
index c526f45..ecd7be7 100644
--- a/subprojects/build-comparison/src/main/groovy/org/gradle/api/plugins/buildcomparison/gradle/CompareGradleBuilds.java
+++ b/subprojects/build-comparison/src/main/groovy/org/gradle/api/plugins/buildcomparison/gradle/CompareGradleBuilds.java
@@ -145,8 +145,8 @@
 
         if (!sourceBuildHasOutcomesModel && !targetBuildHasOutcomesModel) {
             throw new GradleException(String.format(
-                    "Cannot run comparison because both the source and target build are to be executed with a Gradle version older than %s.",
-                    PROJECT_OUTCOMES_MINIMUM_VERSION
+                    "Cannot run comparison because both the source and target build are to be executed with a Gradle version older than %s (source: %s, target: %s).",
+                    PROJECT_OUTCOMES_MINIMUM_VERSION, sourceBuild.getGradleVersion(), targetBuild.getGradleVersion()
             ));
         }
 
@@ -291,7 +291,7 @@
             return true;
         } else {
             // Special handling for snapshots/RCs of the minimum version
-            return versionObject.getVersion().equals(PROJECT_OUTCOMES_MINIMUM_VERSION.getVersion());
+            return versionObject.getVersionBase().equals(PROJECT_OUTCOMES_MINIMUM_VERSION.getVersionBase());
         }
     }
 }

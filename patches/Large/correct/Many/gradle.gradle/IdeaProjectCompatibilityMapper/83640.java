diff --git a/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/converters/IdeaProjectCompatibilityMapper.java b/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/converters/IdeaProjectCompatibilityMapper.java
index 489e6cb..50cd2eb 100644
--- a/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/converters/IdeaProjectCompatibilityMapper.java
+++ b/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/converters/IdeaProjectCompatibilityMapper.java
@@ -26,10 +26,10 @@
 
 public class IdeaProjectCompatibilityMapper implements Action<SourceObjectMapping>, Serializable {
 
-    private final VersionDetails versionDetails;
+    private final String version;
 
     public IdeaProjectCompatibilityMapper(VersionDetails versionDetails) {
-        this.versionDetails = versionDetails;
+        version = versionDetails.getVersion();
     }
 
     @Override
@@ -41,7 +41,7 @@
     }
 
     private boolean versionSupportsIdeaJavaSourceSettings() {
-        GradleVersion targetGradleVersion = GradleVersion.version(versionDetails.getVersion());
+        GradleVersion targetGradleVersion = GradleVersion.version(version);
         // return 'true' for 2.11 snapshots too
         return targetGradleVersion.getBaseVersion().compareTo(GradleVersion.version("2.11")) >= 0;
     }

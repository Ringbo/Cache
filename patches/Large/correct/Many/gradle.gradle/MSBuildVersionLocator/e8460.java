diff --git a/subprojects/platform-native/src/testFixtures/groovy/org/gradle/nativeplatform/fixtures/msvcpp/MSBuildVersionLocator.java b/subprojects/platform-native/src/testFixtures/groovy/org/gradle/nativeplatform/fixtures/msvcpp/MSBuildVersionLocator.java
index 3745fd3..a8fb6b6 100644
--- a/subprojects/platform-native/src/testFixtures/groovy/org/gradle/nativeplatform/fixtures/msvcpp/MSBuildVersionLocator.java
+++ b/subprojects/platform-native/src/testFixtures/groovy/org/gradle/nativeplatform/fixtures/msvcpp/MSBuildVersionLocator.java
@@ -38,7 +38,7 @@
 
         // TODO: Remove the hardcoded version, see https://github.com/Microsoft/vswhere/issues/74
         TestFile msbuild = installDir.file("MSBuild/15.0/Bin/MSBuild.exe");
-        if (msbuild.exists()) {
+        if (!msbuild.exists()) {
             throw new IllegalStateException("This test requires msbuild to be installed");
         }
         return msbuild;

diff --git a/subprojects/platform-native/src/testFixtures/groovy/org/gradle/nativeplatform/fixtures/AvailableToolChains.java b/subprojects/platform-native/src/testFixtures/groovy/org/gradle/nativeplatform/fixtures/AvailableToolChains.java
index d0d40fe..dcaeb11 100755
--- a/subprojects/platform-native/src/testFixtures/groovy/org/gradle/nativeplatform/fixtures/AvailableToolChains.java
+++ b/subprojects/platform-native/src/testFixtures/groovy/org/gradle/nativeplatform/fixtures/AvailableToolChains.java
@@ -148,7 +148,7 @@
         List<File> gppCandidates = OperatingSystem.current().findAllInPath("g++");
         for (int i = 0; i < gppCandidates.size(); i++) {
             File candidate = gppCandidates.get(i);
-            GccVersionResult version = versionDeterminer.getGccMetaData(candidate);
+            GccVersionResult version = versionDeterminer.getGccMetaData(candidate, Collections.<String>emptyList());
             if (version.isAvailable()) {
                 InstalledGcc gcc = new InstalledGcc("gcc");
                 if (i > 0) {

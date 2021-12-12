diff --git a/subprojects/sonar-update-center/sonar-update-center-common/src/main/java/org/sonar/updatecenter/common/UpdateCenterSerializer.java b/subprojects/sonar-update-center/sonar-update-center-common/src/main/java/org/sonar/updatecenter/common/UpdateCenterSerializer.java
index 04de817..15793c4 100644
--- a/subprojects/sonar-update-center/sonar-update-center-common/src/main/java/org/sonar/updatecenter/common/UpdateCenterSerializer.java
+++ b/subprojects/sonar-update-center/sonar-update-center-common/src/main/java/org/sonar/updatecenter/common/UpdateCenterSerializer.java
@@ -59,7 +59,7 @@
 
   public static Properties toProperties(UpdateCenter center) {
     Properties p = new Properties();
-    set(p, "date", FormatUtils.toString(center.getDate(), false));
+    set(p, "date", FormatUtils.toString(center.getDate(), true));
     set(p, "sonar.versions", center.getSonar().getVersions());
     for (Release sonarRelease : center.getSonar().getReleases()) {
       set(p, "sonar." + sonarRelease.getVersion() + ".downloadUrl", sonarRelease.getDownloadUrl());

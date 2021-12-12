diff --git a/sonar-batch/src/main/java/org/sonar/batch/qualitygate/QualityGateLoader.java b/sonar-batch/src/main/java/org/sonar/batch/qualitygate/QualityGateLoader.java
index f43e939..14cfd27 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/qualitygate/QualityGateLoader.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/qualitygate/QualityGateLoader.java
@@ -32,10 +32,10 @@
 public class QualityGateLoader implements Sensor {
 
   private final FileSystem fs;
-  private final RulesProfileWrapper qProfile;
+  private final RulesProfile qProfile;
   private final ProjectAlerts projectAlerts;
 
-  public QualityGateLoader(FileSystem fs, RulesProfileWrapper qProfile, ProjectAlerts projectAlerts) {
+  public QualityGateLoader(FileSystem fs, RulesProfile qProfile, ProjectAlerts projectAlerts) {
     this.fs = fs;
     this.qProfile = qProfile;
     this.projectAlerts = projectAlerts;
@@ -49,7 +49,7 @@
   @Override
   public void analyse(Project module, SensorContext context) {
     for (String lang : fs.languages()) {
-      RulesProfile profile = qProfile.getProfileByLanguage(lang);
+      RulesProfile profile = qProfile instanceof RulesProfileWrapper ? ((RulesProfileWrapper) qProfile).getProfileByLanguage(lang) : qProfile;
       if (profile != null) {
         projectAlerts.addAll(profile.getAlerts());
       }

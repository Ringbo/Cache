diff --git a/tests/src/test/java/org/sonarqube/tests/upgrade/UpgradeTest.java b/tests/src/test/java/org/sonarqube/tests/upgrade/UpgradeTest.java
index 76f2e28..607ef2d 100644
--- a/tests/src/test/java/org/sonarqube/tests/upgrade/UpgradeTest.java
+++ b/tests/src/test/java/org/sonarqube/tests/upgrade/UpgradeTest.java
@@ -185,7 +185,9 @@
 
   private void scanProject() {
     MavenBuild build = MavenBuild.create(new File("projects/struts-1.3.9-diet/pom.xml"))
-      .setCleanPackageSonarGoals()
+      // force version of Maven scanner because recent releases do not support SonarQube versions
+      // lower than 5.6.
+      .setGoals("clean package", "org.sonarsource.scanner.maven:sonar-maven-plugin:3.3.0.603:sonar")
       // exclude pom.xml, otherwise it will be published in SQ 6.3+ and not in previous versions, resulting in a different number of
       // components
       .setProperty("sonar.exclusions", "**/pom.xml")

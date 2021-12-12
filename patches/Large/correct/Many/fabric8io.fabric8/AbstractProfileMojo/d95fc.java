diff --git a/fabric/fabric8-maven-plugin/src/main/java/io/fabric8/maven/AbstractProfileMojo.java b/fabric/fabric8-maven-plugin/src/main/java/io/fabric8/maven/AbstractProfileMojo.java
index 987a11a..1c8de7b 100644
--- a/fabric/fabric8-maven-plugin/src/main/java/io/fabric8/maven/AbstractProfileMojo.java
+++ b/fabric/fabric8-maven-plugin/src/main/java/io/fabric8/maven/AbstractProfileMojo.java
@@ -438,7 +438,8 @@
     protected void addProjectArtifactBundle(ProjectRequirements requirements) {
         DependencyDTO rootDependency = requirements.getRootDependency();
         if (rootDependency != null) {
-            String url = rootDependency.toBundleUrl();
+            // we need url with type, so when we deploy war files the mvn url is correct
+            String url = rootDependency.toBundleUrlWithType();
             if (!requirements.getBundles().contains(url)) {
                 requirements.getBundles().add(url);
             }

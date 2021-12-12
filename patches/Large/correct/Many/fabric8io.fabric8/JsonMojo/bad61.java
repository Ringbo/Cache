diff --git a/fabric8-maven-plugin/src/main/java/io/fabric8/maven/JsonMojo.java b/fabric8-maven-plugin/src/main/java/io/fabric8/maven/JsonMojo.java
index c2fa08a..0ce90b6 100644
--- a/fabric8-maven-plugin/src/main/java/io/fabric8/maven/JsonMojo.java
+++ b/fabric8-maven-plugin/src/main/java/io/fabric8/maven/JsonMojo.java
@@ -273,7 +273,7 @@
     }
 
     public String getKubernetesContainerName() {
-        if (Strings.isNullOrBlank(kubernetesName)) {
+        if (Strings.isNullOrBlank(kubernetesContainerName)) {
             // lets generate it from the docker user and the camelCase artifactId
             String groupPrefix = null;
             MavenProject project = getProject();

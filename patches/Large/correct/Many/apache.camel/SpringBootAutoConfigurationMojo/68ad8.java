diff --git a/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/SpringBootAutoConfigurationMojo.java b/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/SpringBootAutoConfigurationMojo.java
index aedcf49..06ccde5 100644
--- a/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/SpringBootAutoConfigurationMojo.java
+++ b/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/SpringBootAutoConfigurationMojo.java
@@ -158,7 +158,7 @@
                     String pkg = model.getJavaType().substring(0, pos) + ".springboot";
 
                     String overrideComponentName = null;
-                    if(aliases.size()>0) {
+                    if(aliases.size()>1) {
                         // determine component name when there are multiple ones
                         overrideComponentName = model.getArtifactId().replace("camel-", "");
                     }

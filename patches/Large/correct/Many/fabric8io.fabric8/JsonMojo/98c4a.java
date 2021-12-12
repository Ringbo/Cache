diff --git a/fabric8-maven-plugin/src/main/java/io/fabric8/maven/JsonMojo.java b/fabric8-maven-plugin/src/main/java/io/fabric8/maven/JsonMojo.java
index c5a12dc..b84e5bc 100644
--- a/fabric8-maven-plugin/src/main/java/io/fabric8/maven/JsonMojo.java
+++ b/fabric8-maven-plugin/src/main/java/io/fabric8/maven/JsonMojo.java
@@ -892,7 +892,7 @@
 
             if (pureKubernetes) {
                 try {
-                    result = applyTemplates(template);
+                    result = applyTemplates(resultTemplate);
                 } catch (IOException e) {
                     throw new MojoExecutionException("Failed to process template locally " + e, e);
                 }

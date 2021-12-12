diff --git a/forge/addons/devops/src/main/java/io/fabric8/forge/devops/setup/DockerSetupHelper.java b/forge/addons/devops/src/main/java/io/fabric8/forge/devops/setup/DockerSetupHelper.java
index e33aae9..71cc8d7 100644
--- a/forge/addons/devops/src/main/java/io/fabric8/forge/devops/setup/DockerSetupHelper.java
+++ b/forge/addons/devops/src/main/java/io/fabric8/forge/devops/setup/DockerSetupHelper.java
@@ -120,11 +120,11 @@
             }
         }
 
-        ConfigurationElementBuilder from = MavenHelpers.getOrCreateElementBuilder(image, "from");
+        ConfigurationElementBuilder from = MavenHelpers.getOrCreateElementBuilder(build, "from");
         if (Strings.isNullOrBlank(from.getText())) {
             from.setText("${docker.from}");
         }
-        ConfigurationElementBuilder name = MavenHelpers.getOrCreateElementBuilder(build, "name");
+        ConfigurationElementBuilder name = MavenHelpers.getOrCreateElementBuilder(image, "name");
         if (Strings.isNullOrBlank(name.getText())) {
             name.setText("${docker.image}");
         }

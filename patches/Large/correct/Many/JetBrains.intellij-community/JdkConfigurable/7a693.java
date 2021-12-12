diff --git a/source/com/intellij/openapi/roots/ui/configuration/projectRoot/JdkConfigurable.java b/source/com/intellij/openapi/roots/ui/configuration/projectRoot/JdkConfigurable.java
index 3af4f82..1c38aa0 100644
--- a/source/com/intellij/openapi/roots/ui/configuration/projectRoot/JdkConfigurable.java
+++ b/source/com/intellij/openapi/roots/ui/configuration/projectRoot/JdkConfigurable.java
@@ -38,7 +38,7 @@
   }
 
   public String getBannerSlogan() {
-    return ProjectBundle.message("project.roots.jdk.banner.text");
+    return ProjectBundle.message("project.roots.jdk.banner.text", myProjectJdk.getName());
   }
 
   public String getDisplayName() {

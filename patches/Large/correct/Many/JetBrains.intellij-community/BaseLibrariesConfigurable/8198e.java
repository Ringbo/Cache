diff --git a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/projectRoot/BaseLibrariesConfigurable.java b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/projectRoot/BaseLibrariesConfigurable.java
index 45a518e..d7f4b44 100644
--- a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/projectRoot/BaseLibrariesConfigurable.java
+++ b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/projectRoot/BaseLibrariesConfigurable.java
@@ -238,9 +238,9 @@
         }
 
         if (artifacts.size() > 0) {
-          sb.append(modules.size() > 0 ? " and in " : ".");
+          sb.append(modules.size() > 0 ? " and in " : "");
 
-          if (modules.size() == 1) {
+          if (artifacts.size() == 1) {
             sb.append("artifact ").append("\"").append(artifacts.get(0)).append("\".");
           } else {
             sb.append(artifacts.size()).append(" artifacts.");

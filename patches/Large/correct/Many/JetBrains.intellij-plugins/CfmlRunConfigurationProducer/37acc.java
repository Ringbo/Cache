diff --git a/CFML/src/com/intellij/coldFusion/UI/runner/CfmlRunConfigurationProducer.java b/CFML/src/com/intellij/coldFusion/UI/runner/CfmlRunConfigurationProducer.java
index 25d857a..9c09610 100644
--- a/CFML/src/com/intellij/coldFusion/UI/runner/CfmlRunConfigurationProducer.java
+++ b/CFML/src/com/intellij/coldFusion/UI/runner/CfmlRunConfigurationProducer.java
@@ -95,7 +95,7 @@
       params.setUrl(serverUrl + path);
     }
     else if (StringUtil.endsWith(serverUrl, "/") && StringUtil.startsWith(path, "/")) {
-      params.setUrl(serverUrl + path.substring(1, path.length()));
+      params.setUrl(serverUrl + path.substring(1));
     }
 
     configuration.setName(generateName(containingFile));

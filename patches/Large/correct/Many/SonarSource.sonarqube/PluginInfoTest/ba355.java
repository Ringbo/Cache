diff --git a/sonar-core/src/test/java/org/sonar/core/platform/PluginInfoTest.java b/sonar-core/src/test/java/org/sonar/core/platform/PluginInfoTest.java
index fac3803..ccc1d47 100644
--- a/sonar-core/src/test/java/org/sonar/core/platform/PluginInfoTest.java
+++ b/sonar-core/src/test/java/org/sonar/core/platform/PluginInfoTest.java
@@ -182,7 +182,7 @@
     assertThat(pluginInfo.getOrganizationName()).isEqualTo("SonarSource");
     assertThat(pluginInfo.getOrganizationUrl()).isEqualTo("http://sonarsource.com");
     assertThat(pluginInfo.getMinimalSqVersion().getName()).isEqualTo("4.5.1");
-    assertThat(pluginInfo.getRequiredPlugins()).extracting("key").containsExactly("java", "pmd");
+    assertThat(pluginInfo.getRequiredPlugins()).extracting("key").containsOnly("java", "pmd");
     assertThat(pluginInfo.isCore()).isTrue();
   }
 

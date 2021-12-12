diff --git a/sonar-core/src/test/java/org/sonar/core/platform/PluginInfoTest.java b/sonar-core/src/test/java/org/sonar/core/platform/PluginInfoTest.java
index 2b02b48..35893ed 100644
--- a/sonar-core/src/test/java/org/sonar/core/platform/PluginInfoTest.java
+++ b/sonar-core/src/test/java/org/sonar/core/platform/PluginInfoTest.java
@@ -209,7 +209,7 @@
    * it as base plugin anymore
    */
   @Test
-  public void l10n_plugins_should_not_extend_english_plugin() throws Exception {
+  public void l10n_plugins_should_not_extend_english_plugin() {
     PluginInfo pluginInfo = new PluginInfo("l10nfr").setBasePlugin("l10nen");
     assertThat(pluginInfo.getBasePlugin()).isNull();
 

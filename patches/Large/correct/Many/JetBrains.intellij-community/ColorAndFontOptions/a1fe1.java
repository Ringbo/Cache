diff --git a/platform/lang-impl/src/com/intellij/application/options/colors/ColorAndFontOptions.java b/platform/lang-impl/src/com/intellij/application/options/colors/ColorAndFontOptions.java
index f88812f..03a5306 100644
--- a/platform/lang-impl/src/com/intellij/application/options/colors/ColorAndFontOptions.java
+++ b/platform/lang-impl/src/com/intellij/application/options/colors/ColorAndFontOptions.java
@@ -1231,7 +1231,7 @@
   @Nullable
   public SearchableConfigurable findSubConfigurable(String pageName) {
     if (mySubPanelFactories == null) {
-      buildConfigurables();
+      getConfigurables();
     }
     for (InnerSearchableConfigurable configurable : mySubPanelFactories.values()) {
       if (configurable.getDisplayName().equals(pageName)) {

diff --git a/platform/lang-impl/src/com/intellij/application/options/colors/ColorAndFontOptions.java b/platform/lang-impl/src/com/intellij/application/options/colors/ColorAndFontOptions.java
index b748955..129d750 100644
--- a/platform/lang-impl/src/com/intellij/application/options/colors/ColorAndFontOptions.java
+++ b/platform/lang-impl/src/com/intellij/application/options/colors/ColorAndFontOptions.java
@@ -1254,7 +1254,7 @@
   @Nullable
   public SearchableConfigurable findSubConfigurable(@NotNull Class pageClass) {
     if (mySubPanelFactories == null) {
-      buildConfigurables();
+      getConfigurables();
     }
     for (Map.Entry<ColorAndFontPanelFactory, InnerSearchableConfigurable> entry : mySubPanelFactories.entrySet()) {
       if (pageClass.isInstance(entry.getValue().createPanel().getSettingsPage())) {

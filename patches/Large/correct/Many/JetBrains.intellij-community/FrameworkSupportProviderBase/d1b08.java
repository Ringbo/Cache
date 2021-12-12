diff --git a/platform/lang-api/src/com/intellij/ide/util/frameworkSupport/FrameworkSupportProviderBase.java b/platform/lang-api/src/com/intellij/ide/util/frameworkSupport/FrameworkSupportProviderBase.java
index 2c07fc1..4faa0c4 100644
--- a/platform/lang-api/src/com/intellij/ide/util/frameworkSupport/FrameworkSupportProviderBase.java
+++ b/platform/lang-api/src/com/intellij/ide/util/frameworkSupport/FrameworkSupportProviderBase.java
@@ -48,7 +48,7 @@
 
   @Override
   @NotNull
-  public FrameworkSupportConfigurableBase createConfigurable(final @NotNull FrameworkSupportModel model) {
+  public FrameworkSupportConfigurable createConfigurable(final @NotNull FrameworkSupportModel model) {
     return new FrameworkSupportConfigurableBase(this, model, getVersions(), getVersionLabelText());
   }
 }

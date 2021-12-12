diff --git a/appcode-reveal/src/org/jetbrains/appcode/reveal/RevealRunConfigurationExtension.java b/appcode-reveal/src/org/jetbrains/appcode/reveal/RevealRunConfigurationExtension.java
index c602d39..e5fa200 100644
--- a/appcode-reveal/src/org/jetbrains/appcode/reveal/RevealRunConfigurationExtension.java
+++ b/appcode-reveal/src/org/jetbrains/appcode/reveal/RevealRunConfigurationExtension.java
@@ -111,7 +111,7 @@
   @Override
   protected boolean isEnabledFor(@NotNull AppCodeRunConfiguration config, @Nullable RunnerSettings runnerSettings) {
     File appBundle = Reveal.getDefaultRevealApplicationBundle();
-    if (appBundle.exists() == false) return false;
+    if (appBundle != null && appBundle.exists() == false) return false;
 
     if (Reveal.getRevealLib(appBundle, getSdk(config)) == null) return false;
     return isAvailableForPlatform(config);
@@ -165,7 +165,7 @@
     super.install(configuration, product, environment, buildConfiguration, mainExecutable, commandLine);
 
     File appBundle = Reveal.getDefaultRevealApplicationBundle();
-    if (appBundle.exists() == false) return;
+    if (appBundle != null && appBundle.exists() == false) return;
 
     if (!Reveal.isCompatible(appBundle)) return;
 
@@ -190,7 +190,7 @@
                                     @NotNull File mainExecutable,
                                     @NotNull final RevealSettings settings) throws ExecutionException {
     File appBundle = Reveal.getDefaultRevealApplicationBundle();
-    if (appBundle.exists() == false) return null;
+    if (appBundle != null && appBundle.exists() == false) return null;
 
     File libReveal = Reveal.getRevealLib(appBundle, getSdk(configuration));
     if (libReveal == null || !libReveal.exists()) throw new ExecutionException("Reveal library not found");
@@ -361,7 +361,7 @@
       boolean compatible = false;
 
       File appBundle = Reveal.getDefaultRevealApplicationBundle();
-      if (appBundle.exists()) {
+      if (appBundle != null && appBundle.exists()) {
         found = (Reveal.getRevealLib(appBundle, getSdk(s)) != null);
         compatible = Reveal.isCompatible(appBundle);
       }

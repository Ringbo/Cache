diff --git a/fabric/fabric-commands/src/main/java/org/fusesource/fabric/commands/ProfileEdit.java b/fabric/fabric-commands/src/main/java/org/fusesource/fabric/commands/ProfileEdit.java
index 9a17d6f..c7528dc 100644
--- a/fabric/fabric-commands/src/main/java/org/fusesource/fabric/commands/ProfileEdit.java
+++ b/fabric/fabric-commands/src/main/java/org/fusesource/fabric/commands/ProfileEdit.java
@@ -47,7 +47,7 @@
     static final String REPOSITORY_PREFIX = "repository.";
     static final String BUNDLE_PREFIX = "bundle.";
     static final String FAB_PREFIX = "fab.";
-    static final String OVERRIDE_PREFIX = "fab.";
+    static final String OVERRIDE_PREFIX = "override.";
     static final String CONFIG_PREFIX = "config.";
     static final String SYSTEM_PREFIX = "system.";
     static final String DELIMETER = ",";
@@ -156,7 +156,7 @@
         if (overridesList != null && !overridesList.isEmpty()) {
             String[] overrides = overridesList.split(DELIMETER);
             for (String overridesLocation : overrides) {
-                updateConfig(pidConfig, FAB_PREFIX + overridesLocation.replace('/', '_'), overridesLocation, set, delete);
+                updateConfig(pidConfig, OVERRIDE_PREFIX + overridesLocation.replace('/', '_'), overridesLocation, set, delete);
             }
         }
 

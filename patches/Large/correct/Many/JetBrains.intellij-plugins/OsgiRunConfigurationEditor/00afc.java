diff --git a/osmorc/src/org/osmorc/run/ui/OsgiRunConfigurationEditor.java b/osmorc/src/org/osmorc/run/ui/OsgiRunConfigurationEditor.java
index 27220a3..e33eb57 100644
--- a/osmorc/src/org/osmorc/run/ui/OsgiRunConfigurationEditor.java
+++ b/osmorc/src/org/osmorc/run/ui/OsgiRunConfigurationEditor.java
@@ -254,7 +254,7 @@
 
         myAutomaticStartLevel.setSelected(osgiRunConfiguration.isAutoStartLevel());
       myFrameworkStartLevel.setValue(osgiRunConfiguration.getFrameworkStartLevel());
-      myFrameworkStartLevel.setEnabled(myAutomaticStartLevel.isSelected());
+      myFrameworkStartLevel.setEnabled(!myAutomaticStartLevel.isSelected());
 
         boolean useUserDefinedFields = osgiRunConfiguration.getFrameworkDir().length() > 0 ||
                 osgiRunConfiguration.getWorkingDir().length() > 0;

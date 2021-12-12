diff --git a/src/main/java/com/chrisrm/idea/MTHackComponent.java b/src/main/java/com/chrisrm/idea/MTHackComponent.java
index 60a9e2d..ab5aa64 100644
--- a/src/main/java/com/chrisrm/idea/MTHackComponent.java
+++ b/src/main/java/com/chrisrm/idea/MTHackComponent.java
@@ -58,7 +58,7 @@
 
   public MTHackComponent() {
     PropertiesComponent.getInstance().setValue(TABS_HEIGHT, 25, 24);
-    PropertiesComponent.getInstance().setValue(BOLD_TABS, true, false);
+    PropertiesComponent.getInstance().setValue(BOLD_TABS, false, true);
     PropertiesComponent.getInstance().setValue(BORDER_POPUP, true, false);
   }
 

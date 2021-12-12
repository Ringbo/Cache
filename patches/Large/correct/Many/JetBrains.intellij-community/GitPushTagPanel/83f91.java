diff --git a/plugins/git4idea/src/git4idea/push/GitPushTagPanel.java b/plugins/git4idea/src/git4idea/push/GitPushTagPanel.java
index 7201067..21a86a6 100644
--- a/plugins/git4idea/src/git4idea/push/GitPushTagPanel.java
+++ b/plugins/git4idea/src/git4idea/push/GitPushTagPanel.java
@@ -33,7 +33,7 @@
   private final ComboBox myCombobox;
   private final JBCheckBox myCheckBox;
 
-  GitPushTagPanel(@NotNull GitPushTagMode defaultMode, boolean followTagsSupported) {
+  GitPushTagPanel(@Nullable GitPushTagMode defaultMode, boolean followTagsSupported) {
     String checkboxText = "Push Tags";
     if (followTagsSupported) {
       checkboxText += ": ";

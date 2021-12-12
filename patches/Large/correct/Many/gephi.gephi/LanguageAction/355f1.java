diff --git a/DesktopBranding/src/org/gephi/branding/desktop/multilingual/LanguageAction.java b/DesktopBranding/src/org/gephi/branding/desktop/multilingual/LanguageAction.java
index da61654..bdeb2a0 100644
--- a/DesktopBranding/src/org/gephi/branding/desktop/multilingual/LanguageAction.java
+++ b/DesktopBranding/src/org/gephi/branding/desktop/multilingual/LanguageAction.java
@@ -108,7 +108,7 @@
 
     private void setLanguage(Language language) {
         String homePath;
-        if (Utilities.isMac()) {
+        if (Utilities.isMac() || Utilities.isUnix()) {
             homePath = System.getProperty("netbeans.home");
         } else {
             homePath = System.getProperty("user.dir");

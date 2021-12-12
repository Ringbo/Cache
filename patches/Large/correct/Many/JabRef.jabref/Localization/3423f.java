diff --git a/src/main/java/net/sf/jabref/logic/l10n/Localization.java b/src/main/java/net/sf/jabref/logic/l10n/Localization.java
index 3895d4f..e778ddd 100644
--- a/src/main/java/net/sf/jabref/logic/l10n/Localization.java
+++ b/src/main/java/net/sf/jabref/logic/l10n/Localization.java
@@ -19,7 +19,7 @@
     private static ResourceBundle messages;
     private static ResourceBundle menuTitles;
     
-    public static ResourceBundle getMessages() {
+    public static LocalizationBundle getMessages() {
         return new LocalizationBundle(messages);
     }
 

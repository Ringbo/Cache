diff --git a/src/main/java/net/sf/jabref/logic/l10n/Localization.java b/src/main/java/net/sf/jabref/logic/l10n/Localization.java
index ff47836..393fb58 100644
--- a/src/main/java/net/sf/jabref/logic/l10n/Localization.java
+++ b/src/main/java/net/sf/jabref/logic/l10n/Localization.java
@@ -58,7 +58,7 @@
             }
         } catch (MissingResourceException ex) {
             LOGGER.warn("Warning: could not get " + idForErrorMessage + " translation for \"" + key + "\" for locale "
-                    + Locale.getDefault(), ex);
+                    + Locale.getDefault());
         }
         if (translation == null) {
             translation = key;

diff --git a/src/main/java/net/sf/jabref/gui/JabRefFrame.java b/src/main/java/net/sf/jabref/gui/JabRefFrame.java
index 0de6ebb..017e99d 100644
--- a/src/main/java/net/sf/jabref/gui/JabRefFrame.java
+++ b/src/main/java/net/sf/jabref/gui/JabRefFrame.java
@@ -376,7 +376,7 @@
             prefs.getKey(KeyBinds.OPEN_URL_OR_DOI),
             IconTheme.getImage("openUrl"));
     private final AbstractAction openSpires = new GeneralAction(Actions.OPEN_SPIRES,
-            Localization.menuTitle("Open SPIRES entry"),
+            Localization.lang("Open SPIRES entry"),
             Localization.lang("Open SPIRES entry"),
             prefs.getKey(KeyBinds.OPEN_SPIRES_ENTRY));
     private final AbstractAction dupliCheck = new GeneralAction(Actions.DUPLI_CHECK,
@@ -2418,7 +2418,7 @@
 
 
         public BibtexKeyPatternAction() {
-            putValue(Action.NAME, Localization.menuTitle("Bibtex key patterns"));
+            putValue(Action.NAME, Localization.lang("Bibtex key patterns"));
         }
 
         @Override

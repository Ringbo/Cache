diff --git a/src/main/java/org/jabref/gui/JabRefFrame.java b/src/main/java/org/jabref/gui/JabRefFrame.java
index 0f1d7c1..c53d919 100644
--- a/src/main/java/org/jabref/gui/JabRefFrame.java
+++ b/src/main/java/org/jabref/gui/JabRefFrame.java
@@ -739,7 +739,7 @@
         ActionFactory factory = new ActionFactory(Globals.getKeyPrefs());
         Menu file = new Menu(Localization.menuTitle("File"));
         Menu edit = new Menu(Localization.menuTitle("Edit"));
-        Menu library = new Menu(Localization.menuTitle("Library"));
+        Menu library = new Menu(Localization.lang("Library"));
         Menu quality = new Menu(Localization.menuTitle("Quality"));
         Menu view = new Menu(Localization.menuTitle("View"));
         Menu tools = new Menu(Localization.menuTitle("Tools"));

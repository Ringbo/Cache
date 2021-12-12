diff --git a/src/main/java/org/jabref/preferences/JabRefPreferences.java b/src/main/java/org/jabref/preferences/JabRefPreferences.java
index 810d5f7..5826722 100644
--- a/src/main/java/org/jabref/preferences/JabRefPreferences.java
+++ b/src/main/java/org/jabref/preferences/JabRefPreferences.java
@@ -110,7 +110,7 @@
     public static final String NAMES_FIRST_LAST = "namesFf";
     public static final String BIBLATEX_DEFAULT_MODE = "biblatexMode";
     public static final String NAMES_AS_IS = "namesAsIs";
-    public static final String ENTRY_EDITOR_HEIGHT = "entryEditorHeight";
+    public static final String ENTRY_EDITOR_HEIGHT = "entryEditorHeightFX";
     public static final String AUTO_RESIZE_MODE = "autoResizeMode";
     public static final String WINDOW_MAXIMISED = "windowMaximised";
     public static final String USE_DEFAULT_LOOK_AND_FEEL = "useDefaultLookAndFeel";
@@ -407,7 +407,7 @@
     // Preview
     private static final String CYCLE_PREVIEW_POS = "cyclePreviewPos";
     private static final String CYCLE_PREVIEW = "cyclePreview";
-    private static final String PREVIEW_PANEL_HEIGHT = "previewPanelHeight";
+    private static final String PREVIEW_PANEL_HEIGHT = "previewPanelHeightFX";
     private static final String PREVIEW_STYLE = "previewStyle";
     private static final String PREVIEW_ENABLED = "previewEnabled";
 
@@ -512,7 +512,7 @@
         defaults.put(SIZE_Y, 768);
         defaults.put(WINDOW_MAXIMISED, Boolean.FALSE);
         defaults.put(AUTO_RESIZE_MODE, Boolean.TRUE);
-        defaults.put(ENTRY_EDITOR_HEIGHT, 0.75);
+        defaults.put(ENTRY_EDITOR_HEIGHT, 0.65);
         defaults.put(TABLE_COLOR_CODES_ON, Boolean.FALSE);
         defaults.put(TABLE_RESOLVED_COLOR_CODES_ON, Boolean.FALSE);
         defaults.put(NAMES_AS_IS, Boolean.FALSE); // "Show names unchanged"
@@ -805,7 +805,7 @@
         // preview
         defaults.put(CYCLE_PREVIEW, "Preview;" + CitationStyle.DEFAULT);
         defaults.put(CYCLE_PREVIEW_POS, 0);
-        defaults.put(PREVIEW_PANEL_HEIGHT, 200);
+        defaults.put(PREVIEW_PANEL_HEIGHT, 0.65);
         defaults.put(PREVIEW_ENABLED, Boolean.TRUE);
         defaults.put(PREVIEW_STYLE,
                 "<font face=\"sans-serif\">"

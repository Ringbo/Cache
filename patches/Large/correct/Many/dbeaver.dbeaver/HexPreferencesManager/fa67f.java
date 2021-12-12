diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/binary/pref/HexPreferencesManager.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/binary/pref/HexPreferencesManager.java
index e05139d..0f0a2d4 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/binary/pref/HexPreferencesManager.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/binary/pref/HexPreferencesManager.java
@@ -370,7 +370,7 @@
 
     private void refreshWidgets()
     {
-        if (composite.isDisposed())
+        if (composite.isDisposed() || text == null)
             return;
 
         if (fontsSorted == null || !fontsSorted.containsKey(sampleFontData.getName())) {

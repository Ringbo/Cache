diff --git a/src/main/java/org/jabref/gui/entryeditor/EntryEditor.java b/src/main/java/org/jabref/gui/entryeditor/EntryEditor.java
index e3d93d0..b801f68 100644
--- a/src/main/java/org/jabref/gui/entryeditor/EntryEditor.java
+++ b/src/main/java/org/jabref/gui/entryeditor/EntryEditor.java
@@ -102,7 +102,7 @@
      * Set-up key bindings specific for the entry editor.
      */
     private void setupKeyBindings() {
-        tabbed.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
+        this.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
             Optional<KeyBinding> keyBinding = preferences.getKeyBindings().mapToKeyBinding(event);
             if (keyBinding.isPresent()) {
                 switch (keyBinding.get()) {

diff --git a/python/src/com/jetbrains/python/module/PyContentEntriesEditor.java b/python/src/com/jetbrains/python/module/PyContentEntriesEditor.java
index c660222..ae7229d 100644
--- a/python/src/com/jetbrains/python/module/PyContentEntriesEditor.java
+++ b/python/src/com/jetbrains/python/module/PyContentEntriesEditor.java
@@ -124,7 +124,7 @@
   }
 
   @Override
-  protected MyContentEntryEditor createContentEntryEditor(String contentEntryUrl) {
+  protected ContentEntryEditor createContentEntryEditor(String contentEntryUrl) {
     myContentEntryEditor = new MyContentEntryEditor(contentEntryUrl, getEditHandlers());
     return myContentEntryEditor;
   }

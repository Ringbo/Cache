diff --git a/src/main/java/net/sf/jabref/BasePanel.java b/src/main/java/net/sf/jabref/BasePanel.java
index fb3a6d0..117f2db 100644
--- a/src/main/java/net/sf/jabref/BasePanel.java
+++ b/src/main/java/net/sf/jabref/BasePanel.java
@@ -2230,11 +2230,11 @@
     }
 
     private void instantiateSearchAutoCompleter() {
-        AutoCompleter searchCompleter = AutoCompleterFactory.getFor("author", "editor");
+        searchAutoCompleter = AutoCompleterFactory.getFor("author", "editor");
         for (BibtexEntry entry : database.getEntries()) {
-            searchCompleter.addBibtexEntry(entry);
+            searchAutoCompleter.addBibtexEntry(entry);
         }
-        searchCompleteListener = new AutoCompleteListener(searchCompleter);
+        searchCompleteListener = new AutoCompleteListener(searchAutoCompleter);
         searchCompleteListener.setConsumeEnterKey(false); // So you don't have to press Enter twice
     }
 

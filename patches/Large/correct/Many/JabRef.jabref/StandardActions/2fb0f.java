diff --git a/src/main/java/org/jabref/gui/actions/StandardActions.java b/src/main/java/org/jabref/gui/actions/StandardActions.java
index 365d64b..957277f 100644
--- a/src/main/java/org/jabref/gui/actions/StandardActions.java
+++ b/src/main/java/org/jabref/gui/actions/StandardActions.java
@@ -117,7 +117,7 @@
     SELECT_ALL(Localization.menuTitle("Select all"), KeyBinding.SELECT_ALL),
 
     NEW_ENTRY(Localization.menuTitle("New entry"), IconTheme.JabRefIcons.ADD_ENTRY, KeyBinding.NEW_ENTRY),
-    NEW_ARTICLE(Localization.menuTitle("New article"), IconTheme.JabRefIcons.ADD_ENTRY),
+    NEW_ARTICLE(Localization.lang("New article"), IconTheme.JabRefIcons.ADD_ENTRY),
     NEW_ENTRY_FROM_PLAINTEX(Localization.menuTitle("New entry from plain text"), KeyBinding.NEW_FROM_PLAIN_TEXT),
     LIBRARY_PROPERTIES(Localization.menuTitle("Library properties")),
     EDIT_PREAMBLE(Localization.lang("Edit preamble")),
@@ -128,9 +128,9 @@
     RESOLVE_DUPLICATE_KEYS(Localization.menuTitle("Resolve duplicate BibTeX keys"), Localization.lang("Find and remove duplicate BibTeX keys"), KeyBinding.RESOLVE_DUPLICATE_BIBTEX_KEYS),
     CHECK_INTEGRITY(Localization.menuTitle("Check integrity"), KeyBinding.CHECK_INTEGRITY),
     AUTOGENERATE_KEYS(Localization.lang("Autogenerate BibTeX keys"), IconTheme.JabRefIcons.MAKE_KEY, KeyBinding.AUTOGENERATE_BIBTEX_KEYS),
-    FIND_UNLINKED_FILES(Localization.menuTitle("Find unlinked files"), Localization.lang("Searches for unlinked PDF files on the file system"), KeyBinding.FIND_UNLINKED_FILES),
+    FIND_UNLINKED_FILES(Localization.lang("Find unlinked files"), Localization.lang("Searches for unlinked PDF files on the file system"), KeyBinding.FIND_UNLINKED_FILES),
     AUTO_LINK_FILES(Localization.lang("Automatically set file links"), IconTheme.JabRefIcons.AUTO_FILE_LINK, KeyBinding.AUTOMATICALLY_LINK_FILES),
-    LOOKUP_DOC_IDENTIFIER(Localization.menuTitle("Look up document identifier")),
+    LOOKUP_DOC_IDENTIFIER(Localization.lang("Look up document identifier")),
     LOOKUP_FULLTEXT(Localization.menuTitle("Look up full text documents"), KeyBinding.DOWNLOAD_FULL_TEXT),
 
     GENERATE_CITE_KEY(Localization.lang("Autogenerate BibTeX keys"), IconTheme.JabRefIcons.MAKE_KEY, KeyBinding.AUTOGENERATE_BIBTEX_KEYS),

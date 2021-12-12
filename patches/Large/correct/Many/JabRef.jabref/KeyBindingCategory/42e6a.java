diff --git a/src/main/java/net/sf/jabref/gui/keyboard/KeyBindingCategory.java b/src/main/java/net/sf/jabref/gui/keyboard/KeyBindingCategory.java
index fad5ff9..53a894a 100644
--- a/src/main/java/net/sf/jabref/gui/keyboard/KeyBindingCategory.java
+++ b/src/main/java/net/sf/jabref/gui/keyboard/KeyBindingCategory.java
@@ -5,19 +5,19 @@
 public enum KeyBindingCategory {
 
     FILE(
-            Localization.lang("File")),
+            Localization.menuTitle("File")),
     EDIT(
-            Localization.lang("Edit")),
+            Localization.menuTitle("Edit")),
     SEARCH(
-            Localization.lang("Search")),
+            Localization.menuTitle("Search")),
     VIEW(
-            Localization.lang("View")),
+            Localization.menuTitle("View")),
     BIBTEX(
-            Localization.lang("BibTeX")),
+            Localization.menuTitle("BibTeX")),
     QUALITY(
-            Localization.lang("Quality")),
+            Localization.menuTitle("Quality")),
     TOOLS(
-            Localization.lang("Tools"));
+            Localization.menuTitle("Tools"));
 
     private final String name;
 

diff --git a/src/main/java/net/sf/jabref/gui/openoffice/OpenOfficePanel.java b/src/main/java/net/sf/jabref/gui/openoffice/OpenOfficePanel.java
index 1986ea5..4fd6a89 100644
--- a/src/main/java/net/sf/jabref/gui/openoffice/OpenOfficePanel.java
+++ b/src/main/java/net/sf/jabref/gui/openoffice/OpenOfficePanel.java
@@ -571,7 +571,7 @@
             builder.add(ooExec).xy(3, 1);
             builder.add(browseOOExec).xy(5, 1);
 
-            builder.appendColumns("4dlu, pref");
+            builder.appendRows("4dlu, pref");
             builder.add(Localization.lang("Path to OpenOffice/LibreOffice library dir")).xy(1, 3);
             builder.add(ooJars).xy(3, 3);
             builder.add(browseOOJars).xy(5, 3);

diff --git a/src/main/java/net/sf/jabref/gui/dbproperties/DatabasePropertiesDialog.java b/src/main/java/net/sf/jabref/gui/dbproperties/DatabasePropertiesDialog.java
index dfa2c2a..849b1fd 100644
--- a/src/main/java/net/sf/jabref/gui/dbproperties/DatabasePropertiesDialog.java
+++ b/src/main/java/net/sf/jabref/gui/dbproperties/DatabasePropertiesDialog.java
@@ -116,7 +116,7 @@
 
         builder.addSeparator(Localization.lang("Override default file directories")).xyw(1, 3, 5);
         builder.add(Localization.lang("General file directory")).xy(1, 5);
-        builder.add(fileDir).xy(3, 1);
+        builder.add(fileDir).xy(3, 5);
         builder.add(browseFile).xy(5, 5);
         builder.add(Localization.lang("User-specific file directory")).xy(1, 7);
         builder.add(fileDirIndv).xy(3, 7);

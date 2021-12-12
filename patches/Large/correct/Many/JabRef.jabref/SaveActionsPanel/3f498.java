diff --git a/src/main/java/net/sf/jabref/gui/databaseProperties/SaveActionsPanel.java b/src/main/java/net/sf/jabref/gui/databaseProperties/SaveActionsPanel.java
index 241376c..15a9d9d 100644
--- a/src/main/java/net/sf/jabref/gui/databaseProperties/SaveActionsPanel.java
+++ b/src/main/java/net/sf/jabref/gui/databaseProperties/SaveActionsPanel.java
@@ -125,7 +125,7 @@
 
         metaData.putData(SaveActions.META_KEY, actions);
 
-        boolean hasChanged = saveActions.equals(new SaveActions(enabled.isSelected(), formatterString));
+        boolean hasChanged = !saveActions.equals(new SaveActions(enabled.isSelected(), formatterString));
 
         return hasChanged;
     }

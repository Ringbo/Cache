diff --git a/src-ui/org/pentaho/di/ui/spoon/Spoon.java b/src-ui/org/pentaho/di/ui/spoon/Spoon.java
index f789f73..68def27 100644
--- a/src-ui/org/pentaho/di/ui/spoon/Spoon.java
+++ b/src-ui/org/pentaho/di/ui/spoon/Spoon.java
@@ -3958,7 +3958,7 @@
 					String name = delegates.tabs.makeTransGraphTabName(transMeta);
 					if (Const.isEmpty(name))name = STRING_TRANS_NO_NAME;
 					tiTransName.setText(name);
-					tiTransName.setImage(guiResource.getImageBol());
+					tiTransName.setImage(guiResource.getImageTransGraph());
 
 					// Set expanded if this is the only transformation shown.
 					if (props.isOnlyActiveFileShownInTree())
@@ -4108,7 +4108,7 @@
                     String name = delegates.tabs.makeJobGraphTabName(jobMeta);
                     if (Const.isEmpty(name)) name = STRING_JOB_NO_NAME;
 					tiJobName.setText(name);
-					tiJobName.setImage(guiResource.getImageBol());
+					tiJobName.setImage(guiResource.getImageJobGraph());
 
 					// Set expanded if this is the only job shown.
 					if (props.isOnlyActiveFileShownInTree())

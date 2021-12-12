diff --git a/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonTransformationDelegate.java b/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonTransformationDelegate.java
index 503d400..b05721c 100644
--- a/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonTransformationDelegate.java
+++ b/src-ui/org/pentaho/di/ui/spoon/delegates/SpoonTransformationDelegate.java
@@ -180,7 +180,7 @@
 				if (!Const.isEmpty(transMeta.getFilename())) toolTipText+=Const.CR+Const.CR+transMeta.getFilename();
 				tabItem.setToolTipText(toolTipText);
 				try {
-  				if((spoon.getRepository() != null) && (spoon.getRepository().getTransformationLock(transMeta.getObjectId()) != null)) {
+  				if((spoon.getRepository() != null) && (transMeta.getObjectId() != null) && (spoon.getRepository().getTransformationLock(transMeta.getObjectId()) != null)) {
   				  tabItem.setImage(GUIResource.getInstance().getImageLocked());
   				} else {
   				  tabItem.setImage(GUIResource.getInstance().getImageTransGraph());

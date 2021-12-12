diff --git a/python/src/com/jetbrains/python/sdk/PythonSdkDetailsStep.java b/python/src/com/jetbrains/python/sdk/PythonSdkDetailsStep.java
index 7a6b2db..0e31fef 100644
--- a/python/src/com/jetbrains/python/sdk/PythonSdkDetailsStep.java
+++ b/python/src/com/jetbrains/python/sdk/PythonSdkDetailsStep.java
@@ -66,7 +66,7 @@
     final ListPopupStep sdkHomesStep = new PythonSdkDetailsStep(project, moreDialog, ownerComponent, existingSdks, callback);
     final ListPopup popup = JBPopupFactory.getInstance().createListPopup(sdkHomesStep);
     Dimension size = new JLabel(VIRTUALENV, EmptyIcon.ICON_16, SwingConstants.LEFT).getMinimumSize();
-    final int height = size.height * 5 + 5;
+    final int height = size.height * 5 + 10;
     popup.setSize(new Dimension(size.width, height));
     popup.setMinimumSize(new Dimension(size.width, height));
     popup.showInScreenCoordinates(ownerComponent, popupPoint);

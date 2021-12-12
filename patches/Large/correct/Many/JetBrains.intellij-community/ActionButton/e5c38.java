diff --git a/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ActionButton.java b/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ActionButton.java
index 07eb831..9e75c67 100644
--- a/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ActionButton.java
+++ b/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ActionButton.java
@@ -265,7 +265,7 @@
     if (myPresentation.getDisabledIcon() != null) { // set disabled icon if it is specified
       myDisabledIcon = myPresentation.getDisabledIcon();
     }
-    else if (IconLoader.isGoodSize(myIcon)) {
+    else if (myIcon == null || IconLoader.isGoodSize(myIcon)) {
       myDisabledIcon = IconLoader.getDisabledIcon(myIcon);
     }
     else {

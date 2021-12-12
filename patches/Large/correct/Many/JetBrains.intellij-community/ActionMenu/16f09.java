diff --git a/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ActionMenu.java b/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ActionMenu.java
index badbd0b..81ecda0 100644
--- a/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ActionMenu.java
+++ b/platform/platform-impl/src/com/intellij/openapi/actionSystem/impl/ActionMenu.java
@@ -328,7 +328,7 @@
       if (Presentation.PROP_VISIBLE.equals(name)) {
         setVisible(myPresentation.isVisible());
         if (SystemInfo.isMacSystemMenu && myPlace.equals(ActionPlaces.MAIN_MENU)) {
-          validateTree();
+          validate();
         }
       }
       else if (Presentation.PROP_ENABLED.equals(name)) {

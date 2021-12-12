diff --git a/src/core/org/apache/jmeter/gui/action/SelectTemplatesDialog.java b/src/core/org/apache/jmeter/gui/action/SelectTemplatesDialog.java
index 625a13e..0a4e664 100644
--- a/src/core/org/apache/jmeter/gui/action/SelectTemplatesDialog.java
+++ b/src/core/org/apache/jmeter/gui/action/SelectTemplatesDialog.java
@@ -212,7 +212,7 @@
      * @param actionEvent {@link ActionEvent}
      * @return true if plan is not dirty or has been saved 
      */
-    boolean checkDirty(final ActionEvent actionEvent) {
+    private boolean checkDirty(final ActionEvent actionEvent) {
         ActionRouter.getInstance().doActionNow(new ActionEvent(actionEvent.getSource(), actionEvent.getID(), ActionNames.CHECK_DIRTY));
         GuiPackage guiPackage = GuiPackage.getInstance();
         if (guiPackage.isDirty()) {

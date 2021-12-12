diff --git a/src/core/org/apache/jmeter/gui/action/New.java b/src/core/org/apache/jmeter/gui/action/New.java
index c2b34b3..57b6d91 100644
--- a/src/core/org/apache/jmeter/gui/action/New.java
+++ b/src/core/org/apache/jmeter/gui/action/New.java
@@ -103,7 +103,7 @@
      */
     public void doAction(ActionEvent e)
     {
-        ActionRouter.getInstance().actionPerformed(
+		ActionRouter.getInstance().doActionNow(
             new ActionEvent(e.getSource(), e.getID(), CheckDirty.CHECK_DIRTY));
         GuiPackage guiPackage = GuiPackage.getInstance();
         if (guiPackage.isDirty())

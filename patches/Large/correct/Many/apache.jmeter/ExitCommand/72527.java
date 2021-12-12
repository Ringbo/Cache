diff --git a/src/core/org/apache/jmeter/gui/action/ExitCommand.java b/src/core/org/apache/jmeter/gui/action/ExitCommand.java
index 34277a0..7a19ba3 100644
--- a/src/core/org/apache/jmeter/gui/action/ExitCommand.java
+++ b/src/core/org/apache/jmeter/gui/action/ExitCommand.java
@@ -100,7 +100,7 @@
      */
     public void doAction(ActionEvent e)
     {
-        ActionRouter.getInstance().actionPerformed(
+        ActionRouter.getInstance().doActionNow(
             new ActionEvent(e.getSource(), e.getID(), CheckDirty.CHECK_DIRTY));
         if (GuiPackage.getInstance().isDirty())
         {

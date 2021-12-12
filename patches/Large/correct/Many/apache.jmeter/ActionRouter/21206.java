diff --git a/src/core/org/apache/jmeter/gui/action/ActionRouter.java b/src/core/org/apache/jmeter/gui/action/ActionRouter.java
index ba2f0ec..a7098f3 100644
--- a/src/core/org/apache/jmeter/gui/action/ActionRouter.java
+++ b/src/core/org/apache/jmeter/gui/action/ActionRouter.java
@@ -67,7 +67,7 @@
 
 	private void performAction(final ActionEvent e) {
 		try {
-			GuiPackage.getInstance().updateCurrentNode();
+			GuiPackage.getInstance().updateCurrentGui();
 			Set commandObjects = (Set) commands.get(e.getActionCommand());
 			Iterator iter = commandObjects.iterator();
 			while (iter.hasNext()) {

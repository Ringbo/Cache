diff --git a/src/org/zaproxy/zap/extension/beanshell/BeanShellPanel.java b/src/org/zaproxy/zap/extension/beanshell/BeanShellPanel.java
index 3773495..9f4aa6c 100644
--- a/src/org/zaproxy/zap/extension/beanshell/BeanShellPanel.java
+++ b/src/org/zaproxy/zap/extension/beanshell/BeanShellPanel.java
@@ -77,7 +77,7 @@
 		GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
 
 		this.setLayout(new GridBagLayout());
-		this.setSize(403, 296);
+		this.setPreferredSize(new Dimension(400, 300));
 		gridBagConstraints1.gridx = 0;
 		gridBagConstraints1.gridy = 0;
 		gridBagConstraints1.weightx = 1.0;
@@ -102,7 +102,7 @@
 	private JSplitPane getSplitVert() {
 		if (splitVert == null) {
 			splitVert = new JSplitPane();
-			splitVert.setDividerLocation(220);
+			splitVert.setDividerLocation(0.5d);
 			splitVert.setDividerSize(3);
 			splitVert.setOrientation(JSplitPane.VERTICAL_SPLIT);
 			splitVert.setPreferredSize(new Dimension(400,400));

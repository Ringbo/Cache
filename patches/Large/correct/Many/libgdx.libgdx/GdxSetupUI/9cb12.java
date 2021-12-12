diff --git a/extensions/gdx-setup/src/com/badlogic/gdx/setup/GdxSetupUI.java b/extensions/gdx-setup/src/com/badlogic/gdx/setup/GdxSetupUI.java
index 42405a2..b3b6409 100644
--- a/extensions/gdx-setup/src/com/badlogic/gdx/setup/GdxSetupUI.java
+++ b/extensions/gdx-setup/src/com/badlogic/gdx/setup/GdxSetupUI.java
@@ -175,7 +175,7 @@
 					JFileChooser chooser = new JFileChooser();
 					chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
 					chooser.setDialogTitle("Chose destination");
-					int result = chooser.showSaveDialog(null);
+					int result = chooser.showOpenDialog(null);
 					if(result == JFileChooser.APPROVE_OPTION) {
 						File dir = chooser.getSelectedFile();
 						if(dir == null) return;

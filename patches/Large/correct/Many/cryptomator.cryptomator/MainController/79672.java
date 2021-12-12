diff --git a/main/ui/src/main/java/org/cryptomator/ui/controllers/MainController.java b/main/ui/src/main/java/org/cryptomator/ui/controllers/MainController.java
index cad61e5..1546f02 100644
--- a/main/ui/src/main/java/org/cryptomator/ui/controllers/MainController.java
+++ b/main/ui/src/main/java/org/cryptomator/ui/controllers/MainController.java
@@ -264,7 +264,7 @@
 		final List<File> files = fileChooser.showOpenMultipleDialog(mainWindow);
 		if (files != null) {
 			for (final File file : files) {
-				addVault(file.toPath(), false);
+				addVault(file.toPath(), true);
 			}
 		}
 	}

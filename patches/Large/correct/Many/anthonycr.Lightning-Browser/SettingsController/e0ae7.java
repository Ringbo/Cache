diff --git a/src/acr/browser/lightning/SettingsController.java b/src/acr/browser/lightning/SettingsController.java
index 783aac3..00c5eee 100644
--- a/src/acr/browser/lightning/SettingsController.java
+++ b/src/acr/browser/lightning/SettingsController.java
@@ -5,24 +5,24 @@
 
 public class SettingsController {
 
-	static boolean clearHistory = false;
+	private static boolean clearHistory;
 
 	/**
 	 * The purpose of this class is so that I can clear the dropdown history in the main activities if the user selects
 	 * to clear the history from the disk in advanced settings
 	 */
-	static void setClearHistory(boolean choice) {
+	public static void setClearHistory(boolean choice) {
 		clearHistory = choice;
 	}
 
 	/**
 	 * return the choice
 	 */
-	static boolean getClearHistory() {
+	public static boolean getClearHistory() {
 		if (clearHistory) {
 			clearHistory = false;
 			return true;
 		}
-		return clearHistory;
+		return false;
 	}
 }

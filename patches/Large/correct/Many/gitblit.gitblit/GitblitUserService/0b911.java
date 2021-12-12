diff --git a/src/com/gitblit/GitblitUserService.java b/src/com/gitblit/GitblitUserService.java
index 97e1a40..f675510 100644
--- a/src/com/gitblit/GitblitUserService.java
+++ b/src/com/gitblit/GitblitUserService.java
@@ -72,7 +72,7 @@
 
 		assert service != null;
 
-		if (realmFile.exists()) {
+		if (!realmFile.exists()) {
 			// Create the Administrator account for a new realm file
 			try {
 				realmFile.createNewFile();

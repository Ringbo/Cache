diff --git a/src/org/geometerplus/zlibrary/core/dialogs/ZLDialogContent.java b/src/org/geometerplus/zlibrary/core/dialogs/ZLDialogContent.java
index 1d06118..73aeb5c 100644
--- a/src/org/geometerplus/zlibrary/core/dialogs/ZLDialogContent.java
+++ b/src/org/geometerplus/zlibrary/core/dialogs/ZLDialogContent.java
@@ -50,7 +50,7 @@
 
 	public abstract void addOptionByName(String name, ZLOptionEntry option);
 	
-	public final void addOption(String key, ZLColorOptionEntry option) {
+	public final void addOption(String key, ZLOptionEntry option) {
 		addOptionByName(myResource.getResource(key).getValue(), option);
 	}
 	

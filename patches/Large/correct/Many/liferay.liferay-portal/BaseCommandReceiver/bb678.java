diff --git a/portal-impl/src/com/liferay/portal/editor/fckeditor/receiver/impl/BaseCommandReceiver.java b/portal-impl/src/com/liferay/portal/editor/fckeditor/receiver/impl/BaseCommandReceiver.java
index 4029a87..86cfbd7 100644
--- a/portal-impl/src/com/liferay/portal/editor/fckeditor/receiver/impl/BaseCommandReceiver.java
+++ b/portal-impl/src/com/liferay/portal/editor/fckeditor/receiver/impl/BaseCommandReceiver.java
@@ -112,7 +112,9 @@
 				else if (causeString.contains("FolderNameException")) {
 					returnValue = "102";
 				}
-				else if (causeString.contains("NoSuchGroupException")) {
+				else if (causeString.contains("NoSuchGroupException") ||
+						 causeString.contains("PrincipalException")) {
+
 					returnValue = "103";
 				}
 				else {

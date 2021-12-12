diff --git a/src/main/java/com/owncloud/android/ui/fragment/FileDetailSharingFragment.java b/src/main/java/com/owncloud/android/ui/fragment/FileDetailSharingFragment.java
index 5c709b8..6f1e84d 100644
--- a/src/main/java/com/owncloud/android/ui/fragment/FileDetailSharingFragment.java
+++ b/src/main/java/com/owncloud/android/ui/fragment/FileDetailSharingFragment.java
@@ -361,7 +361,7 @@
                     ((FileActivity) getActivity()).getFileOperationsHelper().
                             setHideFileListingPermissionsToShare(
                                     publicShare,
-                                    shareByLinkAllowEditing.isChecked()
+                                    item.isChecked()
                             );
                 } else {
                     // not supported in ownCloud

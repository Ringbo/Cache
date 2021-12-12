diff --git a/WordPress/src/main/java/org/wordpress/android/ui/people/PersonDetailFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/people/PersonDetailFragment.java
index b8a09ec..dfca843 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/people/PersonDetailFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/people/PersonDetailFragment.java
@@ -152,7 +152,7 @@
     private void setupRoleContainerForCapability() {
         Blog blog = WordPress.getBlog(mLocalTableBlogID);
         boolean canChangeRole = blog != null && blog.hasCapability(Capability.EDIT_USERS);
-        if (!canChangeRole) {
+        if (canChangeRole) {
             mRoleContainer.setOnClickListener(this);
         } else {
             // Remove the selectableItemBackground if the user can't be edited

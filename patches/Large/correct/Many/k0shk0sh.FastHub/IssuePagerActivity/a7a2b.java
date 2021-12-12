diff --git a/app/src/main/java/com/fastaccess/ui/modules/repos/issues/issue/details/IssuePagerActivity.java b/app/src/main/java/com/fastaccess/ui/modules/repos/issues/issue/details/IssuePagerActivity.java
index e807251..84b1683 100644
--- a/app/src/main/java/com/fastaccess/ui/modules/repos/issues/issue/details/IssuePagerActivity.java
+++ b/app/src/main/java/com/fastaccess/ui/modules/repos/issues/issue/details/IssuePagerActivity.java
@@ -189,7 +189,7 @@
                     .show(getSupportFragmentManager(), "MilestoneDialogFragment");
             return true;
         } else if (item.getItemId() == R.id.assignees) {
-            AssigneesDialogFragment.newInstance(getPresenter().getLogin(), getPresenter().getLogin(), true)
+            AssigneesDialogFragment.newInstance(getPresenter().getLogin(), getPresenter().getRepoId(), true)
                     .show(getSupportFragmentManager(), "AssigneesDialogFragment");
             return true;
         } else if (item.getItemId() == R.id.subscribe) {

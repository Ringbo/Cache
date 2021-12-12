diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/car/UserGridRecyclerView.java b/packages/SystemUI/src/com/android/systemui/statusbar/car/UserGridRecyclerView.java
index 92dd060..aaf1989 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/car/UserGridRecyclerView.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/car/UserGridRecyclerView.java
@@ -90,7 +90,7 @@
      */
     public void buildAdapter() {
         List<UserRecord> userRecords = createUserRecords(mUserManagerHelper
-                .getAllUsersExcludesSystemUser());
+                .getAllUsers());
         mAdapter = new UserAdapter(mContext, userRecords);
         super.setAdapter(mAdapter);
     }
@@ -149,7 +149,7 @@
     @Override
     public void onUsersUpdate() {
         mAdapter.clearUsers();
-        mAdapter.updateUsers(createUserRecords(mUserManagerHelper.getAllUsersExcludesSystemUser()));
+        mAdapter.updateUsers(createUserRecords(mUserManagerHelper.getAllUsers()));
         mAdapter.notifyDataSetChanged();
     }
 

diff --git a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/group/GroupInfoFragment.java b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/group/GroupInfoFragment.java
index bd715fb..a323e15 100644
--- a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/group/GroupInfoFragment.java
+++ b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/group/GroupInfoFragment.java
@@ -217,7 +217,7 @@
         });
 
         // Administration
-        if (groupVM.getIsCanEditAdministration().get()) {
+        if (groupVM.getIsCanEditAdministration().get() || groupVM.getIsCanDelete().get()) {
             administrationAction.setOnClickListener(view -> {
                 startActivity(new Intent(getActivity(), GroupAdminActivity.class)
                         .putExtra(Intents.EXTRA_GROUP_ID, chatId));

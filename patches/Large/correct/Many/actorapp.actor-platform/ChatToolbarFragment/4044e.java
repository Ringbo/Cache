diff --git a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/toolbar/ChatToolbarFragment.java b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/toolbar/ChatToolbarFragment.java
index 83398ef..0d93385 100644
--- a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/toolbar/ChatToolbarFragment.java
+++ b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/conversation/toolbar/ChatToolbarFragment.java
@@ -261,7 +261,7 @@
             } else if (peer.getPeerType() == PeerType.GROUP) {
 
                 GroupVM groupVM = groups().get(peer.getPeerId());
-                if (groupVM.getGroupType() == GroupType.GROUP) {
+                if (groupVM.getGroupType() == GroupType.GROUP && groupVM.isMember().get() && groupVM.getIsCanCall().get()) {
                     callsEnabled = groupVM.getMembersCount().get() <= MAX_USERS_FOR_CALLS;
                     videoCallsEnabled = false;
                 } else {

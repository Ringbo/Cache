diff --git a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/dialogs/view/DialogView.java b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/dialogs/view/DialogView.java
index abc7064..155b410 100644
--- a/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/dialogs/view/DialogView.java
+++ b/actor-sdk/sdk-core-android/android-sdk/src/main/java/im/actor/sdk/controllers/dialogs/view/DialogView.java
@@ -365,7 +365,7 @@
         } else if (arg.getPeer().getPeerType() == PeerType.PRIVATE) {
             if (arg.isBot()) {
                 res.setTitleIcon(botIcon);
-                res.setTitleIconTop(Screen.dp(34));
+                res.setTitleIconTop(Screen.dp(33));
                 maxTitleWidth -= Screen.dp(16/*icon width*/ + 4/*padding*/);
             }
         }

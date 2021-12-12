diff --git a/core/java/android/app/Notification.java b/core/java/android/app/Notification.java
index 119b055..1c96108 100644
--- a/core/java/android/app/Notification.java
+++ b/core/java/android/app/Notification.java
@@ -1009,7 +1009,7 @@
         private final Bundle mExtras;
         private Icon mIcon;
         private final RemoteInput[] mRemoteInputs;
-        private boolean mAllowGeneratedReplies = false;
+        private boolean mAllowGeneratedReplies = true;
 
         /**
          * Small icon representing the action.
@@ -1051,7 +1051,7 @@
          */
         @Deprecated
         public Action(int icon, CharSequence title, PendingIntent intent) {
-            this(Icon.createWithResource("", icon), title, intent, new Bundle(), null, false);
+            this(Icon.createWithResource("", icon), title, intent, new Bundle(), null, true);
         }
 
         /** Keep in sync with {@link Notification.Action.Builder#Builder(Action)}! */
@@ -1109,7 +1109,7 @@
             private final Icon mIcon;
             private final CharSequence mTitle;
             private final PendingIntent mIntent;
-            private boolean mAllowGeneratedReplies;
+            private boolean mAllowGeneratedReplies = true;
             private final Bundle mExtras;
             private ArrayList<RemoteInput> mRemoteInputs;
 
@@ -1131,7 +1131,7 @@
              * @param intent the {@link PendingIntent} to fire when users trigger this action
              */
             public Builder(Icon icon, CharSequence title, PendingIntent intent) {
-                this(icon, title, intent, new Bundle(), null, false);
+                this(icon, title, intent, new Bundle(), null, true);
             }
 
             /**
@@ -1203,7 +1203,7 @@
              * @param allowGeneratedReplies {@code true} to allow generated replies, {@code false}
              * otherwise
              * @return this object for method chaining
-             * The default value is {@code false}
+             * The default value is {@code true}
              */
             public Builder setAllowGeneratedReplies(boolean allowGeneratedReplies) {
                 mAllowGeneratedReplies = allowGeneratedReplies;

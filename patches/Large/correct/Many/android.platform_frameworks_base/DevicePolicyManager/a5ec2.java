diff --git a/core/java/android/app/admin/DevicePolicyManager.java b/core/java/android/app/admin/DevicePolicyManager.java
index 4be011e..52d7386 100644
--- a/core/java/android/app/admin/DevicePolicyManager.java
+++ b/core/java/android/app/admin/DevicePolicyManager.java
@@ -1177,9 +1177,9 @@
             = "android.app.action.SHOW_DEVICE_MONITORING_DIALOG";
 
     /**
-     * Broadcast Action: Sent after application delegation scopes are changed. The new list of
-     * delegation scopes will be sent in an extra identified by the {@link #EXTRA_DELEGATION_SCOPES}
-     * key.
+     * Broadcast Action: Sent after application delegation scopes are changed. The new delegation
+     * scopes will be sent in an {@code ArrayList<String>} extra identified by the
+     * {@link #EXTRA_DELEGATION_SCOPES} key.
      *
      * <p class=”note”> Note: This is a protected intent that can only be sent by the system.</p>
      */
@@ -1188,7 +1188,7 @@
             "android.app.action.APPLICATION_DELEGATION_SCOPES_CHANGED";
 
     /**
-     * A list of Strings corresponding to the delegation scopes given to an app in the
+     * An {@code ArrayList<String>} corresponding to the delegation scopes given to an app in the
      * {@link #ACTION_APPLICATION_DELEGATION_SCOPES_CHANGED} broadcast.
      */
     public static final String EXTRA_DELEGATION_SCOPES = "android.app.extra.DELEGATION_SCOPES";
@@ -3669,6 +3669,11 @@
      * Granted APIs are determined by {@code scopes}, which is a list of the {@code DELEGATION_*}
      * constants.
      * <p>
+     * A broadcast with the {@link #ACTION_APPLICATION_DELEGATION_SCOPES_CHANGED} action will be
+     * sent to the {@code delegatePackage} with its new scopes in an {@code ArrayList<String>} extra
+     * under the {@link #EXTRA_DELEGATION_SCOPES} key. The broadcast is sent with the
+     * {@link Intent#FLAG_RECEIVER_REGISTERED_ONLY} flag.
+     * <p>
      * Delegated scopes are a per-user state. The delegated access is persistent until it is later
      * cleared by calling this method with an empty {@code scopes} list or uninstalling the
      * {@code delegatePackage}.
@@ -3704,7 +3709,7 @@
      * @throws SecurityException if {@code admin} is not a device or a profile owner.
      */
      @NonNull
-     public List<String> getDelegatedScopes(@NonNull ComponentName admin,
+     public List<String> getDelegatedScopes(@Nullable ComponentName admin,
              @NonNull String delegatedPackage) {
          throwIfParentInstance("getDelegatedScopes");
          if (mService != null) {

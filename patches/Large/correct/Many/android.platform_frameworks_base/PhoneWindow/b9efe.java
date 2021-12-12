diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindow.java b/policy/src/com/android/internal/policy/impl/PhoneWindow.java
index d6b7366..68c1453 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindow.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindow.java
@@ -197,7 +197,8 @@
             /* Another feature is enabled and the user is trying to enable the custom title feature */
             throw new AndroidRuntimeException("You cannot combine custom titles with other title features");
         }
-        if (((features & (1 << FEATURE_CUSTOM_TITLE)) != 0) && (featureId != FEATURE_CUSTOM_TITLE)) {
+        if (((features & (1 << FEATURE_CUSTOM_TITLE)) != 0) &&
+                (featureId != FEATURE_CUSTOM_TITLE) && (featureId != FEATURE_ACTION_MODE_OVERLAY)) {
 
             /* Custom title feature is enabled and the user is trying to enable another feature */
             throw new AndroidRuntimeException("You cannot combine custom titles with other title features");

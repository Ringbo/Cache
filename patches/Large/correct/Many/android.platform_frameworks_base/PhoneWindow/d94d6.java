diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindow.java b/policy/src/com/android/internal/policy/impl/PhoneWindow.java
index b487d92..5faece7 100644
--- a/policy/src/com/android/internal/policy/impl/PhoneWindow.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindow.java
@@ -1881,7 +1881,8 @@
                 if (mActionModeView == null) {
                     if (hasFeature(FEATURE_ACTION_MODE_OVERLAY)) {
                         mActionModeView = new ActionBarContextView(mContext);
-                        mActionModePopup = new PopupWindow(mContext);
+                        mActionModePopup = new PopupWindow(mContext, null,
+                                com.android.internal.R.attr.actionModePopupWindowStyle);
                         mActionModePopup.setLayoutInScreenEnabled(true);
                         mActionModePopup.setClippingEnabled(false);
                         mActionModePopup.setContentView(mActionModeView);

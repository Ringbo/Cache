diff --git a/xabber/src/main/java/com/xabber/android/ui/activity/XabberLoginActivity.java b/xabber/src/main/java/com/xabber/android/ui/activity/XabberLoginActivity.java
index b6a79f5..cb7cbf8 100644
--- a/xabber/src/main/java/com/xabber/android/ui/activity/XabberLoginActivity.java
+++ b/xabber/src/main/java/com/xabber/android/ui/activity/XabberLoginActivity.java
@@ -109,7 +109,7 @@
         fTrans = getFragmentManager().beginTransaction();
         fTrans.replace(R.id.container, fragmentSignUp, FRAGMENT_SIGNUP);
         fTrans.commit();
-        currentFragment = FRAGMENT_LOGIN;
+        currentFragment = FRAGMENT_SIGNUP;
 
         toolbar.setTitle(R.string.title_register_xabber_account);
         barPainter.setLiteGrey();

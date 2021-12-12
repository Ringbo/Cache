diff --git a/core/java/android/nfc/NfcFragment.java b/core/java/android/nfc/NfcFragment.java
index 17278dc..d6b15ad 100644
--- a/core/java/android/nfc/NfcFragment.java
+++ b/core/java/android/nfc/NfcFragment.java
@@ -48,7 +48,10 @@
         FragmentManager manager = activity.getFragmentManager();
         Fragment fragment = manager.findFragmentByTag(FRAGMENT_TAG);
         if (fragment != null) {
-            manager.beginTransaction().remove(fragment).commit();
+            // We allow state loss at this point, because the state is only
+            // lost when activity is being paused *AND* subsequently destroyed.
+            // In that case, the app will setup foreground dispatch again anyway.
+            manager.beginTransaction().remove(fragment).commitAllowingStateLoss();
         }
     }
 

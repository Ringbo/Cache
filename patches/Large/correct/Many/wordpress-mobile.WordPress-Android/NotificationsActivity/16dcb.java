diff --git a/src/org/wordpress/android/ui/notifications/NotificationsActivity.java b/src/org/wordpress/android/ui/notifications/NotificationsActivity.java
index b070f75..48929c7 100644
--- a/src/org/wordpress/android/ui/notifications/NotificationsActivity.java
+++ b/src/org/wordpress/android/ui/notifications/NotificationsActivity.java
@@ -634,7 +634,7 @@
         ft.replace(R.id.layout_fragment_container, readerFragment, tagForFragment)
           .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
           .addToBackStack(tagForFragment)
-          .commitAllowingStateLoss();
+          .commit();
     }
 
     /**
@@ -650,7 +650,7 @@
         ft.replace(R.id.layout_fragment_container, commentFragment, tagForFragment)
           .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
           .addToBackStack(tagForFragment)
-          .commitAllowingStateLoss();
+          .commit();
     }
 
     private interface LoadNotesCallback {

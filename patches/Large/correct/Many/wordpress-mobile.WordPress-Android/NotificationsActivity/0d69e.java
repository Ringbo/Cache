diff --git a/src/org/wordpress/android/ui/notifications/NotificationsActivity.java b/src/org/wordpress/android/ui/notifications/NotificationsActivity.java
index b82de98..ab6876d 100644
--- a/src/org/wordpress/android/ui/notifications/NotificationsActivity.java
+++ b/src/org/wordpress/android/ui/notifications/NotificationsActivity.java
@@ -637,7 +637,7 @@
         ft.replace(R.id.layout_fragment_container, readerFragment, tagForFragment)
           .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
           .addToBackStack(tagForFragment)
-          .commit();
+          .commitAllowingStateLoss();
     }
 
     /**
@@ -653,7 +653,7 @@
         ft.replace(R.id.layout_fragment_container, commentFragment, tagForFragment)
           .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
           .addToBackStack(tagForFragment)
-          .commit();
+          .commitAllowingStateLoss();
     }
 
     private interface LoadNotesCallback {

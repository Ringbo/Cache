diff --git a/core/java/android/provider/ContactsContract.java b/core/java/android/provider/ContactsContract.java
index 40a3c4f..2e4bbab 100644
--- a/core/java/android/provider/ContactsContract.java
+++ b/core/java/android/provider/ContactsContract.java
@@ -2133,16 +2133,14 @@
     /**
      * Helper methods to display QuickContact dialogs that allow users to pivot on
      * a specific {@link Contacts} entry.
-     *
-     * @hide
      */
     public static final class QuickContact {
         /**
          * Action used to trigger person pivot dialog.
          * @hide
          */
-        public static final String ACTION_FAST_TRACK =
-                "com.android.contacts.action.FAST_TRACK";
+        public static final String ACTION_QUICK_CONTACT =
+                "com.android.contacts.action.QUICK_CONTACT";
 
         /**
          * Extra used to specify pivot dialog location in screen coordinates.
@@ -2247,7 +2245,7 @@
         public static void showQuickContact(Context context, Rect target, Uri lookupUri, int mode,
                 String[] excludeMimes) {
             // Launch pivot dialog through intent for now
-            final Intent intent = new Intent(ACTION_FAST_TRACK);
+            final Intent intent = new Intent(ACTION_QUICK_CONTACT);
             intent.setData(lookupUri);
             intent.putExtra(EXTRA_TARGET_RECT, target);
             intent.putExtra(EXTRA_MODE, mode);

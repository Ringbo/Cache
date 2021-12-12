diff --git a/src/com/fsck/k9/fragment/MessageViewFragment.java b/src/com/fsck/k9/fragment/MessageViewFragment.java
index 768d63d..d87307d 100644
--- a/src/com/fsck/k9/fragment/MessageViewFragment.java
+++ b/src/com/fsck/k9/fragment/MessageViewFragment.java
@@ -539,8 +539,10 @@
     }
 
     private void configureMenu(Menu menu) {
-        // first run displayMessage() gets called before onCreateOptionMenu()
-        if (menu == null) {
+        // In Android versions prior to 4.2 onCreateOptionsMenu() (which calls us) is called before
+        // onActivityCreated() when mAccount isn't initialized yet. In that case we do nothing and
+        // wait for displayMessage() to call us again.
+        if (menu == null || mAccount == null) {
             return;
         }
 

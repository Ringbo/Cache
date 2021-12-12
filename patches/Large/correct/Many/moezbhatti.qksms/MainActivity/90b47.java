diff --git a/QKSMS/src/main/java/com/moez/QKSMS/ui/MainActivity.java b/QKSMS/src/main/java/com/moez/QKSMS/ui/MainActivity.java
index 5d91893..4b38ede 100644
--- a/QKSMS/src/main/java/com/moez/QKSMS/ui/MainActivity.java
+++ b/QKSMS/src/main/java/com/moez/QKSMS/ui/MainActivity.java
@@ -591,7 +591,7 @@
     public void onClosed() {
         // When the menu (i.e. the conversation list) has been closed, the content has been opened.
         // So notify the content fragment.
-        if (mContent != null) mContent.onContentOpened();
+        if (mContent != null && ((Fragment) mContent).isAdded()) mContent.onContentOpened();
     }
 
     @Override

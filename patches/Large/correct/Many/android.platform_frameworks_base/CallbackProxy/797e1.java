diff --git a/core/java/android/webkit/CallbackProxy.java b/core/java/android/webkit/CallbackProxy.java
index 92ce4f0..188ab2a 100644
--- a/core/java/android/webkit/CallbackProxy.java
+++ b/core/java/android/webkit/CallbackProxy.java
@@ -1164,7 +1164,7 @@
         // for null.
         WebHistoryItem i = mBackForwardList.getCurrentItem();
         if (i != null) {
-            if (precomposed || i.getTouchIconUrl() != null) {
+            if (precomposed || i.getTouchIconUrl() == null) {
                 i.setTouchIconUrl(url);
             }
         }

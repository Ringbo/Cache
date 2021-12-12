diff --git a/core/java/android/net/Downloads.java b/core/java/android/net/Downloads.java
index ddde5c1..ed6d103 100644
--- a/core/java/android/net/Downloads.java
+++ b/core/java/android/net/Downloads.java
@@ -196,7 +196,7 @@
          * @return a boolean whether the download is successful.
          */
         public boolean isSuccessful() {
-            return android.provider.Downloads.Impl.isStatusCompleted(statusCode);
+            return android.provider.Downloads.Impl.isStatusSuccess(statusCode);
         }
     }
 

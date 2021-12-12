diff --git a/core/java/android/content/ContentResolver.java b/core/java/android/content/ContentResolver.java
index 0ca800f..b13792b 100644
--- a/core/java/android/content/ContentResolver.java
+++ b/core/java/android/content/ContentResolver.java
@@ -1612,7 +1612,7 @@
      * @see #requestSync(android.accounts.Account, String, android.os.Bundle)
      */
     public void notifyChange(Uri uri, ContentObserver observer, boolean syncToNetwork) {
-        notifyChange(uri, observer, syncToNetwork, UserHandle.getCallingUserId());
+        notifyChange(uri, observer, syncToNetwork, UserHandle.myUserId());
     }
 
     /**

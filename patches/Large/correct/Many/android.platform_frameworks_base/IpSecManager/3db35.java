diff --git a/core/java/android/net/IpSecManager.java b/core/java/android/net/IpSecManager.java
index d7b3256..eccd5f4 100644
--- a/core/java/android/net/IpSecManager.java
+++ b/core/java/android/net/IpSecManager.java
@@ -136,7 +136,7 @@
         }
 
         @Override
-        protected void finalize() {
+        protected void finalize() throws Throwable {
             if (mCloseGuard != null) {
                 mCloseGuard.warnIfOpen();
             }

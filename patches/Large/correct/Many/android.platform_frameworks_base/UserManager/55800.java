diff --git a/core/java/android/os/UserManager.java b/core/java/android/os/UserManager.java
index 44b0b62..b532966 100644
--- a/core/java/android/os/UserManager.java
+++ b/core/java/android/os/UserManager.java
@@ -44,7 +44,7 @@
      * @return true if multiple users can be created, false if it is a single user device.
      * @hide
      */
-    public boolean supportsMultipleUsers() {
+    public static boolean supportsMultipleUsers() {
         return getMaxSupportedUsers() > 1;
     }
 

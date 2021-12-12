diff --git a/core/java/android/hardware/location/NanoApp.java b/core/java/android/hardware/location/NanoApp.java
index d5d428e..0465def 100644
--- a/core/java/android/hardware/location/NanoApp.java
+++ b/core/java/android/hardware/location/NanoApp.java
@@ -56,10 +56,10 @@
      * {@link #setAppBinary(byte[])} and {@link #setAppId(long)} must be called
      * prior to passing this object to any managers.
      *
-     * @see #NanoApp(int, byte[])
+     * @see #NanoApp(long, byte[])
      */
     public NanoApp() {
-        this(0, null);
+        this(0L, null);
         mAppIdSet = false;
     }
 

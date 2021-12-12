diff --git a/core/java/android/net/IpSecManager.java b/core/java/android/net/IpSecManager.java
index f04f03f..6125394 100644
--- a/core/java/android/net/IpSecManager.java
+++ b/core/java/android/net/IpSecManager.java
@@ -748,7 +748,7 @@
      * @hide
      */
     @SystemApi
-    void applyTunnelModeTransform(IpSecTunnelInterface tunnel, int direction,
+    public void applyTunnelModeTransform(IpSecTunnelInterface tunnel, int direction,
             IpSecTransform transform) throws IOException {
         // TODO: call IpSecService
     }

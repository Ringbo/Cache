diff --git a/wifi/java/android/net/wifi/WifiStateTracker.java b/wifi/java/android/net/wifi/WifiStateTracker.java
index c45b480..d0f0e71 100644
--- a/wifi/java/android/net/wifi/WifiStateTracker.java
+++ b/wifi/java/android/net/wifi/WifiStateTracker.java
@@ -1373,7 +1373,7 @@
         int netId = -1;
         String[] lines = reply.split("\n");
         for (String line : lines) {
-            String[] prop = line.split(" *= *");
+            String[] prop = line.split(" *= *", 2);
             if (prop.length < 2)
                 continue;
             String name = prop[0];

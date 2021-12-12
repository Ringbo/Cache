diff --git a/wifi/java/android/net/wifi/WifiConfigStore.java b/wifi/java/android/net/wifi/WifiConfigStore.java
index d3d5b1b..23a4e71 100644
--- a/wifi/java/android/net/wifi/WifiConfigStore.java
+++ b/wifi/java/android/net/wifi/WifiConfigStore.java
@@ -1111,7 +1111,8 @@
                 break setVariables;
             }
 
-            if (config.enterpriseConfig != null) {
+            if (config.enterpriseConfig != null &&
+                    config.enterpriseConfig.getEapMethod() != WifiEnterpriseConfig.Eap.NONE) {
 
                 WifiEnterpriseConfig enterpriseConfig = config.enterpriseConfig;
 

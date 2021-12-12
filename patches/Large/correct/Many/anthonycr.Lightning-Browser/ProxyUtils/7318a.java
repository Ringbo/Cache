diff --git a/app/src/LightningLite/java/acr/browser/lightning/utils/ProxyUtils.java b/app/src/LightningLite/java/acr/browser/lightning/utils/ProxyUtils.java
index c81d61c..f881200 100644
--- a/app/src/LightningLite/java/acr/browser/lightning/utils/ProxyUtils.java
+++ b/app/src/LightningLite/java/acr/browser/lightning/utils/ProxyUtils.java
@@ -39,7 +39,7 @@
 
     public static ProxyUtils getInstance() {
         if (mInstance == null) {
-            mInstance = new ProxyUtils(BrowserApp.getAppContext());
+            mInstance = new ProxyUtils(BrowserApp.getContext());
         }
         return mInstance;
     }

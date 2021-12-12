diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/huami/amazfitcor/AmazfitCorFWInstallHandler.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/huami/amazfitcor/AmazfitCorFWInstallHandler.java
index dc6ddfa..2316e12 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/huami/amazfitcor/AmazfitCorFWInstallHandler.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/devices/huami/amazfitcor/AmazfitCorFWInstallHandler.java
@@ -46,7 +46,7 @@
 
     @Override
     protected AbstractMiBandFWHelper createHelper(Uri uri, Context context) throws IOException {
-        return new AmazfitBipFWHelper(uri, context);
+        return new AmazfitCorFWHelper(uri, context);
     }
 
     @Override

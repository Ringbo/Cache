diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/amazfitbip/AmazfitBipSupport.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/amazfitbip/AmazfitBipSupport.java
index 57fb194..928d5c6 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/amazfitbip/AmazfitBipSupport.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/amazfitbip/AmazfitBipSupport.java
@@ -80,7 +80,7 @@
         try {
             TransactionBuilder builder = performInitialized("new notification");
             AlertNotificationProfile<?> profile = new AlertNotificationProfile(this);
-            profile.setMaxLength(255); // TODO: find out real limit, certainly it is more than 18 which is default
+            profile.setMaxLength(230);
 
             int customIconId = AmazfitBipIcon.mapToIconId(notificationSpec.type);
 

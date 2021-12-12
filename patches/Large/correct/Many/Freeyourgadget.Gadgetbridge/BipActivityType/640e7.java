diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/amazfitbip/BipActivityType.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/amazfitbip/BipActivityType.java
index eef7a14..bc842f3 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/amazfitbip/BipActivityType.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/amazfitbip/BipActivityType.java
@@ -3,10 +3,10 @@
 import nodomain.freeyourgadget.gadgetbridge.model.ActivityKind;
 
 public enum BipActivityType {
-    Outdoor(4),
+    Outdoor(1),
     Treadmill(2),
-    Cycling(1),
-    Walking(3);
+    Walking(3),
+    Cycling(4);
 
     private final int code;
 

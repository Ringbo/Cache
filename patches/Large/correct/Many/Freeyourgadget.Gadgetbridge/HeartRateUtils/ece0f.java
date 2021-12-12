diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/activities/HeartRateUtils.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/activities/HeartRateUtils.java
index a2f3b07..0a002d1 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/activities/HeartRateUtils.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/activities/HeartRateUtils.java
@@ -18,7 +18,7 @@
 
 public class HeartRateUtils {
     public static final int MAX_HEART_RATE_VALUE = 250;
-    public static final int MIN_HEART_RATE_VALUE = 0;
+    public static final int MIN_HEART_RATE_VALUE = 10;
     /**
      * The maxiumum gap between two hr measurements in which
      * we interpolate between the measurements. Otherwise, two

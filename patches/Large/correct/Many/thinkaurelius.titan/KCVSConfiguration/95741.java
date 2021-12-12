diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/configuration/backend/KCVSConfiguration.java b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/configuration/backend/KCVSConfiguration.java
index 169ce83..89093e5 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/configuration/backend/KCVSConfiguration.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/configuration/backend/KCVSConfiguration.java
@@ -130,7 +130,7 @@
         }
         final StaticBuffer expectedValueBuffer;
         if (checkExpectedValue && expectedValue!=null) {
-            expectedValueBuffer = object2StaticBuffer(value);
+            expectedValueBuffer = object2StaticBuffer(expectedValue);
         } else {
             expectedValueBuffer = null;
         }

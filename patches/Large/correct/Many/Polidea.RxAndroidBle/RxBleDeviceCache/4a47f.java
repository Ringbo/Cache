diff --git a/rxandroidble/src/main/java/com/polidea/rxandroidble/internal/RxBleDeviceCache.java b/rxandroidble/src/main/java/com/polidea/rxandroidble/internal/RxBleDeviceCache.java
index 8346d17..75fd092 100644
--- a/rxandroidble/src/main/java/com/polidea/rxandroidble/internal/RxBleDeviceCache.java
+++ b/rxandroidble/src/main/java/com/polidea/rxandroidble/internal/RxBleDeviceCache.java
@@ -96,7 +96,7 @@
         }
 
         public boolean isEmpty() {
-            return get() != null;
+            return get() == null;
         }
     }
 

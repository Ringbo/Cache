diff --git a/rxandroidble/src/main/java/com/polidea/rxandroidble/internal/connection/RxBleGattCallback.java b/rxandroidble/src/main/java/com/polidea/rxandroidble/internal/connection/RxBleGattCallback.java
index ba1aa01..0fb5b14 100644
--- a/rxandroidble/src/main/java/com/polidea/rxandroidble/internal/connection/RxBleGattCallback.java
+++ b/rxandroidble/src/main/java/com/polidea/rxandroidble/internal/connection/RxBleGattCallback.java
@@ -353,7 +353,7 @@
         }
 
         boolean hasObservers() {
-            return valueRelay.hasObservers() || valueRelay.hasObservers();
+            return valueRelay.hasObservers() || errorRelay.hasObservers();
         }
     }
 }

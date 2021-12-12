diff --git a/services/core/java/com/android/server/fingerprint/InternalEnumerateClient.java b/services/core/java/com/android/server/fingerprint/InternalEnumerateClient.java
index f4d2596..88d9ef4 100644
--- a/services/core/java/com/android/server/fingerprint/InternalEnumerateClient.java
+++ b/services/core/java/com/android/server/fingerprint/InternalEnumerateClient.java
@@ -88,7 +88,7 @@
             doFingerprintCleanup();
         }
 
-        return fingerId == 0; // done when id hits 0
+        return remaining == 0;
     }
 
 }

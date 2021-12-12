diff --git a/addons/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/protocol/MilightDiscover.java b/addons/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/protocol/MilightDiscover.java
index 0fb87e3..608c825 100644
--- a/addons/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/protocol/MilightDiscover.java
+++ b/addons/binding/org.openhab.binding.milight/src/main/java/org/openhab/binding/milight/internal/protocol/MilightDiscover.java
@@ -272,7 +272,7 @@
                         if (state == SessionState.SESSION_VALID) {
                             s.release();
                         }
-                    });
+                    }, null);
             boolean success = s.tryAcquire(1, 1300, TimeUnit.MILLISECONDS);
             session.dispose();
             queuedSend.dispose();

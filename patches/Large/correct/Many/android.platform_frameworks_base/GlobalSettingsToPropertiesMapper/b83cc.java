diff --git a/services/core/java/com/android/server/am/GlobalSettingsToPropertiesMapper.java b/services/core/java/com/android/server/am/GlobalSettingsToPropertiesMapper.java
index fe65978..0bc9d36 100644
--- a/services/core/java/com/android/server/am/GlobalSettingsToPropertiesMapper.java
+++ b/services/core/java/com/android/server/am/GlobalSettingsToPropertiesMapper.java
@@ -94,7 +94,7 @@
         }
         try {
             systemPropertiesSet(key, value);
-        } catch (IllegalArgumentException e) {
+        } catch (Exception e) {
             Slog.e(TAG, "Unable to set property " + key + " value '" + value + "'", e);
         }
     }

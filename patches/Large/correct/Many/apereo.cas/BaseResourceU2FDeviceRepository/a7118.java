diff --git a/support/cas-server-support-u2f/src/main/java/org/apereo/cas/adaptors/u2f/storage/BaseResourceU2FDeviceRepository.java b/support/cas-server-support-u2f/src/main/java/org/apereo/cas/adaptors/u2f/storage/BaseResourceU2FDeviceRepository.java
index eebe18c..4d4dc5e 100644
--- a/support/cas-server-support-u2f/src/main/java/org/apereo/cas/adaptors/u2f/storage/BaseResourceU2FDeviceRepository.java
+++ b/support/cas-server-support-u2f/src/main/java/org/apereo/cas/adaptors/u2f/storage/BaseResourceU2FDeviceRepository.java
@@ -60,7 +60,7 @@
         } catch (final Exception e) {
             LOGGER.error(e.getMessage(), e);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
 

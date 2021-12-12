diff --git a/support/cas-server-support-u2f-mongo/src/main/java/org/apereo/cas/adaptors/u2f/storage/U2FMongoDbDeviceRepository.java b/support/cas-server-support-u2f-mongo/src/main/java/org/apereo/cas/adaptors/u2f/storage/U2FMongoDbDeviceRepository.java
index 5fd2118..88fbaea 100644
--- a/support/cas-server-support-u2f-mongo/src/main/java/org/apereo/cas/adaptors/u2f/storage/U2FMongoDbDeviceRepository.java
+++ b/support/cas-server-support-u2f-mongo/src/main/java/org/apereo/cas/adaptors/u2f/storage/U2FMongoDbDeviceRepository.java
@@ -54,7 +54,7 @@
         } catch (final Exception e) {
             LOGGER.error(e.getMessage(), e);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     @Override

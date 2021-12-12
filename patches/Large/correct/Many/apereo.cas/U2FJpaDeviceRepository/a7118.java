diff --git a/support/cas-server-support-u2f-jpa/src/main/java/org/apereo/cas/adaptors/u2f/storage/U2FJpaDeviceRepository.java b/support/cas-server-support-u2f-jpa/src/main/java/org/apereo/cas/adaptors/u2f/storage/U2FJpaDeviceRepository.java
index 766f3ed..1f98f04 100644
--- a/support/cas-server-support-u2f-jpa/src/main/java/org/apereo/cas/adaptors/u2f/storage/U2FJpaDeviceRepository.java
+++ b/support/cas-server-support-u2f-jpa/src/main/java/org/apereo/cas/adaptors/u2f/storage/U2FJpaDeviceRepository.java
@@ -61,7 +61,7 @@
         } catch (final Exception e) {
             LOGGER.error(e.getMessage(), e);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     @Override

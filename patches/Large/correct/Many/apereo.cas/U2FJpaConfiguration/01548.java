diff --git a/support/cas-server-support-u2f-jpa/src/main/java/org/apereo/cas/config/U2FJpaConfiguration.java b/support/cas-server-support-u2f-jpa/src/main/java/org/apereo/cas/config/U2FJpaConfiguration.java
index 4bdd3c5..7450788 100644
--- a/support/cas-server-support-u2f-jpa/src/main/java/org/apereo/cas/config/U2FJpaConfiguration.java
+++ b/support/cas-server-support-u2f-jpa/src/main/java/org/apereo/cas/config/U2FJpaConfiguration.java
@@ -92,7 +92,7 @@
                 Caffeine.newBuilder()
                         .expireAfterWrite(u2f.getExpireRegistrations(), u2f.getExpireRegistrationsTimeUnit())
                         .build(key -> StringUtils.EMPTY);
-        U2FJpaDeviceRepository repo = new U2FJpaDeviceRepository(requestStorage,
+        final U2FJpaDeviceRepository repo = new U2FJpaDeviceRepository(requestStorage,
                 u2f.getExpireRegistrations(),
                 u2f.getExpireDevicesTimeUnit());
         repo.setCipherExecutor(this.u2fRegistrationRecordCipherExecutor);

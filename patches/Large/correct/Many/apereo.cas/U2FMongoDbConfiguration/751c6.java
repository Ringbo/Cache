diff --git a/support/cas-server-support-u2f-mongo/src/main/java/org/apereo/cas/config/U2FMongoDbConfiguration.java b/support/cas-server-support-u2f-mongo/src/main/java/org/apereo/cas/config/U2FMongoDbConfiguration.java
index 7a29568..4522fe6 100644
--- a/support/cas-server-support-u2f-mongo/src/main/java/org/apereo/cas/config/U2FMongoDbConfiguration.java
+++ b/support/cas-server-support-u2f-mongo/src/main/java/org/apereo/cas/config/U2FMongoDbConfiguration.java
@@ -47,7 +47,7 @@
                 Caffeine.newBuilder()
                         .expireAfterWrite(u2f.getExpireRegistrations(), u2f.getExpireRegistrationsTimeUnit())
                         .build(key -> StringUtils.EMPTY);
-        U2FMongoDbDeviceRepository repo = new U2FMongoDbDeviceRepository(requestStorage, mongoTemplate, u2f.getExpireRegistrations(),
+        final U2FMongoDbDeviceRepository repo = new U2FMongoDbDeviceRepository(requestStorage, mongoTemplate, u2f.getExpireRegistrations(),
                 u2f.getExpireDevicesTimeUnit(), mongoProps.getCollection());
         repo.setCipherExecutor(this.u2fRegistrationRecordCipherExecutor);
         return repo;

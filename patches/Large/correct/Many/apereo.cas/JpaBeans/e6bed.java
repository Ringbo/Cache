diff --git a/api/cas-server-core-api-configuration-model/src/main/java/org/apereo/cas/configuration/support/JpaBeans.java b/api/cas-server-core-api-configuration-model/src/main/java/org/apereo/cas/configuration/support/JpaBeans.java
index f64c7a2..2a4e164 100644
--- a/api/cas-server-core-api-configuration-model/src/main/java/org/apereo/cas/configuration/support/JpaBeans.java
+++ b/api/cas-server-core-api-configuration-model/src/main/java/org/apereo/cas/configuration/support/JpaBeans.java
@@ -76,7 +76,7 @@
         bean.setJdbcUrl(jpaProperties.getUrl());
         bean.setUsername(jpaProperties.getUser());
         bean.setPassword(jpaProperties.getPassword());
-        bean.setLoginTimeout((int) Beans.newDuration(jpaProperties.getPool().getMaxWait()).toMillis());
+        bean.setLoginTimeout((int) Beans.newDuration(jpaProperties.getPool().getMaxWait()).getSeconds());
         bean.setMaximumPoolSize(jpaProperties.getPool().getMaxSize());
         bean.setMinimumIdle(jpaProperties.getPool().getMinSize());
         bean.setIdleTimeout((int) Beans.newDuration(jpaProperties.getIdleTimeout()).toMillis());

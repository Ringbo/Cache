diff --git a/support/cas-server-support-cassandra-authentication/src/main/java/org/apereo/cas/authentication/DefaultCassandraRepository.java b/support/cas-server-support-cassandra-authentication/src/main/java/org/apereo/cas/authentication/DefaultCassandraRepository.java
index 1306b40..45c83e0 100644
--- a/support/cas-server-support-cassandra-authentication/src/main/java/org/apereo/cas/authentication/DefaultCassandraRepository.java
+++ b/support/cas-server-support-cassandra-authentication/src/main/java/org/apereo/cas/authentication/DefaultCassandraRepository.java
@@ -29,7 +29,7 @@
     public DefaultCassandraRepository(final CassandraAuthenticationProperties cassandraProperties,
                                       final CassandraSessionFactory cassandraSessionFactory) {
         final String query = String.format(SELECT_USER_BY_UID_QUERY, cassandraProperties.getTableName(),
-                cassandraProperties.getUsername());
+                cassandraProperties.getUsernameAttribute());
 
         this.session = cassandraSessionFactory.getSession();
         this.selectUserQuery = session.prepare(query);

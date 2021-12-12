diff --git a/jOOQ/src/main/java/org/jooq/impl/DefaultDSLContext.java b/jOOQ/src/main/java/org/jooq/impl/DefaultDSLContext.java
index dd4d0ae..9823349 100644
--- a/jOOQ/src/main/java/org/jooq/impl/DefaultDSLContext.java
+++ b/jOOQ/src/main/java/org/jooq/impl/DefaultDSLContext.java
@@ -289,7 +289,7 @@
     }
 
     public DefaultDSLContext(SQLDialect dialect, Settings settings) {
-        this(new DefaultConfiguration(new NoConnectionProvider(), null, null, null, null, null, null, null, null, null, dialect, settings, null));
+        this(new DefaultConfiguration(new NoConnectionProvider(), null, null, null, null, null, null, null, null, null, null, dialect, settings, null));
     }
 
     public DefaultDSLContext(Connection connection, SQLDialect dialect) {
@@ -297,7 +297,7 @@
     }
 
     public DefaultDSLContext(Connection connection, SQLDialect dialect, Settings settings) {
-        this(new DefaultConfiguration(new DefaultConnectionProvider(connection), null, null, null, null, null, null, null, null, null, dialect, settings, null));
+        this(new DefaultConfiguration(new DefaultConnectionProvider(connection), null, null, null, null, null, null, null, null, null, null, dialect, settings, null));
     }
 
     public DefaultDSLContext(DataSource datasource, SQLDialect dialect) {
@@ -305,7 +305,7 @@
     }
 
     public DefaultDSLContext(DataSource datasource, SQLDialect dialect, Settings settings) {
-        this(new DefaultConfiguration(new DataSourceConnectionProvider(datasource), null, null, null, null, null, null, null, null, null, dialect, settings, null));
+        this(new DefaultConfiguration(new DataSourceConnectionProvider(datasource), null, null, null, null, null, null, null, null, null, null, dialect, settings, null));
     }
 
     public DefaultDSLContext(ConnectionProvider connectionProvider, SQLDialect dialect) {
@@ -313,7 +313,7 @@
     }
 
     public DefaultDSLContext(ConnectionProvider connectionProvider, SQLDialect dialect, Settings settings) {
-        this(new DefaultConfiguration(connectionProvider, null, null, null, null, null, null, null, null, null, dialect, settings, null));
+        this(new DefaultConfiguration(connectionProvider, null, null, null, null, null, null, null, null, null, null, dialect, settings, null));
     }
 
     public DefaultDSLContext(Configuration configuration) {

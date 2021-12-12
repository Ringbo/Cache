diff --git a/quartz-core/src/main/java/org/quartz/impl/StdSchedulerFactory.java b/quartz-core/src/main/java/org/quartz/impl/StdSchedulerFactory.java
index 1c1a2f1..975e03a 100644
--- a/quartz-core/src/main/java/org/quartz/impl/StdSchedulerFactory.java
+++ b/quartz-core/src/main/java/org/quartz/impl/StdSchedulerFactory.java
@@ -1402,7 +1402,7 @@
         copyProps.remove(PoolingConnectionProvider.DB_MAX_CONNECTIONS);
         copyProps.remove(PoolingConnectionProvider.DB_VALIDATION_QUERY);
         copyProps.remove(C3p0PoolingConnectionProvider.DB_VALIDATE_ON_CHECKOUT);
-        props.remove(PoolingConnectionProvider.POOLING_PROVIDER);
+        copyProps.remove(PoolingConnectionProvider.POOLING_PROVIDER);
         setBeanProps(cp.getDataSource(), copyProps);
     }
 

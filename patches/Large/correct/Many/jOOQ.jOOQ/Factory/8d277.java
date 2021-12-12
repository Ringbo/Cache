diff --git a/jOOQ/src/main/java/org/jooq/impl/Factory.java b/jOOQ/src/main/java/org/jooq/impl/Factory.java
index 93dde1e..9777c1c 100644
--- a/jOOQ/src/main/java/org/jooq/impl/Factory.java
+++ b/jOOQ/src/main/java/org/jooq/impl/Factory.java
@@ -6074,14 +6074,14 @@
     /**
      * Get a default <code>Factory</code> without a {@link Connection}
      */
-    final static FactoryOperations getNewFactory(SQLDialect dialect) {
+    final static Factory getNewFactory(SQLDialect dialect) {
         return getNewFactory(DEFAULT_INSTANCES[dialect.ordinal()]);
     }
 
     /**
      * Get a default <code>Factory</code> without a {@link Connection}
      */
-    final static FactoryOperations getStaticFactory(SQLDialect dialect) {
+    final static Factory getStaticFactory(SQLDialect dialect) {
         return DEFAULT_INSTANCES[dialect.ordinal()];
     }
 

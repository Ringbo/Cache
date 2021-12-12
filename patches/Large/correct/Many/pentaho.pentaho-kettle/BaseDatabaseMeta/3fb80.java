diff --git a/src/org/pentaho/di/core/database/BaseDatabaseMeta.java b/src/org/pentaho/di/core/database/BaseDatabaseMeta.java
index fe76ed6..a6e5e3f 100644
--- a/src/org/pentaho/di/core/database/BaseDatabaseMeta.java
+++ b/src/org/pentaho/di/core/database/BaseDatabaseMeta.java
@@ -1033,7 +1033,7 @@
      */
     public void setInitialPoolSize(int initialPoolSize)
     {
-        attributes.setProperty(ATTRIBUTE_MAXIMUM_POOL_SIZE, Integer.toString(initialPoolSize));
+        attributes.setProperty(ATTRIBUTE_INITIAL_POOL_SIZE, Integer.toString(initialPoolSize));
     }
     
     

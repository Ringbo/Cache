diff --git a/flyway-core/src/main/java/org/flywaydb/core/internal/util/scanner/classpath/ClassPathScanner.java b/flyway-core/src/main/java/org/flywaydb/core/internal/util/scanner/classpath/ClassPathScanner.java
index f9765dd..b9a5e0b 100644
--- a/flyway-core/src/main/java/org/flywaydb/core/internal/util/scanner/classpath/ClassPathScanner.java
+++ b/flyway-core/src/main/java/org/flywaydb/core/internal/util/scanner/classpath/ClassPathScanner.java
@@ -111,7 +111,7 @@
             try {
                 ClassUtils.instantiate(className, classLoader);
             } catch (Exception e) {
-                throw new FlywayException("Unable to instantiate class: " + className);
+                throw new FlywayException("Unable to instantiate class: " + className, e);
             }
 
             classes.add(clazz);

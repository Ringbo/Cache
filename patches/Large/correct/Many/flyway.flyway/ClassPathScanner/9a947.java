diff --git a/flyway-core/src/main/java/org/flywaydb/core/internal/util/scanner/classpath/ClassPathScanner.java b/flyway-core/src/main/java/org/flywaydb/core/internal/util/scanner/classpath/ClassPathScanner.java
index d7a7cce..d975677 100644
--- a/flyway-core/src/main/java/org/flywaydb/core/internal/util/scanner/classpath/ClassPathScanner.java
+++ b/flyway-core/src/main/java/org/flywaydb/core/internal/util/scanner/classpath/ClassPathScanner.java
@@ -120,7 +120,7 @@
                 LOG.debug("Skipping invalid class: " + className);
                 continue;
             } catch (IncompatibleClassChangeError e) {
-                LOG.debug("Skipping incompatibly changed class: " + className);
+                LOG.warn("Skipping incompatibly changed class: " + className);
                 continue;
             } catch (NoClassDefFoundError e) {
                 LOG.debug("Skipping non-loadable class: " + className);

diff --git a/flyway-core/src/main/java/org/flywaydb/core/internal/util/ClassUtils.java b/flyway-core/src/main/java/org/flywaydb/core/internal/util/ClassUtils.java
index d7023a4..e64a019 100644
--- a/flyway-core/src/main/java/org/flywaydb/core/internal/util/ClassUtils.java
+++ b/flyway-core/src/main/java/org/flywaydb/core/internal/util/ClassUtils.java
@@ -64,7 +64,7 @@
                 try {
                     clazzes.add(ClassUtils.<T>instantiate(clazz, classLoader));
                 } catch (Exception e) {
-                    throw new FlywayException("Unable to instantiate class: " + clazz);
+                    throw new FlywayException("Unable to instantiate class: " + clazz, e);
                 }
             }
         }

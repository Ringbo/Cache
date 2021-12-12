diff --git a/modules/swagger-core/src/main/java/io/swagger/v3/core/jackson/ModelResolver.java b/modules/swagger-core/src/main/java/io/swagger/v3/core/jackson/ModelResolver.java
index baea6e8..aeca799 100644
--- a/modules/swagger-core/src/main/java/io/swagger/v3/core/jackson/ModelResolver.java
+++ b/modules/swagger-core/src/main/java/io/swagger/v3/core/jackson/ModelResolver.java
@@ -999,7 +999,7 @@
                 }
             }
         }
-        if (subtypeProps.isEmpty()) {
+        if (subtypeProps == null || subtypeProps.isEmpty()) {
             child.setProperties(null);
         }
     }

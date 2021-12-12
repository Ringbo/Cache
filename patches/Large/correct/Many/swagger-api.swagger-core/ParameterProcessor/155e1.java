diff --git a/modules/swagger-core/src/main/java/io/swagger/util/ParameterProcessor.java b/modules/swagger-core/src/main/java/io/swagger/util/ParameterProcessor.java
index 0b08708..21b970a 100644
--- a/modules/swagger-core/src/main/java/io/swagger/util/ParameterProcessor.java
+++ b/modules/swagger-core/src/main/java/io/swagger/util/ParameterProcessor.java
@@ -376,7 +376,7 @@
                     apiParam = new ApiImplicitParamWrapper((ApiImplicitParam) item);
                 } else if ("javax.ws.rs.DefaultValue".equals(item.annotationType().getName())) {
                     try {
-                        rsDefault = (String) item.getClass().getMethod("value").invoke(item);
+                        rsDefault = (String) item.annotationType().getMethod("value").invoke(item);
                     } catch (Exception ex) {
                         LOGGER.error("Invocation of value method failed", ex);
                     }

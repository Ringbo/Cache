diff --git a/core/cas-server-core-util/src/main/java/org/apereo/cas/util/ResourceUtils.java b/core/cas-server-core-util/src/main/java/org/apereo/cas/util/ResourceUtils.java
index f99a14b..1d4f494 100644
--- a/core/cas-server-core-util/src/main/java/org/apereo/cas/util/ResourceUtils.java
+++ b/core/cas-server-core-util/src/main/java/org/apereo/cas/util/ResourceUtils.java
@@ -87,7 +87,7 @@
                 IOUtils.read(res.getInputStream(), new byte[1]);
                 return true;
             } catch (final Exception e) {
-                LOGGER.debug(e.getMessage(), e);
+                LOGGER.trace(e.getMessage(), e);
                 return false;
             }
         }

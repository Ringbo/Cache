diff --git a/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/HttpProxyPropertyProvider.java b/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/HttpProxyPropertyProvider.java
index 3cd336c..ca2bd52 100644
--- a/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/HttpProxyPropertyProvider.java
+++ b/ambari-server/src/main/java/org/apache/ambari/server/controller/internal/HttpProxyPropertyProvider.java
@@ -195,7 +195,7 @@
       r.setProperty(propertyIdToSet, propertyValueToSet);
     }
     catch (IOException ioe) {
-      LOG.error("Error reading HTTP response from " + url);
+      LOG.debug("Error reading HTTP response from " + url);
       r.setProperty(propertyIdToSet, null);
     } catch (JsonSyntaxException jse) {
       LOG.error("Error parsing HTTP response from " + url);

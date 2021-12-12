diff --git a/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/FtpEndpoint.java b/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/FtpEndpoint.java
index fd585ad..8334e69 100644
--- a/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/FtpEndpoint.java
+++ b/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/FtpEndpoint.java
@@ -154,7 +154,7 @@
             // and we want to keep data timeout so we can log it later
             timeout = localParameters.remove("dataTimeout");
             if (timeout != null) {
-                dataTimeout = getCamelContext().getTypeConverter().convertTo(int.class, dataTimeout);
+                dataTimeout = getCamelContext().getTypeConverter().convertTo(int.class, timeout);
             }
             setProperties(client, localParameters);
         }

diff --git a/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/FtpsEndpoint.java b/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/FtpsEndpoint.java
index 17f0acc..144be58 100644
--- a/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/FtpsEndpoint.java
+++ b/components/camel-ftp/src/main/java/org/apache/camel/component/file/remote/FtpsEndpoint.java
@@ -178,7 +178,7 @@
             // and we want to keep data timeout so we can log it later
             timeout = localParameters.remove("dataTimeout");
             if (timeout != null) {
-                dataTimeout = getCamelContext().getTypeConverter().convertTo(int.class, dataTimeout);
+                dataTimeout = getCamelContext().getTypeConverter().convertTo(int.class, timeout);
             }
             setProperties(client, localParameters);
         }

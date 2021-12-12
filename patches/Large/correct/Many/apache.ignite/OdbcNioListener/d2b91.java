diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/odbc/OdbcNioListener.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/odbc/OdbcNioListener.java
index e7baaff..378e5f2 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/odbc/OdbcNioListener.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/odbc/OdbcNioListener.java
@@ -137,7 +137,7 @@
         catch (Exception e) {
             log.error("Failed to process ODBC request [id=" + reqId + ", err=" + e + ']');
 
-            ses.send(parser.encode(new OdbcResponse(OdbcResponse.STATUS_FAILED, e.getMessage())));
+            ses.send(parser.encode(new OdbcResponse(OdbcResponse.STATUS_FAILED, e.toString())));
         }
     }
 

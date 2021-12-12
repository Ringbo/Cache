diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/odbc/OdbcRequestHandler.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/odbc/OdbcRequestHandler.java
index 588fc66..32fb9db 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/odbc/OdbcRequestHandler.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/odbc/OdbcRequestHandler.java
@@ -164,7 +164,7 @@
         catch (Exception e) {
             U.error(log, "Failed to perform handshake [reqId=" + reqId + ", req=" + req + ']', e);
 
-            return new OdbcResponse(OdbcResponse.STATUS_FAILED, e.getMessage());
+            return new OdbcResponse(OdbcResponse.STATUS_FAILED, e.toString());
         }
     }
 
@@ -220,7 +220,7 @@
 
             U.error(log, "Failed to execute SQL query [reqId=" + reqId + ", req=" + req + ']', e);
 
-            return new OdbcResponse(OdbcResponse.STATUS_FAILED, e.getMessage());
+            return new OdbcResponse(OdbcResponse.STATUS_FAILED, e.toString());
         }
     }
 
@@ -255,7 +255,7 @@
 
             U.error(log, "Failed to close SQL query [reqId=" + reqId + ", req=" + req.queryId() + ']', e);
 
-            return new OdbcResponse(OdbcResponse.STATUS_FAILED, e.getMessage());
+            return new OdbcResponse(OdbcResponse.STATUS_FAILED, e.toString());
         }
     }
 
@@ -295,7 +295,7 @@
         catch (Exception e) {
             U.error(log, "Failed to fetch SQL query result [reqId=" + reqId + ", req=" + req + ']', e);
 
-            return new OdbcResponse(OdbcResponse.STATUS_FAILED, e.getMessage());
+            return new OdbcResponse(OdbcResponse.STATUS_FAILED, e.toString());
         }
     }
 
@@ -352,7 +352,7 @@
         catch (Exception e) {
             U.error(log, "Failed to get columns metadata [reqId=" + reqId + ", req=" + req + ']', e);
 
-            return new OdbcResponse(OdbcResponse.STATUS_FAILED, e.getMessage());
+            return new OdbcResponse(OdbcResponse.STATUS_FAILED, e.toString());
         }
     }
 
@@ -397,7 +397,7 @@
         catch (Exception e) {
             U.error(log, "Failed to get tables metadata [reqId=" + reqId + ", req=" + req + ']', e);
 
-            return new OdbcResponse(OdbcResponse.STATUS_FAILED, e.getMessage());
+            return new OdbcResponse(OdbcResponse.STATUS_FAILED, e.toString());
         }
     }
 
@@ -429,7 +429,7 @@
         catch (Exception e) {
             U.error(log, "Failed to get params metadata [reqId=" + reqId + ", req=" + req + ']', e);
 
-            return new OdbcResponse(OdbcResponse.STATUS_FAILED, e.getMessage());
+            return new OdbcResponse(OdbcResponse.STATUS_FAILED, e.toString());
         }
     }
 

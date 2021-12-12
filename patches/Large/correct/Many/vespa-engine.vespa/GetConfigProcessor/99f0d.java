diff --git a/configserver/src/main/java/com/yahoo/vespa/config/server/rpc/GetConfigProcessor.java b/configserver/src/main/java/com/yahoo/vespa/config/server/rpc/GetConfigProcessor.java
index 37f8aa4..5a1352d 100644
--- a/configserver/src/main/java/com/yahoo/vespa/config/server/rpc/GetConfigProcessor.java
+++ b/configserver/src/main/java/com/yahoo/vespa/config/server/rpc/GetConfigProcessor.java
@@ -112,7 +112,7 @@
         } catch (UnknownConfigIdException e) {
             handleError(request, ErrorCode.ILLEGAL_CONFIGID, "Illegal config id " + request.getConfigKey().getConfigId());
             return;
-        } catch (Exception e) {
+        } catch (Throwable e) {
             log.log(Level.SEVERE, "Unexpected error handling config request", e);
             handleError(request, ErrorCode.INTERNAL_ERROR, "Internal error " + e.getMessage());
             return;

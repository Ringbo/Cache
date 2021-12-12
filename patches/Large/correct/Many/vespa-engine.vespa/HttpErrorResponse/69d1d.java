diff --git a/configserver/src/main/java/com/yahoo/vespa/config/server/http/HttpErrorResponse.java b/configserver/src/main/java/com/yahoo/vespa/config/server/http/HttpErrorResponse.java
index 7a86357..81806a0 100644
--- a/configserver/src/main/java/com/yahoo/vespa/config/server/http/HttpErrorResponse.java
+++ b/configserver/src/main/java/com/yahoo/vespa/config/server/http/HttpErrorResponse.java
@@ -35,7 +35,7 @@
     public enum errorCodes {
         APPLICATION_LOCK_FAILURE,
         BAD_REQUEST,
-        ACTIVATION_FAILED,
+        ACTIVATION_CONFLICT,
         INTERNAL_SERVER_ERROR,
         INVALID_APPLICATION_PACKAGE,
         METHOD_NOT_ALLOWED,
@@ -66,7 +66,7 @@
     }
 
     public static HttpErrorResponse conflictWhenActivating(String msg) {
-        return new HttpErrorResponse(CONFLICT, errorCodes.ACTIVATION_FAILED.name(), msg);
+        return new HttpErrorResponse(CONFLICT, errorCodes.ACTIVATION_CONFLICT.name(), msg);
     }
 
     public static HttpErrorResponse methodNotAllowed(String msg) {

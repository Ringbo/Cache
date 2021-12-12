diff --git a/h2o-core/src/main/java/water/api/RequestServer.java b/h2o-core/src/main/java/water/api/RequestServer.java
index 038af2b..9d18077 100644
--- a/h2o-core/src/main/java/water/api/RequestServer.java
+++ b/h2o-core/src/main/java/water/api/RequestServer.java
@@ -632,7 +632,7 @@
       else if (e instanceof MalformedURLException)
         error._http_status = HttpResponseStatus.BAD_REQUEST.getCode();
 
-      Log.warn("Caught exception: " + error.toString());
+      Log.err("Caught exception: " + error.toString());
 
       // Note: don't use Schema.schema(version, error) because we have to work at bootstrap:
       return wrap(new H2OErrorV3().fillFromImpl(error), type);

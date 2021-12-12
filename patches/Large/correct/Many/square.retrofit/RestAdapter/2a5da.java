diff --git a/retrofit/src/main/java/retrofit/RestAdapter.java b/retrofit/src/main/java/retrofit/RestAdapter.java
index 3d862a1..43186e4 100644
--- a/retrofit/src/main/java/retrofit/RestAdapter.java
+++ b/retrofit/src/main/java/retrofit/RestAdapter.java
@@ -584,7 +584,7 @@
      * @deprecated Use {@link #setEndpoint(String)} or {@link #setEndpoint(Endpoint)}.
      */
     @Deprecated
-    public Builder setServer(Endpoint server) {
+    public Builder setServer(Server server) {
       return setEndpoint(server);
     }
 

diff --git a/components/gateway-fabric/src/main/java/io/fabric8/gateway/fabric/support/vertx/VertxServiceImpl.java b/components/gateway-fabric/src/main/java/io/fabric8/gateway/fabric/support/vertx/VertxServiceImpl.java
index 6e08ab1..25c3787 100644
--- a/components/gateway-fabric/src/main/java/io/fabric8/gateway/fabric/support/vertx/VertxServiceImpl.java
+++ b/components/gateway-fabric/src/main/java/io/fabric8/gateway/fabric/support/vertx/VertxServiceImpl.java
@@ -40,7 +40,7 @@
     private Vertx vertx;
 
     @PostConstruct
-    public void activate() throws Exception {
+    public void activate()  {
         vertx = vertxFactory.createVertx();
         Objects.notNull(vertx, "vertx");
     }

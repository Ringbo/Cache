diff --git a/core/server/src/main/java/alluxio/RpcUtils.java b/core/server/src/main/java/alluxio/RpcUtils.java
index 5476d29..d91b92f 100644
--- a/core/server/src/main/java/alluxio/RpcUtils.java
+++ b/core/server/src/main/java/alluxio/RpcUtils.java
@@ -64,7 +64,7 @@
       LOG.debug("Internal Alluxio error when running rpc", e);
       throw e.toThrift();
     } catch (IOException e) {
-      LOG.error("I/O error when running rpc", e);
+      LOG.warn("I/O error when running rpc", e);
       throw new ThriftIOException(e.getMessage());
     } catch (Exception e) {
       LOG.error("Unexpected error running rpc", e);

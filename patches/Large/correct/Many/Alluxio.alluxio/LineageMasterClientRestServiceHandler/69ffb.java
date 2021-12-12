diff --git a/core/server/src/main/java/alluxio/master/lineage/LineageMasterClientRestServiceHandler.java b/core/server/src/main/java/alluxio/master/lineage/LineageMasterClientRestServiceHandler.java
index 5f8bcab..8372b43 100644
--- a/core/server/src/main/java/alluxio/master/lineage/LineageMasterClientRestServiceHandler.java
+++ b/core/server/src/main/java/alluxio/master/lineage/LineageMasterClientRestServiceHandler.java
@@ -57,7 +57,10 @@
 
   private final LineageMaster mLineageMaster = AlluxioMaster.get().getLineageMaster();
 
-  private LineageMasterClientRestServiceHandler() {} // prevent instantiation
+  /**
+   * Constructs a new {@link LineageMasterClientRestServiceHandler}.
+   */
+  public LineageMasterClientRestServiceHandler() {}
 
   /**
    * @summary get the service name

diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/igfs/IgfsMetaManager.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/igfs/IgfsMetaManager.java
index 84e4dae..d66d9be 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/igfs/IgfsMetaManager.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/igfs/IgfsMetaManager.java
@@ -3549,7 +3549,7 @@
                             IgniteUuid oldId = pathIds.lastId();
 
                             id2InfoPrj.invoke(trashId, new ListingAddProcessor(oldId.toString(),
-                                new IgfsListingEntry(oldId, true)));
+                                new IgfsListingEntry(oldInfo)));
 
                             // Second step: replace ID in parent directory.
                             String name = pathIds.lastPart();

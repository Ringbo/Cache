diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/query/GridQueryProcessor.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/query/GridQueryProcessor.java
index 1a68619..f503161 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/query/GridQueryProcessor.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/query/GridQueryProcessor.java
@@ -650,7 +650,7 @@
             for (CacheConfiguration<?, ?> ccfg : ctx.config().getCacheConfiguration()){
                 CacheQueryConfiguration qryCfg = ccfg.getQueryConfiguration();
 
-                if (qryCfg != null) {
+                if (qryCfg != null && ccfg.getTypeMetadata() != null) {
                     for (CacheTypeMetadata meta : ccfg.getTypeMetadata())
                         portableIds.put(ctx.portable().typeId(meta.getValueType()), meta.getValueType());
                 }
@@ -676,7 +676,7 @@
             for (CacheConfiguration<?, ?> ccfg : ctx.config().getCacheConfiguration()){
                 CacheQueryConfiguration qryCfg = ccfg.getQueryConfiguration();
 
-                if (qryCfg != null) {
+                if (qryCfg != null && ccfg.getTypeMetadata() != null) {
                     for (CacheTypeMetadata meta : ccfg.getTypeMetadata())
                         declaredTypesById.put(new TypeId(ccfg.getName(), ctx.portable().typeId(meta.getValueType())), meta);
                 }

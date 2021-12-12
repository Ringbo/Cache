diff --git a/sdks/java/extensions/euphoria/src/main/java/org/apache/beam/sdk/extensions/euphoria/core/client/operator/CountByKey.java b/sdks/java/extensions/euphoria/src/main/java/org/apache/beam/sdk/extensions/euphoria/core/client/operator/CountByKey.java
index a0f3ecd..19c758e 100644
--- a/sdks/java/extensions/euphoria/src/main/java/org/apache/beam/sdk/extensions/euphoria/core/client/operator/CountByKey.java
+++ b/sdks/java/extensions/euphoria/src/main/java/org/apache/beam/sdk/extensions/euphoria/core/client/operator/CountByKey.java
@@ -268,7 +268,7 @@
         .of(Iterables.getOnlyElement(inputs))
         .keyBy(getKeyExtractor(), getKeyType().orElse(null))
         .valueBy(v -> 1L, TypeDescriptors.longs())
-        .combineBy(Sums.ofLongs())
+        .combineBy(Sums.ofLongs(), TypeDescriptors.longs())
         .applyIf(
             getWindow().isPresent(),
             builder -> {

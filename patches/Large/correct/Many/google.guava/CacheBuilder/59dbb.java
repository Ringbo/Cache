diff --git a/android/guava/src/com/google/common/cache/CacheBuilder.java b/android/guava/src/com/google/common/cache/CacheBuilder.java
index e453aef..aa7e12f 100644
--- a/android/guava/src/com/google/common/cache/CacheBuilder.java
+++ b/android/guava/src/com/google/common/cache/CacheBuilder.java
@@ -235,8 +235,7 @@
 
   Supplier<? extends StatsCounter> statsCounterSupplier = NULL_STATS_COUNTER;
 
-  // TODO(fry): make constructor private and update tests to use newBuilder
-  CacheBuilder() {}
+  private CacheBuilder() {}
 
   /**
    * Constructs a new {@code CacheBuilder} instance with default settings, including strong keys,

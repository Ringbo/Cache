diff --git a/presto-spi/src/main/java/com/facebook/presto/spi/memory/MemoryPoolInfo.java b/presto-spi/src/main/java/com/facebook/presto/spi/memory/MemoryPoolInfo.java
index da4e2e2..346d003 100644
--- a/presto-spi/src/main/java/com/facebook/presto/spi/memory/MemoryPoolInfo.java
+++ b/presto-spi/src/main/java/com/facebook/presto/spi/memory/MemoryPoolInfo.java
@@ -43,7 +43,7 @@
         this.reservedBytes = reservedBytes;
         this.reservedRevocableBytes = reservedRevocableBytes;
         this.queryMemoryReservations = unmodifiableMap(new HashMap<>(queryMemoryReservations));
-        this.queryMemoryRevocableReservations = unmodifiableMap(new HashMap<>(queryMemoryReservations));
+        this.queryMemoryRevocableReservations = unmodifiableMap(new HashMap<>(queryMemoryRevocableReservations));
     }
 
     @JsonProperty

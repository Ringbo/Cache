diff --git a/server/src/main/java/io/druid/server/router/PriorityTieredBrokerSelectorStrategy.java b/server/src/main/java/io/druid/server/router/PriorityTieredBrokerSelectorStrategy.java
index d911aef..8d52bcc 100644
--- a/server/src/main/java/io/druid/server/router/PriorityTieredBrokerSelectorStrategy.java
+++ b/server/src/main/java/io/druid/server/router/PriorityTieredBrokerSelectorStrategy.java
@@ -38,7 +38,7 @@
       @JsonProperty("maxPriority") Integer maxPriority
   )
   {
-    this.minPriority = minPriority == null ? 0 : minPriority;
+    this.minPriority = minPriority == null ? 1 : minPriority;
     this.maxPriority = maxPriority == null ? 1 : maxPriority;
   }
 

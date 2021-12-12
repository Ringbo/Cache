diff --git a/aeron-client/src/main/java/uk/co/real_logic/aeron/conductor/SubscriptionMap.java b/aeron-client/src/main/java/uk/co/real_logic/aeron/conductor/SubscriptionMap.java
index a5b2da7..f379367 100644
--- a/aeron-client/src/main/java/uk/co/real_logic/aeron/conductor/SubscriptionMap.java
+++ b/aeron-client/src/main/java/uk/co/real_logic/aeron/conductor/SubscriptionMap.java
@@ -24,13 +24,16 @@
 
 import static uk.co.real_logic.aeron.common.collections.CollectionUtil.getOrDefault;
 
+/**
+ * Threadsafe.
+ */
 public class SubscriptionMap
 {
     private static final Function<String, Int2ObjectHashMap<Subscription>> SUPPLIER = (ignore) -> new Int2ObjectHashMap<>();
 
     private final Map<String, Int2ObjectHashMap<Subscription>> subscriptionByChannelMap = new HashMap<>();
 
-    public Subscription get(final String channel, final int streamId)
+    public synchronized Subscription get(final String channel, final int streamId)
     {
         final Int2ObjectHashMap<Subscription> subscriptionByStreamIdMap = subscriptionByChannelMap.get(channel);
         if (subscriptionByStreamIdMap == null)
@@ -41,12 +44,12 @@
         return subscriptionByStreamIdMap.get(streamId);
     }
 
-    public void put(final String channel, final int streamId, final Subscription value)
+    public synchronized void put(final String channel, final int streamId, final Subscription value)
     {
         getOrDefault(subscriptionByChannelMap, channel, SUPPLIER).put(streamId, value);
     }
 
-    public Subscription remove(final String channel, final int streamId)
+    public synchronized Subscription remove(final String channel, final int streamId)
     {
         final Int2ObjectHashMap<Subscription> subscriptionByStreamIdMap = subscriptionByChannelMap.get(channel);
         if (subscriptionByStreamIdMap == null)

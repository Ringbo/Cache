diff --git a/rt/features/logging/src/main/java/org/apache/cxf/ext/logging/event/DefaultLogEventMapper.java b/rt/features/logging/src/main/java/org/apache/cxf/ext/logging/event/DefaultLogEventMapper.java
index 66082bc..8324dae 100644
--- a/rt/features/logging/src/main/java/org/apache/cxf/ext/logging/event/DefaultLogEventMapper.java
+++ b/rt/features/logging/src/main/java/org/apache/cxf/ext/logging/event/DefaultLogEventMapper.java
@@ -269,7 +269,7 @@
     }
     
     private static String safeGet(Message message, String key) {
-        if (!message.containsKey(key)) {
+        if (message == null || !message.containsKey(key)) {
             return null;
         }
         Object value = message.get(key);

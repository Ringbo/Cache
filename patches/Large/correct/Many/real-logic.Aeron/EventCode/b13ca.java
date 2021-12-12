diff --git a/aeron-agent/src/main/java/io/aeron/agent/EventCode.java b/aeron-agent/src/main/java/io/aeron/agent/EventCode.java
index 8db0e7f..b0da737 100644
--- a/aeron-agent/src/main/java/io/aeron/agent/EventCode.java
+++ b/aeron-agent/src/main/java/io/aeron/agent/EventCode.java
@@ -98,7 +98,7 @@
 
     public static EventCode get(final int id)
     {
-        if (id < 0 || id > EVENT_CODE_BY_ID.length)
+        if (id < 0 || id >= EVENT_CODE_BY_ID.length)
         {
             throw new IllegalArgumentException("No EventCode for ID: " + id);
         }

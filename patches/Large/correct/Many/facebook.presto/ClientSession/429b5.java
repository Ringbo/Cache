diff --git a/presto-client/src/main/java/com/facebook/presto/client/ClientSession.java b/presto-client/src/main/java/com/facebook/presto/client/ClientSession.java
index 9b78e98..8aece03 100644
--- a/presto-client/src/main/java/com/facebook/presto/client/ClientSession.java
+++ b/presto-client/src/main/java/com/facebook/presto/client/ClientSession.java
@@ -81,7 +81,7 @@
         // verify the properties are valid
         CharsetEncoder charsetEncoder = US_ASCII.newEncoder();
         for (Entry<String, String> entry : properties.entrySet()) {
-            checkArgument(entry.getKey().isEmpty(), "Session property name is empty");
+            checkArgument(!entry.getKey().isEmpty(), "Session property name is empty");
             checkArgument(entry.getKey().indexOf('=') < 0, "Session property name must not contain '=': %s", entry.getKey());
             checkArgument(charsetEncoder.canEncode(entry.getKey()), "Session property name is not US_ASCII: %s", entry.getKey());
             checkArgument(charsetEncoder.canEncode(entry.getValue()), "Session property value is not US_ASCII: %s", entry.getValue());

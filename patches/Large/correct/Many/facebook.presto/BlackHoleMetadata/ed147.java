diff --git a/presto-blackhole/src/main/java/com/facebook/presto/plugin/blackhole/BlackHoleMetadata.java b/presto-blackhole/src/main/java/com/facebook/presto/plugin/blackhole/BlackHoleMetadata.java
index dab50ba..2fe597f 100644
--- a/presto-blackhole/src/main/java/com/facebook/presto/plugin/blackhole/BlackHoleMetadata.java
+++ b/presto-blackhole/src/main/java/com/facebook/presto/plugin/blackhole/BlackHoleMetadata.java
@@ -217,6 +217,12 @@
     @Override
     public ConnectorTableLayout getTableLayout(ConnectorSession session, ConnectorTableLayoutHandle handle)
     {
-        return new ConnectorTableLayout(handle);
+        return new ConnectorTableLayout(
+                handle,
+                Optional.empty(),
+                TupleDomain.none(),
+                Optional.empty(),
+                Optional.empty(),
+                ImmutableList.of());
     }
 }

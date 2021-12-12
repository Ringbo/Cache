diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/datasource/RealtimeMultivalueBlock.java b/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/datasource/RealtimeMultivalueBlock.java
index 45c8f90..5e2ec3f 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/datasource/RealtimeMultivalueBlock.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/datasource/RealtimeMultivalueBlock.java
@@ -141,7 +141,7 @@
 
           @Override
           public boolean hasNext() {
-            return (counter <= max);
+            return (counter < max);
           }
 
           @Override

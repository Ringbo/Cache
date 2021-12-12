diff --git a/server/src/main/java/com/metamx/druid/index/v1/QueryableIndexStorageAdapter.java b/server/src/main/java/com/metamx/druid/index/v1/QueryableIndexStorageAdapter.java
index 0dfded5..1cde70b 100644
--- a/server/src/main/java/com/metamx/druid/index/v1/QueryableIndexStorageAdapter.java
+++ b/server/src/main/java/com/metamx/druid/index/v1/QueryableIndexStorageAdapter.java
@@ -272,7 +272,7 @@
                   }
 
                   final Offset offset = new TimestampCheckingOffset(
-                      baseOffset, timestamps, Math.min(interval.getEndMillis(), gran.next(timeStart))
+                      baseOffset, timestamps, Math.min(interval.getEndMillis(), gran.next(input))
                   );
 
                   return new Cursor()

diff --git a/presto-orc/src/main/java/com/facebook/presto/orc/json/JsonReaders.java b/presto-orc/src/main/java/com/facebook/presto/orc/json/JsonReaders.java
index 466d5fd..aa77c9a 100644
--- a/presto-orc/src/main/java/com/facebook/presto/orc/json/JsonReaders.java
+++ b/presto-orc/src/main/java/com/facebook/presto/orc/json/JsonReaders.java
@@ -90,7 +90,7 @@
             case LIST:
                 return new ListJsonReader(streamDescriptor, writeStackType, checkForNulls, hiveStorageTimeZone, sessionTimeZone);
             case MAP:
-                return new MapJsonReader(streamDescriptor, writeStackType, checkForNulls, sessionTimeZone, sessionTimeZone);
+                return new MapJsonReader(streamDescriptor, writeStackType, checkForNulls, hiveStorageTimeZone, sessionTimeZone);
             case UNION:
             case DECIMAL:
             case VARCHAR:

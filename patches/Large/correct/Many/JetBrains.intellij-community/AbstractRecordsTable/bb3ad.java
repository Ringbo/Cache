diff --git a/platform/util/src/com/intellij/util/io/storage/AbstractRecordsTable.java b/platform/util/src/com/intellij/util/io/storage/AbstractRecordsTable.java
index 0eac13b..9df55b9 100644
--- a/platform/util/src/com/intellij/util/io/storage/AbstractRecordsTable.java
+++ b/platform/util/src/com/intellij/util/io/storage/AbstractRecordsTable.java
@@ -34,7 +34,7 @@
   private static final int HEADER_VERSION_OFFSET = 4;
   protected static final int DEFAULT_HEADER_SIZE = 8;
 
-  private static final int VERSION = 6;
+  private static final int VERSION = 5;
   private static final int CONNECTED_MAGIC = 0x12ad34e4;
   private static final int SAFELY_CLOSED_MAGIC = 0x1f2f3f4f + VERSION;
 

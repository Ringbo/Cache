diff --git a/aeron-client/src/main/java/io/aeron/command/ImageBuffersReadyFlyweight.java b/aeron-client/src/main/java/io/aeron/command/ImageBuffersReadyFlyweight.java
index ce11a13..84682b4 100644
--- a/aeron-client/src/main/java/io/aeron/command/ImageBuffersReadyFlyweight.java
+++ b/aeron-client/src/main/java/io/aeron/command/ImageBuffersReadyFlyweight.java
@@ -43,10 +43,14 @@
  *  +---------------------------------------------------------------+
  *  |                    Subscriber Position Id 0                   |
  *  +---------------------------------------------------------------+
+ *  |                     Padding for alignment                     |
+ *  +---------------------------------------------------------------+
  *  |                       Registration Id 0                       |
  *  |                                                               |
  *  +---------------------------------------------------------------+
  *  |                    Subscriber Position Id 1                   |
+ *  +---------------------------------------------------------------+
+ *  |                     Padding for alignment                     |
  *  +---------------------------------------------------------------+
  *  |                       Registration Id 1                       |
  *  |                                                               |
@@ -75,7 +79,7 @@
     private static final int SUBSCRIBER_POSITION_COUNT_OFFSET = SUBSCRIBER_POSITION_BLOCK_LENGTH_OFFSET + SIZE_OF_INT;
     private static final int SUBSCRIBER_POSITIONS_OFFSET = SUBSCRIBER_POSITION_COUNT_OFFSET + SIZE_OF_INT;
 
-    private static final int SUBSCRIBER_POSITION_BLOCK_LENGTH = SIZE_OF_LONG + SIZE_OF_INT;
+    private static final int SUBSCRIBER_POSITION_BLOCK_LENGTH = SIZE_OF_INT + SIZE_OF_INT + SIZE_OF_LONG;
 
     private MutableDirectBuffer buffer;
     private int offset;
@@ -222,7 +226,7 @@
      */
     public ImageBuffersReadyFlyweight positionIndicatorRegistrationId(final int index, final long id)
     {
-        buffer.putLong(offset + subscriberPositionOffset(index) + SIZE_OF_INT, id);
+        buffer.putLong(offset + subscriberPositionOffset(index) + (SIZE_OF_INT * 2), id);
 
         return this;
     }
@@ -235,7 +239,7 @@
      */
     public long positionIndicatorRegistrationId(final int index)
     {
-        return buffer.getLong(offset + subscriberPositionOffset(index) + SIZE_OF_INT);
+        return buffer.getLong(offset + subscriberPositionOffset(index) + (SIZE_OF_INT * 2));
     }
 
     /**

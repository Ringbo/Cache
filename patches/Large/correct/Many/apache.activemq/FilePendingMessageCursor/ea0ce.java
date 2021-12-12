diff --git a/activemq-core/src/main/java/org/apache/activemq/broker/region/cursors/FilePendingMessageCursor.java b/activemq-core/src/main/java/org/apache/activemq/broker/region/cursors/FilePendingMessageCursor.java
index 4f8b479..6beba00 100755
--- a/activemq-core/src/main/java/org/apache/activemq/broker/region/cursors/FilePendingMessageCursor.java
+++ b/activemq-core/src/main/java/org/apache/activemq/broker/region/cursors/FilePendingMessageCursor.java
@@ -230,7 +230,8 @@
         } else {
             discard(node);
         }
-        return false;
+        //message expired
+        return true;
     }
 
     /**

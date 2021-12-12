diff --git a/graylog2-server/src/main/java/org/graylog2/streams/StreamServiceImpl.java b/graylog2-server/src/main/java/org/graylog2/streams/StreamServiceImpl.java
index 1c4645e..93c744a 100644
--- a/graylog2-server/src/main/java/org/graylog2/streams/StreamServiceImpl.java
+++ b/graylog2-server/src/main/java/org/graylog2/streams/StreamServiceImpl.java
@@ -323,8 +323,7 @@
         DBObject modify = new BasicDBObject("$pull", new BasicDBObject(StreamImpl.FIELD_OUTPUTS, outputId));
 
         collection(StreamImpl.class).update(
-                match,
-                modify
+                match, modify, false, true
         );
     }
 }

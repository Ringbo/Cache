diff --git a/heron/api/src/java/org/apache/heron/api/serializer/JavaSerializer.java b/heron/api/src/java/org/apache/heron/api/serializer/JavaSerializer.java
index 79a5d61..75a1fba 100644
--- a/heron/api/src/java/org/apache/heron/api/serializer/JavaSerializer.java
+++ b/heron/api/src/java/org/apache/heron/api/serializer/JavaSerializer.java
@@ -40,7 +40,7 @@
       oos.writeObject(object);
       oos.flush();
     } catch (IOException e) {
-      throw new RuntimeException(e);
+      throw new RuntimeException("Failed to serialize object: " + object.toString(), e);
     }
     return bos.toByteArray();
   }

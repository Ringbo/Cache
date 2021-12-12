diff --git a/core/src/main/java/org/elasticsearch/index/mapper/object/ObjectMapper.java b/core/src/main/java/org/elasticsearch/index/mapper/object/ObjectMapper.java
index fc47fc5..9dc1a1d 100644
--- a/core/src/main/java/org/elasticsearch/index/mapper/object/ObjectMapper.java
+++ b/core/src/main/java/org/elasticsearch/index/mapper/object/ObjectMapper.java
@@ -355,7 +355,7 @@
         try {
             clone = (ObjectMapper) super.clone();
         } catch (CloneNotSupportedException e) {
-            throw new RuntimeException();
+            throw new RuntimeException(e);
         }
         return clone;
     }

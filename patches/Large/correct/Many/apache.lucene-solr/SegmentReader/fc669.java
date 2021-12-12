diff --git a/src/java/org/apache/lucene/index/SegmentReader.java b/src/java/org/apache/lucene/index/SegmentReader.java
index 7d69a05..aea1b63 100644
--- a/src/java/org/apache/lucene/index/SegmentReader.java
+++ b/src/java/org/apache/lucene/index/SegmentReader.java
@@ -100,7 +100,7 @@
                            SegmentReader.class.getName());
       IMPL = Class.forName(name);
     } catch (ClassNotFoundException e) {
-      throw new RuntimeException("cannot load SegmentReader class: " + e.getMessage());
+      throw new RuntimeException("cannot load SegmentReader class: " + e.toString());
     }
   }
 
@@ -123,7 +123,7 @@
     try {
       instance = (SegmentReader)IMPL.newInstance();
     } catch (Exception e) {
-      throw new RuntimeException("cannot load SegmentReader class: " + e.getMessage());
+      throw new RuntimeException("cannot load SegmentReader class: " + e.toString());
     }
     instance.init(dir, sis, closeDir, ownDir);
     instance.initialize(si);

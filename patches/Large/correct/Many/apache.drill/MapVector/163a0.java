diff --git a/exec/vector/src/main/java/org/apache/drill/exec/vector/complex/MapVector.java b/exec/vector/src/main/java/org/apache/drill/exec/vector/complex/MapVector.java
index 8447893..af1ec8e 100644
--- a/exec/vector/src/main/java/org/apache/drill/exec/vector/complex/MapVector.java
+++ b/exec/vector/src/main/java/org/apache/drill/exec/vector/complex/MapVector.java
@@ -277,7 +277,10 @@
       bufOffset += child.getBufferLength();
     }
 
-    assert bufOffset == buf.capacity();
+    // We should have consumed all bytes written into the buffer
+    // during deserialization.
+
+    assert bufOffset == buf.writerIndex();
   }
 
   @Override

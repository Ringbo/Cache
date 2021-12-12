diff --git a/java/org/apache/catalina/connector/InputBuffer.java b/java/org/apache/catalina/connector/InputBuffer.java
index 53ccd39..5d4c15a 100644
--- a/java/org/apache/catalina/connector/InputBuffer.java
+++ b/java/org/apache/catalina/connector/InputBuffer.java
@@ -380,7 +380,7 @@
         } else {
             // Make sure there's enough space in the worst case
             cb.makeSpace(bb.getLength());
-            if ((cb.getBuffer().length - cb.getEnd()) == 0) {
+            if ((cb.getBuffer().length - cb.getEnd()) == 0 && bb.getLength() != 0) {
                 // We went over the limit
                 cb.setOffset(0);
                 cb.setEnd(0);

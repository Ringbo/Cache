diff --git a/src/java/org/apache/lucene/index/DocumentWriter.java b/src/java/org/apache/lucene/index/DocumentWriter.java
index d2b407e..60819ac 100644
--- a/src/java/org/apache/lucene/index/DocumentWriter.java
+++ b/src/java/org/apache/lucene/index/DocumentWriter.java
@@ -171,7 +171,7 @@
                 addPosition(fieldName, t.termText(), position++, null);
               
               lastToken = t;
-              if (++length > maxFieldLength) {
+              if (++length >= maxFieldLength) {
                 if (infoStream != null)
                   infoStream.println("maxFieldLength " +maxFieldLength+ " reached, ignoring following tokens");
                 break;

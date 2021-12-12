diff --git a/lucene/core/src/java/org/apache/lucene/util/CharsRefBuilder.java b/lucene/core/src/java/org/apache/lucene/util/CharsRefBuilder.java
index 1c2e102..b617306 100644
--- a/lucene/core/src/java/org/apache/lucene/util/CharsRefBuilder.java
+++ b/lucene/core/src/java/org/apache/lucene/util/CharsRefBuilder.java
@@ -68,7 +68,7 @@
   }
 
   @Override
-  public Appendable append(CharSequence csq) {
+  public CharsRefBuilder append(CharSequence csq) {
     if (csq == null) {
       return append(NULL_STRING);
     }
@@ -76,7 +76,7 @@
   }
 
   @Override
-  public Appendable append(CharSequence csq, int start, int end) {
+  public CharsRefBuilder append(CharSequence csq, int start, int end) {
     if (csq == null) {
       return append(NULL_STRING);
     }
@@ -88,7 +88,7 @@
   }
 
   @Override
-  public Appendable append(char c) {
+  public CharsRefBuilder append(char c) {
     grow(ref.length + 1);
     setCharAt(ref.length++, c);
     return this;

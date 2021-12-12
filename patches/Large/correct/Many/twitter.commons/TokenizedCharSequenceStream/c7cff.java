diff --git a/src/java/com/twitter/common/text/token/TokenizedCharSequenceStream.java b/src/java/com/twitter/common/text/token/TokenizedCharSequenceStream.java
index 2f6f820..9d49697 100644
--- a/src/java/com/twitter/common/text/token/TokenizedCharSequenceStream.java
+++ b/src/java/com/twitter/common/text/token/TokenizedCharSequenceStream.java
@@ -69,7 +69,7 @@
   public TokenizedCharSequenceStream() {
     super(new TwitterTokenStream() {
       @Override
-      public boolean incrementToken() {
+      public final boolean incrementToken() {
         return false;
       }
 

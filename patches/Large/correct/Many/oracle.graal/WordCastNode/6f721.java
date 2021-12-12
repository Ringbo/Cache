diff --git a/graal/com.oracle.graal.word/src/com/oracle/graal/word/nodes/WordCastNode.java b/graal/com.oracle.graal.word/src/com/oracle/graal/word/nodes/WordCastNode.java
index aea567c..2b8466c 100644
--- a/graal/com.oracle.graal.word/src/com/oracle/graal/word/nodes/WordCastNode.java
+++ b/graal/com.oracle.graal.word/src/com/oracle/graal/word/nodes/WordCastNode.java
@@ -49,7 +49,7 @@
         return new WordCastNode(StampFactory.forKind(wordKind), input);
     }
 
-    private WordCastNode(Stamp stamp, ValueNode input) {
+    WordCastNode(Stamp stamp, ValueNode input) {
         super(stamp);
         this.input = input;
     }

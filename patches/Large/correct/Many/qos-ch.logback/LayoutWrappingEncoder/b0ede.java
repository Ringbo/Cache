diff --git a/logback-core/src/main/java/ch/qos/logback/core/encoder/LayoutWrappingEncoder.java b/logback-core/src/main/java/ch/qos/logback/core/encoder/LayoutWrappingEncoder.java
index f45d487..560e4b1 100644
--- a/logback-core/src/main/java/ch/qos/logback/core/encoder/LayoutWrappingEncoder.java
+++ b/logback-core/src/main/java/ch/qos/logback/core/encoder/LayoutWrappingEncoder.java
@@ -150,7 +150,7 @@
      * 
      * @param appender
      */
-    public void setParent(OutputStreamAppender<?> parent) {
+    public void setParent(Appender<?> parent) {
         this.parent = parent;
     }
 }

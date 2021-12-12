diff --git a/source-kafka/src/main/java/org/apache/kylin/source/kafka/DefaultTimeParser.java b/source-kafka/src/main/java/org/apache/kylin/source/kafka/DefaultTimeParser.java
index 4bcd572..3b85b0b 100644
--- a/source-kafka/src/main/java/org/apache/kylin/source/kafka/DefaultTimeParser.java
+++ b/source-kafka/src/main/java/org/apache/kylin/source/kafka/DefaultTimeParser.java
@@ -41,7 +41,7 @@
             t = 0;
         } else {
             try {
-                t = Long.valueOf(time);
+                t = Long.parseLong(time);
             } catch (NumberFormatException e) {
                 throw new IllegalArgumentException(e);
             }

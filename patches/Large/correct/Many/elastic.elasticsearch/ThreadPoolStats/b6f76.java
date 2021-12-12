diff --git a/src/main/java/org/elasticsearch/threadpool/ThreadPoolStats.java b/src/main/java/org/elasticsearch/threadpool/ThreadPoolStats.java
index bdb288b..2dcf9c8 100644
--- a/src/main/java/org/elasticsearch/threadpool/ThreadPoolStats.java
+++ b/src/main/java/org/elasticsearch/threadpool/ThreadPoolStats.java
@@ -153,7 +153,7 @@
                 builder.field(Fields.REJECTED, rejected);
             }
             if (largest != -1) {
-                builder.field(Fields.LARGEST, rejected);
+                builder.field(Fields.LARGEST, largest);
             }
             if (completed != -1) {
                 builder.field(Fields.COMPLETED, completed);

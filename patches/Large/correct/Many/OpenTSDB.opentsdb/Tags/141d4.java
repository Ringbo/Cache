diff --git a/src/core/Tags.java b/src/core/Tags.java
index a65ff51..63aabd4 100644
--- a/src/core/Tags.java
+++ b/src/core/Tags.java
@@ -104,7 +104,7 @@
     final int len = metric.length();
     if (metric.charAt(len - 1) != '}') {  // "foo{"
       throw new IllegalArgumentException("Missing '}' at the end of: " + metric);
-    } else if (curly == len - 1) {  // "foo{}"
+    } else if (curly == len - 2) {  // "foo{}"
       return metric.substring(0, len - 2);
     }
     // substring the tags out of "foo{a=b,...,x=y}" and parse them.

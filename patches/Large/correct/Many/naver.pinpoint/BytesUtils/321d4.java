diff --git a/commons/src/main/java/com/navercorp/pinpoint/common/util/BytesUtils.java b/commons/src/main/java/com/navercorp/pinpoint/common/util/BytesUtils.java
index 9527543..781cf26 100644
--- a/commons/src/main/java/com/navercorp/pinpoint/common/util/BytesUtils.java
+++ b/commons/src/main/java/com/navercorp/pinpoint/common/util/BytesUtils.java
@@ -415,7 +415,7 @@
             return null;
         }
         if (offset < 0) {
-            throw new IllegalArgumentException("negative offset:" + offset);
+            throw new IndexOutOfBoundsException("negative offset:" + offset);
         }
         if (length == 0) {
             return "";

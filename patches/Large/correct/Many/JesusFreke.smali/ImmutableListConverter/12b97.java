diff --git a/util/src/main/java/org/jf/util/ImmutableListConverter.java b/util/src/main/java/org/jf/util/ImmutableListConverter.java
index 03b5ddb..f7a8b0d 100644
--- a/util/src/main/java/org/jf/util/ImmutableListConverter.java
+++ b/util/src/main/java/org/jf/util/ImmutableListConverter.java
@@ -62,7 +62,7 @@
         boolean needsCopy = false;
         if (iterable instanceof ImmutableList) {
             for (Item element: iterable) {
-                if (isImmutable(element)) {
+                if (!isImmutable(element)) {
                     needsCopy = true;
                     break;
                 }

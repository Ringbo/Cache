diff --git a/presto-main/src/test/java/com/facebook/presto/block/BlockAssertions.java b/presto-main/src/test/java/com/facebook/presto/block/BlockAssertions.java
index 6370303..4ec778a 100644
--- a/presto-main/src/test/java/com/facebook/presto/block/BlockAssertions.java
+++ b/presto-main/src/test/java/com/facebook/presto/block/BlockAssertions.java
@@ -144,7 +144,7 @@
         }
         int[] ids = new int[length];
         for (int i = 0; i < length; i++) {
-            ids[i] = length % dictionarySize;
+            ids[i] = i % dictionarySize;
         }
         return new DictionaryBlock(length, builder.build(), wrappedIntArray(ids));
     }
@@ -254,7 +254,7 @@
         }
         int[] ids = new int[length];
         for (int i = 0; i < length; i++) {
-            ids[i] = length % dictionarySize;
+            ids[i] = i % dictionarySize;
         }
         return new DictionaryBlock(length, builder.build(), wrappedIntArray(ids));
     }

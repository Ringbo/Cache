diff --git a/dexlib2/src/main/java/org/jf/dexlib2/writer/ProtoPool.java b/dexlib2/src/main/java/org/jf/dexlib2/writer/ProtoPool.java
index 9e026c3..b1dee40 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/writer/ProtoPool.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/writer/ProtoPool.java
@@ -168,7 +168,7 @@
         public int compareTo(@Nonnull Key o) {
             int res = getReturnType().compareTo(o.getReturnType());
             if (res != 0) return res;
-            return CollectionUtils.compareAsList(getParameters(), o.getParameters());
+            return CollectionUtils.compareAsIterable(getParameters(), o.getParameters());
         }
     }
 }

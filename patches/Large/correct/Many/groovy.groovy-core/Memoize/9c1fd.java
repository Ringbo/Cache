diff --git a/src/main/org/codehaus/groovy/runtime/memoize/Memoize.java b/src/main/org/codehaus/groovy/runtime/memoize/Memoize.java
index e43fd9a..9c53ed3 100644
--- a/src/main/org/codehaus/groovy/runtime/memoize/Memoize.java
+++ b/src/main/org/codehaus/groovy/runtime/memoize/Memoize.java
@@ -153,7 +153,7 @@
                 if (result == null) {
                     result = MEMOIZE_NULL;
                 }
-                cache.put(key, new SoftReference(result));
+                cache.put(key, new SoftReference(result, queue));
             }
             lruProtectionStorage.touch(key, result);
             return result == MEMOIZE_NULL ? null : (V) result;

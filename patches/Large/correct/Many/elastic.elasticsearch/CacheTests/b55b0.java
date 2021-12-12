diff --git a/server/src/test/java/org/elasticsearch/common/cache/CacheTests.java b/server/src/test/java/org/elasticsearch/common/cache/CacheTests.java
index 3b183cc..a2e47e6 100644
--- a/server/src/test/java/org/elasticsearch/common/cache/CacheTests.java
+++ b/server/src/test/java/org/elasticsearch/common/cache/CacheTests.java
@@ -471,7 +471,7 @@
                     keys.add(key);
                 } else {
                     // invalidate with incorrect value
-                    cache.invalidate(key, Integer.toString(key * randomIntBetween(2, 10)));
+                    cache.invalidate(key, Integer.toString(key + randomIntBetween(2, 10)));
                 }
             }
         }
@@ -506,7 +506,7 @@
                     invalidated.add(i);
                 } else {
                     // invalidate with incorrect value
-                    cache.invalidate(i, Integer.toString(i * randomIntBetween(2, 10)));
+                    cache.invalidate(i, Integer.toString(i + randomIntBetween(2, 10)));
                 }
             }
         }

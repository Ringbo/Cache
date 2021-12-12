diff --git a/src/jvm/storm/starter/TransactionalWords.java b/src/jvm/storm/starter/TransactionalWords.java
index 674600f..0252b66 100644
--- a/src/jvm/storm/starter/TransactionalWords.java
+++ b/src/jvm/storm/starter/TransactionalWords.java
@@ -114,7 +114,7 @@
                         newVal.count = val.count;
                     }
                     newVal.count = newVal.count + _counts.get(key);
-                    COUNT_DATABASE.put(key, val);
+                    COUNT_DATABASE.put(key, newVal);
                 } else {
                     newVal = val;
                 }

diff --git a/src/main/org/codehaus/groovy/util/AbstractConcurrentDoubleKeyMap.java b/src/main/org/codehaus/groovy/util/AbstractConcurrentDoubleKeyMap.java
index 6137efc..e83b641 100644
--- a/src/main/org/codehaus/groovy/util/AbstractConcurrentDoubleKeyMap.java
+++ b/src/main/org/codehaus/groovy/util/AbstractConcurrentDoubleKeyMap.java
@@ -140,9 +140,9 @@
                         }
                         final Object[] newArr = new Object[arr.length+1];
                         final Entry<K1,K2,V> res = createEntry(key1,key2, hash);
-                        arr [0] = res;
+                        newArr[0] = res;
                         System.arraycopy(arr, 0, newArr, 1, arr.length);
-                        tab[index] = arr;
+                        tab[index] = newArr;
                         count++; // write-volatile
                         return res;
                     }

diff --git a/src/main/java/org/mapdb/tree/BTreeMapJava.java b/src/main/java/org/mapdb/tree/BTreeMapJava.java
index 78baff2..f19c9a2 100644
--- a/src/main/java/org/mapdb/tree/BTreeMapJava.java
+++ b/src/main/java/org/mapdb/tree/BTreeMapJava.java
@@ -110,12 +110,12 @@
                 // compare directory size
                 if( keysLen - 1 + intLeftEdge() + intRightEdge() !=
                         ((long[]) values).length) {
-                    throw new AssertionError();
+                    throw new IllegalStateException();
                 }
             } else{
                 // compare leaf size
                 if (keysLen != valueSerializer.valueArraySize(values) + 2 - intLeftEdge() - intRightEdge() - intLastKeyTwice()) {
-                    throw new AssertionError();
+                    throw new IllegalStateException();
                 }
             }
 
@@ -127,9 +127,9 @@
                             keySerializer.valueArrayGet(keys, i-1),
                             keySerializer.valueArrayGet(keys, i));
                     if(c>0)
-                        throw new AssertionError();
+                        throw new IllegalStateException();
                     if(c==0 && i!=keysLen-1)
-                        throw new AssertionError();
+                        throw new IllegalStateException();
                 }
             }
         }

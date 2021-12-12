diff --git a/domain/src/main/java/org/jboss/as/model/AbstractModelElement.java b/domain/src/main/java/org/jboss/as/model/AbstractModelElement.java
index 40ae9d0..129a28e 100644
--- a/domain/src/main/java/org/jboss/as/model/AbstractModelElement.java
+++ b/domain/src/main/java/org/jboss/as/model/AbstractModelElement.java
@@ -104,7 +104,7 @@
     private static final Comparator<Object> NATURAL = new Comparator<Object>() {
         @SuppressWarnings("unchecked")
         public int compare(final Object o1, final Object o2) {
-            return ((Comparable<Object>) o1).compareTo(o2);
+            return ((Comparable) o1).compareTo(o2);
         }
     };
 
@@ -165,7 +165,7 @@
                     if (! theirIterator.hasNext()) {
                         break;
                     }
-                    ours = theirIterator.next();
+                    theirs = theirIterator.next();
                 }
             }
         }

diff --git a/jme3-core/src/main/java/com/jme3/util/clone/Cloner.java b/jme3-core/src/main/java/com/jme3/util/clone/Cloner.java
index 4b81200..3cc2b55 100644
--- a/jme3-core/src/main/java/com/jme3/util/clone/Cloner.java
+++ b/jme3-core/src/main/java/com/jme3/util/clone/Cloner.java
@@ -207,10 +207,10 @@
 
         // Check the index to see if we already have it
         Object clone = index.get(object);
-        if( clone != null ) {
+        if( clone != null || index.containsKey(object) ) {
             if( log.isLoggable(Level.FINER) ) {
                 log.finer("cloned:" + object.getClass() + "@" + System.identityHashCode(object)
-                            + " as cached:" + clone.getClass() + "@" + System.identityHashCode(clone));
+                            + " as cached:" + (clone == null ? "null" : (clone.getClass() + "@" + System.identityHashCode(clone))));
             }
             return type.cast(clone);
         }

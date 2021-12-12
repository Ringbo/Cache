diff --git a/src/jvm/clojure/lang/PersistentHashMap.java b/src/jvm/clojure/lang/PersistentHashMap.java
index bd44af8..3fbabca 100644
--- a/src/jvm/clojure/lang/PersistentHashMap.java
+++ b/src/jvm/clojure/lang/PersistentHashMap.java
@@ -770,7 +770,7 @@
 	private HashCollisionNode ensureEditable(AtomicReference<Thread> edit){
 		if(this.edit == edit)
 			return this;
-		return new HashCollisionNode(edit, count, hash, array);
+		return new HashCollisionNode(edit, hash, count, array);
 	}
 
 	private HashCollisionNode ensureEditable(AtomicReference<Thread> edit, int count, Object[] array){
@@ -778,7 +778,7 @@
 			this.array = array;
 			return this;
 		}
-		return new HashCollisionNode(edit, count, hash, array);
+		return new HashCollisionNode(edit, hash, count, array);
 	}
 
 	private HashCollisionNode editAndSet(AtomicReference<Thread> edit, int i, Object a) {

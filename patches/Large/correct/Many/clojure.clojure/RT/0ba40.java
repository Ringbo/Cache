diff --git a/src/jvm/clojure/lang/RT.java b/src/jvm/clojure/lang/RT.java
index a5da74a..277e62b 100644
--- a/src/jvm/clojure/lang/RT.java
+++ b/src/jvm/clojure/lang/RT.java
@@ -476,7 +476,7 @@
 	else {
 		Class c = coll.getClass();
 		Class sc = c.getSuperclass();
-		throw new IllegalArgumentException("Don't know how to create ISeq from: " + c.getSimpleName());
+		throw new IllegalArgumentException("Don't know how to create ISeq from: " + c.getName());
 	}
 }
 

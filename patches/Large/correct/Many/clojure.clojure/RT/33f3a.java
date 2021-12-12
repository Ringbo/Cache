diff --git a/src/jvm/clojure/lang/RT.java b/src/jvm/clojure/lang/RT.java
index cb72373..3053b57 100644
--- a/src/jvm/clojure/lang/RT.java
+++ b/src/jvm/clojure/lang/RT.java
@@ -441,7 +441,7 @@
 	else if(key instanceof Number && (coll instanceof String || coll.getClass().isArray()))
 		{
 		int n = ((Number) key).intValue();
-		if(n < count(coll))
+		if(n >= 0 && n < count(coll))
 			return nth(coll, n);
 		return null;
 		}

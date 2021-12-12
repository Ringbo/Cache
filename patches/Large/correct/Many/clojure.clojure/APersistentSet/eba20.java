diff --git a/src/jvm/clojure/lang/APersistentSet.java b/src/jvm/clojure/lang/APersistentSet.java
index d40ff98..7cf94c3 100644
--- a/src/jvm/clojure/lang/APersistentSet.java
+++ b/src/jvm/clojure/lang/APersistentSet.java
@@ -121,7 +121,7 @@
 			{
 			a[i] = s.first();
 			}
-		if(a.length >= count())
+		if(a.length > count())
 			a[count()] = null;
 		return a;
 		}

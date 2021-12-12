diff --git a/src/jvm/clojure/lang/APersistentMap.java b/src/jvm/clojure/lang/APersistentMap.java
index 7df6986..b112d98 100644
--- a/src/jvm/clojure/lang/APersistentMap.java
+++ b/src/jvm/clojure/lang/APersistentMap.java
@@ -205,7 +205,7 @@
 			{
 			a[i] = s.first();
 			}
-		if(a.length >= count())
+		if(a.length > count())
 			a[count()] = null;
 		return a;
 		}

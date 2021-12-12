diff --git a/src/jvm/clojure/lang/ASeq.java b/src/jvm/clojure/lang/ASeq.java
index 67e2b77..d19c890 100644
--- a/src/jvm/clojure/lang/ASeq.java
+++ b/src/jvm/clojure/lang/ASeq.java
@@ -124,7 +124,7 @@
 			{
 			a[i] = s.first();
 			}
-		if(a.length >= count())
+		if(a.length > count())
 			a[count()] = null;
 		return a;
 		}

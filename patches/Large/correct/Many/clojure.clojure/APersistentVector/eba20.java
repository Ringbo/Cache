diff --git a/src/jvm/clojure/lang/APersistentVector.java b/src/jvm/clojure/lang/APersistentVector.java
index d0ae351..54f6834 100644
--- a/src/jvm/clojure/lang/APersistentVector.java
+++ b/src/jvm/clojure/lang/APersistentVector.java
@@ -287,7 +287,7 @@
 			{
 			a[i] = s.first();
 			}
-		if(a.length >= count())
+		if(a.length > count())
 			a[count()] = null;
 		return a;
 		}

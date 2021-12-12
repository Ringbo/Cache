diff --git a/src/jvm/clojure/lang/PersistentVector.java b/src/jvm/clojure/lang/PersistentVector.java
index 4e93dc9..3910d11 100644
--- a/src/jvm/clojure/lang/PersistentVector.java
+++ b/src/jvm/clojure/lang/PersistentVector.java
@@ -324,7 +324,7 @@
 		{
 		return (PersistentVector) EMPTY.withMeta(meta());
 		}
-	if(newroot.length == 1)
+	if(shift > 0 && newroot.length == 1)
 		{
 		newroot = (Object[]) newroot[0];
 		newshift -= 5;

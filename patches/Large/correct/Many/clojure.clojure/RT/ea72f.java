diff --git a/src/jvm/clojure/lang/RT.java b/src/jvm/clojure/lang/RT.java
index e743228..eb0368f 100644
--- a/src/jvm/clojure/lang/RT.java
+++ b/src/jvm/clojure/lang/RT.java
@@ -941,7 +941,7 @@
 		}
 	if(x == null)
 		w.write("nil");
-	else if(x instanceof ISeq)
+	else if(x instanceof ISeq || x instanceof IPersistentList)
 		{
 		w.write('(');
 		printInnerSeq(seq(x), w);

diff --git a/src/jvm/clojure/lang/LispReader.java b/src/jvm/clojure/lang/LispReader.java
index dc8be57..d4d03f8 100644
--- a/src/jvm/clojure/lang/LispReader.java
+++ b/src/jvm/clojure/lang/LispReader.java
@@ -684,7 +684,7 @@
 		else
 			ret = RT.list(Compiler.QUOTE, form);
 
-		if(form instanceof IObj && ((IObj) form).meta() != null)
+		if(form instanceof IObj && !(form instanceof Var) && ((IObj) form).meta() != null)
 			{
 			//filter line numbers
 			IPersistentMap newMeta = ((IObj) form).meta().without(RT.LINE_KEY);

diff --git a/src/jvm/clojure/lang/Symbol.java b/src/jvm/clojure/lang/Symbol.java
index dac4a48..001043d 100644
--- a/src/jvm/clojure/lang/Symbol.java
+++ b/src/jvm/clojure/lang/Symbol.java
@@ -42,7 +42,7 @@
 
 static public Symbol intern(String nsname){
 	int i = nsname.lastIndexOf('/');
-	if(i == -1)
+	if(i == -1 || nsname.equals("/"))
 		return new Symbol(null, nsname.intern());
 	else
 		return new Symbol(nsname.substring(0, i).intern(), nsname.substring(i + 1).intern());

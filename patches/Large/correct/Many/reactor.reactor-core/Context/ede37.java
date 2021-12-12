diff --git a/reactor-core/src/main/java/reactor/util/context/Context.java b/reactor-core/src/main/java/reactor/util/context/Context.java
index 90943f8..863abcb 100644
--- a/reactor-core/src/main/java/reactor/util/context/Context.java
+++ b/reactor-core/src/main/java/reactor/util/context/Context.java
@@ -112,7 +112,7 @@
 	@Nullable
 	default <T> T get(Class<T> key){
 		T v = get((Object)key);
-		if(key.isInstance(key)){
+		if(key.isInstance(v)){
 			return v;
 		}
 		return null;

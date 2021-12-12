diff --git a/src/jvm/clojure/lang/ProxyHandler.java b/src/jvm/clojure/lang/ProxyHandler.java
index 2e67d5b..832deef 100644
--- a/src/jvm/clojure/lang/ProxyHandler.java
+++ b/src/jvm/clojure/lang/ProxyHandler.java
@@ -48,7 +48,7 @@
 			return ((Number) ret).floatValue();
 		else if(rt == Double.TYPE)
 			return ((Number) ret).doubleValue();
-		else if(rt == Boolean.TYPE)
+		else if(rt == Boolean.TYPE && !(ret instanceof Boolean))
 			return ret == null ? Boolean.FALSE : Boolean.TRUE;
 		else if(rt == Byte.TYPE)
 			return (byte) ((Number) ret).intValue();

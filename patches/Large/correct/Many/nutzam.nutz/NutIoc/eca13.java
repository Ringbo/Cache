diff --git a/src/org/nutz/ioc/impl/NutIoc.java b/src/org/nutz/ioc/impl/NutIoc.java
index be89004..2a8625e 100644
--- a/src/org/nutz/ioc/impl/NutIoc.java
+++ b/src/org/nutz/ioc/impl/NutIoc.java
@@ -173,7 +173,7 @@
 	}
 
 	public void addValueProxyMaker(ValueProxyMaker vpm) {
-		vpms.add(vpm);
+		vpms.add(0,vpm);//优先使用最后加入的ValueProxyMaker
 	}
 
 	public void setMaker(ObjectMaker maker) {

diff --git a/OsmAnd-java/src/net/osmand/router/GeneralRouter.java b/OsmAnd-java/src/net/osmand/router/GeneralRouter.java
index 5719696..3919b4e 100644
--- a/OsmAnd-java/src/net/osmand/router/GeneralRouter.java
+++ b/OsmAnd-java/src/net/osmand/router/GeneralRouter.java
@@ -767,7 +767,7 @@
 			parameters.add(param);
 		}
 
-		public Object eval(BitSet types, ParameterContext paramContext) {
+		public synchronized Object eval(BitSet types, ParameterContext paramContext) {
 			if (matches(types, paramContext)) {
 				return calcSelectValue(types, paramContext);
 			}

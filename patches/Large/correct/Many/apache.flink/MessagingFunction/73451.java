diff --git a/stratosphere-addons/spargel/src/main/java/eu/stratosphere/spargel/java/MessagingFunction.java b/stratosphere-addons/spargel/src/main/java/eu/stratosphere/spargel/java/MessagingFunction.java
index c2edd6e..9ef07c4 100644
--- a/stratosphere-addons/spargel/src/main/java/eu/stratosphere/spargel/java/MessagingFunction.java
+++ b/stratosphere-addons/spargel/src/main/java/eu/stratosphere/spargel/java/MessagingFunction.java
@@ -105,7 +105,7 @@
 		
 		while (edges.hasNext()) {
 			Tuple next = (Tuple) edges.next();
-			VertexKey k = next.getField(0);
+			VertexKey k = next.getField(1);
 			outValue.f0 = k;
 			out.collect(outValue);
 		}

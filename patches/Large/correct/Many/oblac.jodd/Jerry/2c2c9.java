diff --git a/jodd-lagarto/src/main/java/jodd/jerry/Jerry.java b/jodd-lagarto/src/main/java/jodd/jerry/Jerry.java
index c374dd4..d974b69 100644
--- a/jodd-lagarto/src/main/java/jodd/jerry/Jerry.java
+++ b/jodd-lagarto/src/main/java/jodd/jerry/Jerry.java
@@ -149,7 +149,7 @@
 
 	protected Jerry(Jerry parent, Node[] nodes1, Node[] nodes2) {
 		this.parent = parent;
-		this.nodes = ArraysUtil.merge(nodes1, nodes2);
+		this.nodes = ArraysUtil.join(nodes1, nodes2);
 		this.builder = parent.builder;
 	}
 

diff --git a/sopremo/sopremo-common/src/main/java/eu/stratosphere/sopremo/type/ArrayNode.java b/sopremo/sopremo-common/src/main/java/eu/stratosphere/sopremo/type/ArrayNode.java
index 2402709..47f2dd7 100644
--- a/sopremo/sopremo-common/src/main/java/eu/stratosphere/sopremo/type/ArrayNode.java
+++ b/sopremo/sopremo-common/src/main/java/eu/stratosphere/sopremo/type/ArrayNode.java
@@ -49,12 +49,12 @@
 	}
 
 	/**
-	 * Initializes an ArrayNode which cointains all {@link IJsonNode}s from the given Collection in proper sequence.
+	 * Initializes an ArrayNode which cointains all {@link IJsonNode}s from the given Iterable in proper sequence.
 	 * 
 	 * @param nodes
 	 *        a Collection of nodes that should be added to this ArrayNode
 	 */
-	public ArrayNode(final Collection<? extends IJsonNode> nodes) {
+	public ArrayNode(final Iterable<? extends IJsonNode> nodes) {
 		this();
 		for (final IJsonNode node : nodes)
 			this.children.add(node);

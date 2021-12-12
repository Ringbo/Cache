diff --git a/jodd-lagarto/src/main/java/jodd/lagarto/dom/Node.java b/jodd-lagarto/src/main/java/jodd/lagarto/dom/Node.java
index a918baf..d371073 100644
--- a/jodd-lagarto/src/main/java/jodd/lagarto/dom/Node.java
+++ b/jodd-lagarto/src/main/java/jodd/lagarto/dom/Node.java
@@ -42,7 +42,7 @@
 
 	protected List<Node> childNodes;
 	protected int childElementNodesCount;
-	protected Node[] childElementNodes;
+	protected Element[] childElementNodes;
 
 	// siblings
 
@@ -485,7 +485,7 @@
 	/**
 	 * Returns an array of all children elements.
 	 */
-	public Node[] getChildElements() {
+	public Element[] getChildElements() {
 		initChildElementNodes();
 		return childElementNodes.clone();
 	}
@@ -507,7 +507,7 @@
 	/**
 	 * Returns a child element node at given index.
 	 */
-	public Node getChildElement(int index) {
+	public Element getChildElement(int index) {
 		initChildElementNodes();
 		if ((index < 0) || (index >= childElementNodes.length)) {
 			return null;
@@ -534,7 +534,7 @@
 	 * Returns first child <b>element</b> node or
 	 * <code>null</code> if no element children exist.
 	 */
-	public Node getFirstChildElement() {
+	public Element getFirstChildElement() {
 		initChildElementNodes();
 		if (childElementNodes.length == 0) {
 			return null;
@@ -546,15 +546,15 @@
 	 * Returns first child <b>element</b> with given name or
 	 * <code>null</code> if no such children exist.
 	 */
-	public Node getFirstChildElement(String elementName) {
+	public Element getFirstChildElement(String elementName) {
 		if (childNodes == null) {
 			return null;
 		}
 		for (int i = 0, childNodesSize = childNodes.size(); i < childNodesSize; i++) {
 			Node child = childNodes.get(i);
-			if (elementName.equals(child.getNodeName())) {
+			if (child.getNodeType() == NodeType.ELEMENT && elementName.equals(child.getNodeName())) {
 				child.initSiblingNames();
-				return child;
+				return (Element) child;
 			}
 		}
 		return null;
@@ -579,7 +579,7 @@
 	 * Returns last child <b>element</b> node or
 	 * <code>null</code> if no such child node exist.
 	 */
-	public Node getLastChildElement() {
+	public Element getLastChildElement() {
 		initChildElementNodes();
 		if (childElementNodes.length == 0) {
 			return null;
@@ -591,16 +591,16 @@
 	 * Returns last child <b>element</b> with given name or
 	 * <code>null</code> if no such child node exist.
 	 */
-	public Node getLastChildElement(String elementName) {
+	public Element getLastChildElement(String elementName) {
 		if (childNodes == null) {
 			return null;
 		}
 		int from = childNodes.size() - 1;
 		for (int i = from; i >= 0; i--) {
 			Node child = childNodes.get(i);
-			if (elementName.equals(child.getNodeName())) {
+			if (child.getNodeType() == NodeType.ELEMENT && elementName.equals(child.getNodeName())) {
 				child.initSiblingNames();
-				return child;
+				return (Element) child;
 			}
 		}
 		return null;
@@ -737,13 +737,13 @@
 	 */
 	protected void initChildElementNodes() {
 		if (childElementNodes == null) {
-			childElementNodes = new Node[childElementNodesCount];
+			childElementNodes = new Element[childElementNodesCount];
 
 			int childCount = getChildNodesCount();
 			for (int i = 0; i < childCount; i++) {
 				Node child = getChild(i);
 				if (child.siblingElementIndex >= 0) {
-					childElementNodes[child.siblingElementIndex] = child;
+					childElementNodes[child.siblingElementIndex] = (Element) child;
 				}
 			}
 		}

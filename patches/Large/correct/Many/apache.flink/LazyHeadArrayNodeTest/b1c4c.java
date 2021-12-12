diff --git a/sopremo/sopremo-common/src/test/java/eu/stratosphere/sopremo/serialization/LazyHeadArrayNodeTest.java b/sopremo/sopremo-common/src/test/java/eu/stratosphere/sopremo/serialization/LazyHeadArrayNodeTest.java
index b1aaf61..2dab078 100644
--- a/sopremo/sopremo-common/src/test/java/eu/stratosphere/sopremo/serialization/LazyHeadArrayNodeTest.java
+++ b/sopremo/sopremo-common/src/test/java/eu/stratosphere/sopremo/serialization/LazyHeadArrayNodeTest.java
@@ -12,16 +12,16 @@
 import eu.stratosphere.sopremo.type.IArrayNode;
 import eu.stratosphere.sopremo.type.IntNode;
 
-public class LazyHeadArrayNodeTest extends ArrayNodeBaseTest<LazyTailArrayNode> {
+public class LazyHeadArrayNodeTest extends ArrayNodeBaseTest<LazyHeadArrayNode> {
 
 	@Override
 	public void initArrayNode() {
-		TailArraySchema schema = new TailArraySchema();
+		HeadArraySchema schema = new HeadArraySchema();
 		schema.setHeadSize(5);
 		PactRecord record = schema.jsonToRecord(
 			new ArrayNode(IntNode.valueOf(0), IntNode.valueOf(1), IntNode.valueOf(2)), null, null);
 
-		this.node = new LazyTailArrayNode(record, schema);
+		this.node = new LazyHeadArrayNode(record, schema);
 	}
 
 	@Test

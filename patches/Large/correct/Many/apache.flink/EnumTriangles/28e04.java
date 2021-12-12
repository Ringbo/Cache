diff --git a/pact/pact-examples/src/main/java/eu/stratosphere/pact/example/graph/EnumTriangles.java b/pact/pact-examples/src/main/java/eu/stratosphere/pact/example/graph/EnumTriangles.java
index 8361b90..c15ae2c 100644
--- a/pact/pact-examples/src/main/java/eu/stratosphere/pact/example/graph/EnumTriangles.java
+++ b/pact/pact-examples/src/main/java/eu/stratosphere/pact/example/graph/EnumTriangles.java
@@ -123,7 +123,7 @@
 				edge = new Edge(new PactString(rdfObj), new PactString(rdfSubj));
 			}
 
-			target.setField(1, edge);
+			target.setField(0, edge);
 
 			LOG.debug("Read in: " + edge);
 			return true;
@@ -244,7 +244,7 @@
 		private static final Log LOG = LogFactory.getLog(CloseTriads.class);
 
 		@Override
-		public void match(PactRecord missingEdge, PactRecord triad, Collector out) throws Exception {
+		public void match(PactRecord triad, PactRecord missingEdge, Collector out) throws Exception {
 			
 			LOG.debug("Emit: " + missingEdge);
 			

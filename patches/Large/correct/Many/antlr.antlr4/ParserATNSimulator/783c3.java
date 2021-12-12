diff --git a/runtime/Java/src/org/antlr/v4/runtime/atn/ParserATNSimulator.java b/runtime/Java/src/org/antlr/v4/runtime/atn/ParserATNSimulator.java
index 175bd35..752ac84 100644
--- a/runtime/Java/src/org/antlr/v4/runtime/atn/ParserATNSimulator.java
+++ b/runtime/Java/src/org/antlr/v4/runtime/atn/ParserATNSimulator.java
@@ -771,7 +771,7 @@
 	}
 
 	protected void addDFAEdge(DFAState p, int t, DFAState q) {
-		if ( p==null ) return;
+		if ( p==null || t < -1 ) return;
 		if ( p.edges==null ) {
 			p.edges = new DFAState[atn.maxTokenType+1+1]; // TODO: make adaptive
 		}

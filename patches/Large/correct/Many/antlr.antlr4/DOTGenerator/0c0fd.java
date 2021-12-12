diff --git a/tool/src/org/antlr/v4/tool/DOTGenerator.java b/tool/src/org/antlr/v4/tool/DOTGenerator.java
index 3788310..59ade76 100644
--- a/tool/src/org/antlr/v4/tool/DOTGenerator.java
+++ b/tool/src/org/antlr/v4/tool/DOTGenerator.java
@@ -284,7 +284,7 @@
 					SetTransition set = (SetTransition)edge;
 					String label = set.label().toString();
 					if ( isLexer ) label = set.label().toString(true);
-					else if ( grammar!=null ) label = set.label().toString(grammar.getTokenNames());
+					else if ( grammar!=null ) label = set.label().toString(grammar.getTokenDisplayNames());
 					if ( edge instanceof NotSetTransition ) label = "~"+label;
 					edgeST.add("label", getEdgeLabel(label));
 				}
@@ -293,7 +293,7 @@
 					RangeTransition range = (RangeTransition)edge;
 					String label = range.label().toString();
 					if ( isLexer ) label = range.toString();
-					else if ( grammar!=null ) label = range.label().toString(grammar.getTokenNames());
+					else if ( grammar!=null ) label = range.label().toString(grammar.getTokenDisplayNames());
 					edgeST.add("label", getEdgeLabel(label));
 				}
 				else {

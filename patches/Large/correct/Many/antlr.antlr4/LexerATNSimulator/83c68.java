diff --git a/runtime/Java/src/org/antlr/v4/runtime/atn/LexerATNSimulator.java b/runtime/Java/src/org/antlr/v4/runtime/atn/LexerATNSimulator.java
index 212f2d0..f6dffa8 100644
--- a/runtime/Java/src/org/antlr/v4/runtime/atn/LexerATNSimulator.java
+++ b/runtime/Java/src/org/antlr/v4/runtime/atn/LexerATNSimulator.java
@@ -335,7 +335,7 @@
 			s = target; // flip; current DFA target becomes new src/from state
 		}
 
-		return failOrAccept(prevAccept, input, reach, t);
+		return failOrAccept(prevAccept, input, closure, t);
 	}
 
 	protected int failOrAccept(ExecState prevAccept, CharStream input,

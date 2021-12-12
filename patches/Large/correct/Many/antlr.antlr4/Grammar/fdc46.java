diff --git a/tool/src/org/antlr/v4/tool/Grammar.java b/tool/src/org/antlr/v4/tool/Grammar.java
index acf7d00..fbdcbdf 100644
--- a/tool/src/org/antlr/v4/tool/Grammar.java
+++ b/tool/src/org/antlr/v4/tool/Grammar.java
@@ -1121,7 +1121,7 @@
 
 		char[] serializedAtn = ATNSerializer.getSerializedAsChars(atn);
 		ATN deserialized = new ATNDeserializer().deserialize(serializedAtn);
-		return new LexerInterpreter(fileName, Arrays.asList(getTokenNames()), Arrays.asList(getRuleNames()), ((LexerGrammar)this).modes.keySet(), deserialized, input);
+		return new LexerInterpreter(fileName, Arrays.asList(getTokenDisplayNames()), Arrays.asList(getRuleNames()), ((LexerGrammar)this).modes.keySet(), deserialized, input);
 	}
 
 	public ParserInterpreter createParserInterpreter(TokenStream tokenStream) {
@@ -1131,6 +1131,6 @@
 
 		char[] serializedAtn = ATNSerializer.getSerializedAsChars(atn);
 		ATN deserialized = new ATNDeserializer().deserialize(serializedAtn);
-		return new ParserInterpreter(fileName, Arrays.asList(getTokenNames()), Arrays.asList(getRuleNames()), deserialized, tokenStream);
+		return new ParserInterpreter(fileName, Arrays.asList(getTokenDisplayNames()), Arrays.asList(getRuleNames()), deserialized, tokenStream);
 	}
 }

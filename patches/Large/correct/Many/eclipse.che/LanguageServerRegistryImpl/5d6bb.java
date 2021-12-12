diff --git a/wsagent/che-core-api-languageserver/src/main/java/org/eclipse/che/api/languageserver/registry/LanguageServerRegistryImpl.java b/wsagent/che-core-api-languageserver/src/main/java/org/eclipse/che/api/languageserver/registry/LanguageServerRegistryImpl.java
index 7d41098..08d6b36 100644
--- a/wsagent/che-core-api-languageserver/src/main/java/org/eclipse/che/api/languageserver/registry/LanguageServerRegistryImpl.java
+++ b/wsagent/che-core-api-languageserver/src/main/java/org/eclipse/che/api/languageserver/registry/LanguageServerRegistryImpl.java
@@ -508,7 +508,7 @@
     TextDocumentClientCapabilities textDocument = new TextDocumentClientCapabilities();
     textDocument.setCodeAction(new CodeActionCapabilities(false));
     textDocument.setCodeLens(new CodeLensCapabilities(false));
-    textDocument.setCompletion(new CompletionCapabilities(new CompletionItemCapabilities(false)));
+    textDocument.setCompletion(new CompletionCapabilities(new CompletionItemCapabilities(true)));
     textDocument.setDefinition(new DefinitionCapabilities(false));
     textDocument.setDocumentHighlight(new DocumentHighlightCapabilities(false));
     textDocument.setDocumentLink(new DocumentLinkCapabilities(false));

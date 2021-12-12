diff --git a/src/main/java/graphql/GraphQL.java b/src/main/java/graphql/GraphQL.java
index c2687e3..32634a8 100644
--- a/src/main/java/graphql/GraphQL.java
+++ b/src/main/java/graphql/GraphQL.java
@@ -492,7 +492,7 @@
         log.debug("Parsing query: '{}'...", executionInput.getQuery());
         ParseResult parseResult = parse(executionInput, graphQLSchema, instrumentationState);
         if (parseResult.isFailure()) {
-            log.error("Query failed to parse : '{}'", executionInput.getQuery());
+            log.warn("Query failed to parse : '{}'", executionInput.getQuery());
             return new PreparsedDocumentEntry(toInvalidSyntaxError(parseResult.getException()));
         } else {
             final Document document = parseResult.getDocument();
@@ -500,7 +500,7 @@
             log.debug("Validating query: '{}'", executionInput.getQuery());
             final List<ValidationError> errors = validate(executionInput, document, graphQLSchema, instrumentationState);
             if (!errors.isEmpty()) {
-                log.error("Query failed to validate : '{}'", executionInput.getQuery());
+                log.warn("Query failed to validate : '{}'", executionInput.getQuery());
                 return new PreparsedDocumentEntry(errors);
             }
 

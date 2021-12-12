diff --git a/dropwizard-jdbi/src/main/java/io/dropwizard/jdbi/NamePrependingStatementRewriter.java b/dropwizard-jdbi/src/main/java/io/dropwizard/jdbi/NamePrependingStatementRewriter.java
index 8d70a10..de670d9 100644
--- a/dropwizard-jdbi/src/main/java/io/dropwizard/jdbi/NamePrependingStatementRewriter.java
+++ b/dropwizard-jdbi/src/main/java/io/dropwizard/jdbi/NamePrependingStatementRewriter.java
@@ -8,7 +8,7 @@
 public class NamePrependingStatementRewriter implements StatementRewriter {
     private final StatementRewriter rewriter;
 
-    NamePrependingStatementRewriter(StatementRewriter rewriter) {
+    public NamePrependingStatementRewriter(StatementRewriter rewriter) {
         this.rewriter = rewriter;
     }
 

diff --git a/sql/src/main/java/io/crate/executor/transport/RerouteActions.java b/sql/src/main/java/io/crate/executor/transport/RerouteActions.java
index da5e4d9..192954e 100644
--- a/sql/src/main/java/io/crate/executor/transport/RerouteActions.java
+++ b/sql/src/main/java/io/crate/executor/transport/RerouteActions.java
@@ -51,7 +51,7 @@
 
     }
 
-    static final CompletableFuture<Long> execute(
+    public static CompletableFuture<Long> execute(
         BiConsumer<ClusterRerouteRequest, ActionListener<ClusterRerouteResponse>> rerouteAction,
         RerouteAnalyzedStatement stmt,
         Row parameters) {

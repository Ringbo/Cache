diff --git a/community/io/src/test/java/org/neo4j/adversaries/pagecache/AdversarialReadPageCursor.java b/community/io/src/test/java/org/neo4j/adversaries/pagecache/AdversarialReadPageCursor.java
index 97c0c61..9dde82f 100644
--- a/community/io/src/test/java/org/neo4j/adversaries/pagecache/AdversarialReadPageCursor.java
+++ b/community/io/src/test/java/org/neo4j/adversaries/pagecache/AdversarialReadPageCursor.java
@@ -174,7 +174,7 @@
     private AdversarialReadPageCursor linkedCursor;
     private final State state;
 
-    public AdversarialReadPageCursor( PageCursor delegate, Adversary adversary )
+    AdversarialReadPageCursor( PageCursor delegate, Adversary adversary )
     {
         super( delegate );
         this.state = new State( Objects.requireNonNull( adversary ) );

diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/newapi/NodeCursor.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/newapi/NodeCursor.java
index 254ae20..30d2f08 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/newapi/NodeCursor.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/newapi/NodeCursor.java
@@ -62,7 +62,7 @@
         this.next = 0;
         this.highMark = read.nodeHighMark();
         this.read = read;
-        if ( labelCursor != null )
+        if ( labelCursor == null )
         {
             labelCursor = read.labelCursor();
         }
@@ -82,7 +82,7 @@
         //This marks the cursor as a "single cursor"
         this.highMark = NO_ID;
         this.read = read;
-        if ( labelCursor != null )
+        if ( labelCursor == null )
         {
             labelCursor = read.labelCursor();
         }

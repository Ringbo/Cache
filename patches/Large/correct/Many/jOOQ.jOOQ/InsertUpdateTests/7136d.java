diff --git a/jOOQ-test/src/test/java/org/jooq/test/all/testcases/InsertUpdateTests.java b/jOOQ-test/src/test/java/org/jooq/test/all/testcases/InsertUpdateTests.java
index ecd1e3f..f04144d 100644
--- a/jOOQ-test/src/test/java/org/jooq/test/all/testcases/InsertUpdateTests.java
+++ b/jOOQ-test/src/test/java/org/jooq/test/all/testcases/InsertUpdateTests.java
@@ -1021,7 +1021,7 @@
         MergeFinalStep<A> q =
         create().mergeInto(TAuthor())
                 .using(select(f, l))
-                .on(TAuthor_LAST_NAME().equal(l))
+                .on(TAuthor_ID().eq(3))
                 .whenMatchedThenUpdate()
                 .set(TAuthor_FIRST_NAME(), "James")
                 .set(TAuthor_LAST_NAME(), "Dean")

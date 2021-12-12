diff --git a/presto-orc/src/test/java/com/facebook/presto/orc/TestOrcBloomFilters.java b/presto-orc/src/test/java/com/facebook/presto/orc/TestOrcBloomFilters.java
index de42d22..e6665f4 100644
--- a/presto-orc/src/test/java/com/facebook/presto/orc/TestOrcBloomFilters.java
+++ b/presto-orc/src/test/java/com/facebook/presto/orc/TestOrcBloomFilters.java
@@ -270,7 +270,7 @@
 
         // predicate consist of the bigint_0 = 1234
         TupleDomain<String> effectivePredicate = TupleDomain.fromColumnDomains(Optional.of(ImmutableList.of(column0)));
-        TupleDomain<String> emptyEffectivePredicate = TupleDomain.none();
+        TupleDomain<String> emptyEffectivePredicate = TupleDomain.all();
 
         // predicate column references
         List<ColumnReference<String>> columnReferences = ImmutableList.<ColumnReference<String>>builder()

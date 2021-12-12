diff --git a/requery-processor/src/main/java/io/requery/processor/EntityGraphValidator.java b/requery-processor/src/main/java/io/requery/processor/EntityGraphValidator.java
index 5c3a7e6..99ae79e 100644
--- a/requery-processor/src/main/java/io/requery/processor/EntityGraphValidator.java
+++ b/requery-processor/src/main/java/io/requery/processor/EntityGraphValidator.java
@@ -163,7 +163,7 @@
                     "@JunctionTable/@JoinTable annotation");
             }
             if (sourceAssociation.isPresent() && mappedAssociation.isPresent()) {
-                validator.warning("@JunctionTable should be specified on only one side of a " +
+                validator.error("@JunctionTable should be specified on only one side of a " +
                     "ManyToMany relationship");
             }
         } else if (sourceCardinality == Cardinality.ONE_TO_ONE) {

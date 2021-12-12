diff --git a/jOOQ-meta/src/main/java/org/jooq/util/oracle/OracleRoutineDefinition.java b/jOOQ-meta/src/main/java/org/jooq/util/oracle/OracleRoutineDefinition.java
index 47d7035..70d4138 100644
--- a/jOOQ-meta/src/main/java/org/jooq/util/oracle/OracleRoutineDefinition.java
+++ b/jOOQ-meta/src/main/java/org/jooq/util/oracle/OracleRoutineDefinition.java
@@ -98,7 +98,7 @@
             .where(ALL_ARGUMENTS.OWNER.equal(getSchema().getName()))
             .and(ALL_ARGUMENTS.OBJECT_NAME.equal(getName()))
             .and(ALL_ARGUMENTS.OBJECT_ID.equal(objectId))
-            .and(ALL_ARGUMENTS.OVERLOAD.equal(getOverload()))
+            .and(ALL_ARGUMENTS.OVERLOAD.isNotDistinctFrom(getOverload()))
             .and(ALL_ARGUMENTS.DATA_LEVEL.equal(BigDecimal.ZERO))
 
             // [#284] In packages, procedures without arguments may have a

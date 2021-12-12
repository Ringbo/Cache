diff --git a/presto-verifier/src/main/java/com/facebook/presto/verifier/framework/QueryRewriter.java b/presto-verifier/src/main/java/com/facebook/presto/verifier/framework/QueryRewriter.java
index 1809500..45dc3ab 100644
--- a/presto-verifier/src/main/java/com/facebook/presto/verifier/framework/QueryRewriter.java
+++ b/presto-verifier/src/main/java/com/facebook/presto/verifier/framework/QueryRewriter.java
@@ -61,15 +61,15 @@
 {
     private final SqlParser sqlParser;
     private final PrestoAction prestoAction;
-    private final List<Property> tablePropertiesOverride;
+    private final List<Property> tablePropertyOverrides;
     private final Map<TargetCluster, QualifiedName> prefixes;
 
     @Inject
-    public QueryRewriter(SqlParser sqlParser, PrestoAction prestoAction, List<Property> tablePropertiesOverride, VerifierConfig config)
+    public QueryRewriter(SqlParser sqlParser, PrestoAction prestoAction, List<Property> tablePropertyOverrides, VerifierConfig config)
     {
         this.sqlParser = requireNonNull(sqlParser, "sqlParser is null");
         this.prestoAction = requireNonNull(prestoAction, "prestoAction is null");
-        this.tablePropertiesOverride = requireNonNull(tablePropertiesOverride, "tablePropertiesOverride is null");
+        this.tablePropertyOverrides = requireNonNull(tablePropertyOverrides, "tablePropertyOverrides is null");
         this.prefixes = ImmutableMap.of(
                 CONTROL, config.getControlTablePrefix(),
                 TEST, config.getTestTablePrefix());
@@ -93,7 +93,7 @@
                             temporaryTableName,
                             createTableAsSelect.getQuery(),
                             createTableAsSelect.isNotExists(),
-                            applyPropertyOverride(createTableAsSelect.getProperties(), tablePropertiesOverride),
+                            applyPropertyOverride(createTableAsSelect.getProperties(), tablePropertyOverrides),
                             createTableAsSelect.isWithData(),
                             createTableAsSelect.getColumnAliases(),
                             createTableAsSelect.getComment()),
@@ -110,7 +110,7 @@
                                     temporaryTableName,
                                     ImmutableList.of(new LikeClause(originalTableName, Optional.of(INCLUDING))),
                                     false,
-                                    tablePropertiesOverride,
+                                    tablePropertyOverrides,
                                     Optional.empty())),
                     new Insert(
                             temporaryTableName,
@@ -127,7 +127,7 @@
                             temporaryTableName,
                             (Query) statement,
                             false,
-                            tablePropertiesOverride,
+                            tablePropertyOverrides,
                             true,
                             Optional.of(generateStorageColumnAliases((Query) statement, controlConfiguration, context)),
                             Optional.empty()),

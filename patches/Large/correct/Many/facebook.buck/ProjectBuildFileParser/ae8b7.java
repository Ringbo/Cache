diff --git a/src/com/facebook/buck/json/ProjectBuildFileParser.java b/src/com/facebook/buck/json/ProjectBuildFileParser.java
index 5fc0fcc..b55a23b 100644
--- a/src/com/facebook/buck/json/ProjectBuildFileParser.java
+++ b/src/com/facebook/buck/json/ProjectBuildFileParser.java
@@ -330,7 +330,7 @@
    */
   public List<Map<String, Object>> getAll(Path buildFile)
       throws BuildFileParseException, InterruptedException {
-    List<Map<String, Object>> result = getAllRulesAndMetaRules(buildFile);
+    ImmutableList<Map<String, Object>> result = getAllRulesAndMetaRules(buildFile);
 
     // Strip out the __includes, __configs, and __env meta rules, which are the last rules.
     return Collections.unmodifiableList(result.subList(0, result.size() - 3));
@@ -342,7 +342,7 @@
    *
    * @param buildFile should be an absolute path to a build file. Must have rootPath as its prefix.
    */
-  public List<Map<String, Object>> getAllRulesAndMetaRules(Path buildFile)
+  public ImmutableList<Map<String, Object>> getAllRulesAndMetaRules(Path buildFile)
       throws BuildFileParseException, InterruptedException {
     try {
       return getAllRulesInternal(buildFile);
@@ -353,7 +353,7 @@
   }
 
   @VisibleForTesting
-  protected List<Map<String, Object>> getAllRulesInternal(Path buildFile)
+  protected ImmutableList<Map<String, Object>> getAllRulesInternal(Path buildFile)
       throws IOException, BuildFileParseException {
     ensureNotClosed();
     initIfNeeded();
@@ -365,7 +365,7 @@
     ParseBuckFileEvent.Started parseBuckFileStarted = ParseBuckFileEvent.started(buildFile);
     buckEventBus.post(parseBuckFileStarted);
 
-    List<Map<String, Object>> values = null;
+    ImmutableList<Map<String, Object>> values = ImmutableList.of();
     String profile = "";
     try (AssertScopeExclusiveAccess.Scope scope = assertSingleThreadedParsing.scope()) {
       String buildFileString = buildFile.toString();
@@ -403,7 +403,7 @@
   }
 
   @SuppressWarnings("unchecked")
-  private static BuildFilePythonResult handleDeserializedValue(Object deserializedValue)
+  private static BuildFilePythonResult handleDeserializedValue(@Nullable Object deserializedValue)
       throws IOException {
     if (!(deserializedValue instanceof Map<?, ?>)) {
       throw new IOException(

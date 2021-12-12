diff --git a/test/com/facebook/buck/parser/ProjectBuildFileParserPoolTest.java b/test/com/facebook/buck/parser/ProjectBuildFileParserPoolTest.java
index 2ce74af..37c98b9 100644
--- a/test/com/facebook/buck/parser/ProjectBuildFileParserPoolTest.java
+++ b/test/com/facebook/buck/parser/ProjectBuildFileParserPoolTest.java
@@ -68,10 +68,10 @@
               @Override
               public ProjectBuildFileParser apply(Cell input) {
                 createCount.incrementAndGet();
-                return createMockPaser(
-                    new IAnswer<List<Map<String, Object>>>() {
+                return createMockParser(
+                    new IAnswer<ImmutableList<Map<String, Object>>>() {
                       @Override
-                      public List<Map<String, Object>> answer() throws Throwable {
+                      public ImmutableList<Map<String, Object>> answer() throws Throwable {
                         createParserLatch.countDown();
                         boolean didntTimeout = false;
                         try {
@@ -135,9 +135,9 @@
                 try {
                   EasyMock.expect(parser.getAllRulesAndMetaRules(EasyMock.anyObject(Path.class)))
                       .andAnswer(
-                          new IAnswer<List<Map<String, Object>>>() {
+                          new IAnswer<ImmutableList<Map<String, Object>>>() {
                             @Override
-                            public List<Map<String, Object>> answer() throws Throwable {
+                            public ImmutableList<Map<String, Object>> answer() throws Throwable {
                               createParserLatch.countDown();
                               createParserLatch.await();
 
@@ -192,10 +192,10 @@
                    @Override
                    public ProjectBuildFileParser apply(Cell input) {
                      final AtomicInteger sleepCallCount = new AtomicInteger(0);
-                     return createMockPaser(
-                         new IAnswer<List<Map<String, Object>>>() {
+                     return createMockParser(
+                         new IAnswer<ImmutableList<Map<String, Object>>>() {
                            @Override
-                           public List<Map<String, Object>> answer() throws Throwable {
+                           public ImmutableList<Map<String, Object>> answer() throws Throwable {
                              int numCalls = sleepCallCount.incrementAndGet();
                              Preconditions.checkState(numCalls == 1);
                              try {
@@ -227,10 +227,10 @@
     try (ProjectBuildFileParserPool parserPool =
              new ProjectBuildFileParserPool(
                  /* maxParsers */ 1,
-                 createMockPaserFactory(
-                     new IAnswer<List<Map<String, Object>>>() {
+                 createMockParserFactory(
+                     new IAnswer<ImmutableList<Map<String, Object>>>() {
                        @Override
-                       public List<Map<String, Object>> answer() throws Throwable {
+                       public ImmutableList<Map<String, Object>> answer() throws Throwable {
                          waitTillCanceled.await();
                          waitTillAllWorkIsDone.countDown();
                          return ImmutableList.of();
@@ -266,10 +266,10 @@
     try (ProjectBuildFileParserPool parserPool =
              new ProjectBuildFileParserPool(
                  /* maxParsers */ 1,
-                 createMockPaserFactory(
-                     new IAnswer<List<Map<String, Object>>>() {
+                 createMockParserFactory(
+                     new IAnswer<ImmutableList<Map<String, Object>>>() {
                        @Override
-                       public List<Map<String, Object>> answer() throws Throwable {
+                       public ImmutableList<Map<String, Object>> answer() throws Throwable {
                          firstJobRunning.countDown();
                          waitTillClosed.await();
                          return ImmutableList.of();
@@ -318,10 +318,10 @@
     try (ProjectBuildFileParserPool parserPool =
              new ProjectBuildFileParserPool(
                  /* maxParsers */ 2,
-                 createMockPaserFactory(
-                     new IAnswer<List<Map<String, Object>>>() {
+                 createMockParserFactory(
+                     new IAnswer<ImmutableList<Map<String, Object>>>() {
                        @Override
-                       public List<Map<String, Object>> answer() throws Throwable {
+                       public ImmutableList<Map<String, Object>> answer() throws Throwable {
                          if (throwWhileParsing.get()) {
                            throw new Exception(exceptionMessage);
                          }
@@ -360,8 +360,8 @@
     return futures.build();
   }
 
-  private ProjectBuildFileParser createMockPaser(
-      IAnswer<List<Map<String, Object>>> parseFn) {
+  private ProjectBuildFileParser createMockParser(
+      IAnswer<ImmutableList<Map<String, Object>>> parseFn) {
     ProjectBuildFileParser mock = EasyMock.createMock(ProjectBuildFileParser.class);
     try {
       EasyMock.expect(mock.getAllRulesAndMetaRules(EasyMock.anyObject(Path.class)))
@@ -374,17 +374,17 @@
     return mock;
   }
 
-  private Function<Cell, ProjectBuildFileParser> createMockPaserFactory(
-      final IAnswer<List<Map<String, Object>>> parseFn) {
+  private Function<Cell, ProjectBuildFileParser> createMockParserFactory(
+      final IAnswer<ImmutableList<Map<String, Object>>> parseFn) {
     return new Function<Cell, ProjectBuildFileParser>() {
       @Override
       public ProjectBuildFileParser apply(Cell input) {
         final AssertScopeExclusiveAccess exclusiveAccess =
             new AssertScopeExclusiveAccess();
-        return createMockPaser(
-            new IAnswer<List<Map<String, Object>>>() {
+        return createMockParser(
+            new IAnswer<ImmutableList<Map<String, Object>>>() {
               @Override
-              public List<Map<String, Object>> answer() throws Throwable {
+              public ImmutableList<Map<String, Object>> answer() throws Throwable {
                 try (AssertScopeExclusiveAccess.Scope scope = exclusiveAccess.scope()) {
                   return parseFn.answer();
                 }

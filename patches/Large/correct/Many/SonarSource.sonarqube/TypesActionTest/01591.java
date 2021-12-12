diff --git a/server/sonar-server/src/test/java/org/sonar/server/metric/ws/TypesActionTest.java b/server/sonar-server/src/test/java/org/sonar/server/metric/ws/TypesActionTest.java
index 2dcacee..1a8f3db 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/metric/ws/TypesActionTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/metric/ws/TypesActionTest.java
@@ -32,7 +32,7 @@
   WsTester ws;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     ws = new WsTester(new MetricsWs(new TypesAction()));
   }
 

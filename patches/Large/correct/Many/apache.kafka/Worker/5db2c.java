diff --git a/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/Worker.java b/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/Worker.java
index 8e74fec..39b69a3 100644
--- a/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/Worker.java
+++ b/connect/runtime/src/main/java/org/apache/kafka/connect/runtime/Worker.java
@@ -156,8 +156,9 @@
      * Add a new connector.
      * @param connConfig connector configuration
      * @param ctx context for the connector
+     * @param statusListener listener for notifications of connector status changes
      */
-    public void startConnector(ConnectorConfig connConfig, ConnectorContext ctx, ConnectorStatus.Listener lifecycleListener) {
+    public void startConnector(ConnectorConfig connConfig, ConnectorContext ctx, ConnectorStatus.Listener statusListener) {
         String connName = connConfig.getString(ConnectorConfig.NAME_CONFIG);
         Class<? extends Connector> connClass = getConnectorClass(connConfig.getString(ConnectorConfig.CONNECTOR_CLASS_CONFIG));
 
@@ -167,7 +168,7 @@
             throw new ConnectException("Connector with name " + connName + " already exists");
 
         final Connector connector = instantiateConnector(connClass);
-        WorkerConnector workerConnector = new WorkerConnector(connName, connector, ctx, lifecycleListener);
+        WorkerConnector workerConnector = new WorkerConnector(connName, connector, ctx, statusListener);
 
         log.info("Instantiated connector {} with version {} of type {}", connName, connector.version(), connClass.getName());
         workerConnector.initialize();
@@ -290,8 +291,9 @@
      * Add a new task.
      * @param id Globally unique ID for this task.
      * @param taskConfig the parsed task configuration
+     * @param statusListener listener for notifications of task status changes
      */
-    public void startTask(ConnectorTaskId id, TaskConfig taskConfig, TaskStatus.Listener lifecycleListener) {
+    public void startTask(ConnectorTaskId id, TaskConfig taskConfig, TaskStatus.Listener statusListener) {
         log.info("Creating task {}", id);
 
         if (tasks.containsKey(id)) {
@@ -305,7 +307,7 @@
         final Task task = instantiateTask(taskClass);
         log.info("Instantiated task {} with version {} of type {}", id, task.version(), taskClass.getName());
 
-        final WorkerTask workerTask = buildWorkerTask(id, task, lifecycleListener);
+        final WorkerTask workerTask = buildWorkerTask(id, task, statusListener);
 
         // Start the task before adding modifying any state, any exceptions are caught higher up the
         // call chain and there's no cleanup to do here

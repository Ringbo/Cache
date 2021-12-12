diff --git a/pinot-api/src/main/java/com/linkedin/pinot/client/Connection.java b/pinot-api/src/main/java/com/linkedin/pinot/client/Connection.java
index ed6b0e4..92d12f3 100644
--- a/pinot-api/src/main/java/com/linkedin/pinot/client/Connection.java
+++ b/pinot-api/src/main/java/com/linkedin/pinot/client/Connection.java
@@ -57,8 +57,9 @@
    *
    * @param statement The statement to execute
    * @return The result of the query
+   * @throws PinotClientException If an exception occurs while processing the query
    */
-  public ResultSetGroup execute(String statement) {
+  public ResultSetGroup execute(String statement) throws PinotClientException {
     BrokerResponse response = _transport.executeQuery(pickRandomBroker(), statement);
 
     if (!response.getExceptions().isEmpty()) {
@@ -73,8 +74,9 @@
    *
    * @param statement The statement to execute
    * @return A future containing the result of the query
+   * @throws PinotClientException If an exception occurs while processing the query
    */
-  public Future<ResultSetGroup> executeAsync(String statement) {
+  public Future<ResultSetGroup> executeAsync(String statement) throws PinotClientException {
     final Future<BrokerResponse> responseFuture = _transport.executeQueryAsync(pickRandomBroker(), statement);
 
     return new Future<ResultSetGroup>() {

diff --git a/src/main/java/org/apache/hadoop/hbase/master/ServerManager.java b/src/main/java/org/apache/hadoop/hbase/master/ServerManager.java
index a8344e2..de75519 100644
--- a/src/main/java/org/apache/hadoop/hbase/master/ServerManager.java
+++ b/src/main/java/org/apache/hadoop/hbase/master/ServerManager.java
@@ -506,7 +506,8 @@
    * @param server server to open a region
    * @param region region to open
    */
-  public void sendRegionOpen(HServerInfo server, HRegionInfo region) {
+  public void sendRegionOpen(HServerInfo server, HRegionInfo region) 
+  throws IOException {
     HRegionInterface hri = getServerConnection(server);
     if (hri == null) {
       LOG.warn("Attempting to send OPEN RPC to server " + server.getServerName()
@@ -524,7 +525,8 @@
    * @param server server to open a region
    * @param regions regions to open
    */
-  public void sendRegionOpen(HServerInfo server, List<HRegionInfo> regions) {
+  public void sendRegionOpen(HServerInfo server, List<HRegionInfo> regions)
+  throws IOException {
     HRegionInterface hri = getServerConnection(server);
     if (hri == null) {
       LOG.warn("Attempting to send OPEN RPC to server " + server.getServerName()

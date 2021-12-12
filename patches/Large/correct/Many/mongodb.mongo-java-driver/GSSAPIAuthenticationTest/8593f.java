diff --git a/driver/src/test/functional/com/mongodb/client/GSSAPIAuthenticationTest.java b/driver/src/test/functional/com/mongodb/client/GSSAPIAuthenticationTest.java
index 065893e..95f2343 100644
--- a/driver/src/test/functional/com/mongodb/client/GSSAPIAuthenticationTest.java
+++ b/driver/src/test/functional/com/mongodb/client/GSSAPIAuthenticationTest.java
@@ -44,7 +44,7 @@
 
     @Test(expected = CommandFailureException.class)
     public void testUnsuccessfulAuthorization() throws InterruptedException, UnknownHostException {
-        MongoClient client = new MongoClient();
+        MongoClient client = new MongoClient(getPrimary());
         MongoCollection<Document> collection = client.getDatabase(getConnectionString().getDatabase()).getCollection("test");
         try {
             collection.find().count();

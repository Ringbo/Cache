diff --git a/src/test/java/com/google/devtools/build/lib/remote/blobstore/http/HttpBlobStoreTest.java b/src/test/java/com/google/devtools/build/lib/remote/blobstore/http/HttpBlobStoreTest.java
index 7ef77ed..7854cb5 100644
--- a/src/test/java/com/google/devtools/build/lib/remote/blobstore/http/HttpBlobStoreTest.java
+++ b/src/test/java/com/google/devtools/build/lib/remote/blobstore/http/HttpBlobStoreTest.java
@@ -96,7 +96,7 @@
 
       Credentials credentials = newCredentials();
       HttpBlobStore blobStore =
-          new HttpBlobStore(new URI("http://localhost:" + serverPort), 5, credentials);
+          new HttpBlobStore(new URI("http://localhost:" + serverPort), 30, credentials);
       ByteArrayOutputStream out = Mockito.spy(new ByteArrayOutputStream());
       blobStore.get("key", out);
       assertThat(out.toString(Charsets.US_ASCII.name())).isEqualTo("File Contents");
@@ -125,7 +125,7 @@
 
       Credentials credentials = newCredentials();
       HttpBlobStore blobStore =
-          new HttpBlobStore(new URI("http://localhost:" + serverPort), 5, credentials);
+          new HttpBlobStore(new URI("http://localhost:" + serverPort), 30, credentials);
       byte[] data = "File Contents".getBytes(Charsets.US_ASCII);
       ByteArrayInputStream in = new ByteArrayInputStream(data);
       blobStore.put("key", data.length, in);
@@ -153,7 +153,7 @@
 
       Credentials credentials = newCredentials();
       HttpBlobStore blobStore =
-          new HttpBlobStore(new URI("http://localhost:" + serverPort), 5, credentials);
+          new HttpBlobStore(new URI("http://localhost:" + serverPort), 30, credentials);
       blobStore.get("key", new ByteArrayOutputStream());
       fail("Exception expected.");
     } catch (Exception e) {
@@ -180,7 +180,7 @@
 
       Credentials credentials = newCredentials();
       HttpBlobStore blobStore =
-          new HttpBlobStore(new URI("http://localhost:" + serverPort), 5, credentials);
+          new HttpBlobStore(new URI("http://localhost:" + serverPort), 30, credentials);
       blobStore.put("key", 1, new ByteArrayInputStream(new byte[] {0}));
       fail("Exception expected.");
     } catch (Exception e) {

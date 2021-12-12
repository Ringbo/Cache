diff --git a/sonar-core/src/test/java/org/sonar/core/util/DefaultHttpDownloaderTest.java b/sonar-core/src/test/java/org/sonar/core/util/DefaultHttpDownloaderTest.java
index f19f42c..576d274 100644
--- a/sonar-core/src/test/java/org/sonar/core/util/DefaultHttpDownloaderTest.java
+++ b/sonar-core/src/test/java/org/sonar/core/util/DefaultHttpDownloaderTest.java
@@ -111,9 +111,9 @@
         }
       }
     });
-    SocketAddress address = socketConnection.connect(new InetSocketAddress(0));
+    SocketAddress address = socketConnection.connect(new InetSocketAddress("localhost", 0));
 
-    baseUrl = "http://0.0.0.0:" + ((InetSocketAddress) address).getPort();
+    baseUrl = String.format("http://%s:%d", ((InetSocketAddress) address).getAddress().getHostAddress(), ((InetSocketAddress) address).getPort());
   }
 
   @AfterClass
@@ -197,7 +197,7 @@
     File toFile = new File(toDir, "downloadToFile.txt");
 
     try {
-      int port = new InetSocketAddress(0).getPort();
+      int port = new InetSocketAddress("localhost", 0).getPort();
       new DefaultHttpDownloader(new Settings()).download(new URI("http://localhost:" + port), toFile);
     } catch (SonarException e) {
       assertThat(toFile).doesNotExist();

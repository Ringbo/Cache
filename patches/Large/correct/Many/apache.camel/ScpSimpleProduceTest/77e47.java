diff --git a/components/camel-jsch/src/test/java/org/apache/camel/component/jsch/ScpSimpleProduceTest.java b/components/camel-jsch/src/test/java/org/apache/camel/component/jsch/ScpSimpleProduceTest.java
index 5bd1885..803eda2 100644
--- a/components/camel-jsch/src/test/java/org/apache/camel/component/jsch/ScpSimpleProduceTest.java
+++ b/components/camel-jsch/src/test/java/org/apache/camel/component/jsch/ScpSimpleProduceTest.java
@@ -35,7 +35,7 @@
 
         String uri = getScpUri() + "?username=admin&password=admin&knownHostsFile=" + getKnownHostsFile();
         template.sendBodyAndHeader(uri, "Hello World", Exchange.FILE_NAME, "hello.txt");
-        Thread.sleep(100);
+        Thread.sleep(200);
 
         File file = new File(getScpPath() + "/hello.txt");
         assertFileExists(file.getAbsolutePath());
@@ -48,7 +48,7 @@
 
         String uri = getScpUri() + "?username=admin&password=admin&knownHostsFile=" + getKnownHostsFile();
         template.sendBodyAndHeader(uri, "Bye World", Exchange.FILE_NAME, "mysub/bye.txt");
-        Thread.sleep(100);
+        Thread.sleep(200);
 
         File file = new File(getScpPath() + "/mysub/bye.txt");
         assertFileExists(file.getAbsolutePath());
@@ -61,7 +61,7 @@
 
         String uri = getScpUri() + "?username=admin&password=admin&knownHostsFile=" + getKnownHostsFile();
         template.sendBodyAndHeader(uri, "Farewell World", Exchange.FILE_NAME, "mysub/mysubsub/farewell.txt");
-        Thread.sleep(100);
+        Thread.sleep(200);
 
         File file = new File(getScpPath() + "/mysub/mysubsub/farewell.txt");
         assertFileExists(file.getAbsolutePath());
@@ -74,7 +74,7 @@
 
         String uri = getScpUri() + "?username=admin&password=admin&chmod=640&knownHostsFile=" + getKnownHostsFile();
         template.sendBodyAndHeader(uri, "Bonjour Monde", Exchange.FILE_NAME, "monde.txt");
-        Thread.sleep(100);
+        Thread.sleep(200);
 
         File file = new File(getScpPath() + "/monde.txt");
         assertFileExists(file.getAbsolutePath());
@@ -89,7 +89,7 @@
 
         String uri = getScpUri() + "?username=admin&privateKeyFile=src/test/resources/camel-key.priv&privateKeyFilePassphrase=password&knownHostsFile=" + getKnownHostsFile();
         template.sendBodyAndHeader(uri, "Hallo Welt", Exchange.FILE_NAME, "welt.txt");
-        Thread.sleep(100);
+        Thread.sleep(200);
 
         File file = new File(getScpPath() + "/welt.txt");
         assertFileExists(file.getAbsolutePath());

diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/WebServiceSampler.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/WebServiceSampler.java
index d7c9680..0b439ce 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/WebServiceSampler.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/WebServiceSampler.java
@@ -580,7 +580,7 @@
         catch (MalformedURLException exception){
             // keep this debug, since a bad URL, means the
             // soap driver can't get to it anyways
-            log.debug(exception.getMessage());
+            log.warn(exception.getMessage());
         }
         catch (IOException exception){
             // if the Webservice is unable or the stream
@@ -591,7 +591,7 @@
             // keep this one debug, since it means soap isn't
             // able to parse the document, so it can't continue
             // anyways
-            log.debug(exception.getMessage());
+            log.warn(exception.getMessage());
         }
 		return RESULT;
     }

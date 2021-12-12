diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampleResult.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampleResult.java
index 48e98ca..9948eb0 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampleResult.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampleResult.java
@@ -223,7 +223,7 @@
                 }
             }
         }
-        return super.getDataEncodingWithDefault(DEFAULT_HTTP_ENCODING);
+        return super.getDataEncodingWithDefault(DEFAULT_ENCODING);
     }
 
     public void setResponseNoContent(){

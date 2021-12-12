diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler2.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler2.java
index 9ea5380..f208fd2 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler2.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler2.java
@@ -31,7 +31,7 @@
     private final transient HTTPAbstractImpl hc;
     
     public HTTPSampler2(){
-        hc = new HTTPJavaImpl(this);
+        hc = new HTTPHC3Impl(this);
     }
 
     public boolean interrupt() {

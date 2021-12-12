diff --git a/src/core/org/apache/jmeter/samplers/SampleResult.java b/src/core/org/apache/jmeter/samplers/SampleResult.java
index a5b522a..2f96a10 100644
--- a/src/core/org/apache/jmeter/samplers/SampleResult.java
+++ b/src/core/org/apache/jmeter/samplers/SampleResult.java
@@ -711,7 +711,7 @@
             responseData = response.getBytes(getDataEncodingWithDefault());
         } catch (UnsupportedEncodingException e) {
             log.warn("Could not convert string, using default encoding. "+e.getLocalizedMessage());
-            responseData = response.getBytes(); // N.B. default charset is used deliberately here
+            responseData = response.getBytes(Charset.defaultCharset()); // N.B. default charset is used deliberately here
         }
     }
 
@@ -731,7 +731,7 @@
         } catch (UnsupportedEncodingException e) {
             log.warn("Could not convert string using '"+encodeUsing+
                     "', using default encoding: "+DEFAULT_CHARSET,e);
-            responseData = response.getBytes(); // N.B. default charset is used deliberately here
+            responseData = response.getBytes(Charset.defaultCharset()); // N.B. default charset is used deliberately here
             setDataEncoding(DEFAULT_CHARSET);
         }
     }
@@ -763,7 +763,7 @@
             return responseDataAsString;
         } catch (UnsupportedEncodingException e) {
             log.warn("Using platform default as "+getDataEncodingWithDefault()+" caused "+e);
-            return new String(responseData); // N.B. default charset is used deliberately here
+            return new String(responseData,Charset.defaultCharset()); // N.B. default charset is used deliberately here
         }
     }
 

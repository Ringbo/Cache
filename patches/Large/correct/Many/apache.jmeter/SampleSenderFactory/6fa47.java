diff --git a/src/core/org/apache/jmeter/samplers/SampleSenderFactory.java b/src/core/org/apache/jmeter/samplers/SampleSenderFactory.java
index d55ba4d..7fb9918 100644
--- a/src/core/org/apache/jmeter/samplers/SampleSenderFactory.java
+++ b/src/core/org/apache/jmeter/samplers/SampleSenderFactory.java
@@ -80,7 +80,7 @@
             } catch (Exception e) {
                 // houston we have a problem !!
                 log.error("Unable to create a sample sender from class "+type);
-                throw new IllegalArgumentException(e.getMessage());
+                throw new IllegalArgumentException(e.getMessage(), e);
             }
 
             return s;

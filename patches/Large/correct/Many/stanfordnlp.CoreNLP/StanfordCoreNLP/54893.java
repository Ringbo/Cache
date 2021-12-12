diff --git a/src/edu/stanford/nlp/pipeline/StanfordCoreNLP.java b/src/edu/stanford/nlp/pipeline/StanfordCoreNLP.java
index c0cd4a8..3faee85 100644
--- a/src/edu/stanford/nlp/pipeline/StanfordCoreNLP.java
+++ b/src/edu/stanford/nlp/pipeline/StanfordCoreNLP.java
@@ -556,7 +556,7 @@
             property.substring(CUSTOM_ANNOTATOR_PREFIX.length());
         final String customClassName = inputProps.getProperty(property);
         logger.info("Registering annotator " + customName + " with class " + customClassName);
-        pool.register(customName, inputProps, Lazy.of(() -> annotatorImplementation.custom(inputProps, customName)));
+        pool.register(customName, inputProps, Lazy.of(() -> annotatorImplementation.custom(inputProps, property)));
       }
     }
   }
